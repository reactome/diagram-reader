package org.reactome.server.tools.diagram.data;


import org.junit.jupiter.api.*;
import org.reactome.server.tools.diagram.data.exception.DeserializationException;
import org.reactome.server.tools.diagram.data.fireworks.graph.FireworksGraph;
import org.reactome.server.tools.diagram.data.fireworks.profile.FireworksProfile;
import org.reactome.server.tools.diagram.data.graph.Graph;
import org.reactome.server.tools.diagram.data.layout.Diagram;
import org.reactome.server.tools.diagram.data.profile.diagram.DiagramProfile;
import org.reactome.server.tools.diagram.data.profile.analysis.AnalysisProfile;
import org.reactome.server.tools.diagram.data.profile.interactors.InteractorProfile;


import javax.net.ssl.*;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit testing.
 */
@TestMethodOrder(MethodOrderer.MethodName.class)
public class AppTest {

    private static String BASE_URL = "https://reactome.org/download/current/";
    private static String DIAGRAM_BASE_URL = BASE_URL + "diagram/";
    private static String FIREWORKS_BASE_URL = BASE_URL + "fireworks/";

    private static String DIAGRAM_ID = "R-HSA-186712"; //Stable Id or DBId
    private static String SUFFIX = ".json";
    private static String MODERN_PROFILE = "Modern";
    private static String STANDARD_PROFILE = "Standard";

    private static String ANALYSIS_PROFILE_1 = "profile_01";
    private static String ANALYSIS_PROFILE_2 = "profile_02";
    private static String ANALYSIS_PROFILE_3 = "profile_03";

    private static String INTERACTORS_PROFILE_1 = "interactor_profile_01";
    private static String INTERACTORS_PROFILE_2 = "interactor_profile_02";

    private static String FIREWORKS_HOMO_SAPIENS = "Homo_sapiens";
    private static Long HOMO_SAPIENS_ID = 48887L;

    private static String FIREWORKS_PROFILE_1 = "fireworks_profile_01";
    private static String FIREWORKS_PROFILE_2 = "fireworks_profile_02";
    private static String FIREWORKS_PROFILE_3 = "fireworks_profile_03";
    private static String FIREWORKS_PROFILE_4 = "fireworks_profile_04";

    static TrustManager[] trustAllCerts;

    @BeforeEach
    public void setUp() {
        overrideCertificateCheck();
    }

    /**
     * Diagram Test :-)
     */
    @Test
    public void testDiagram() {
        System.out.print("Testing diagram[" + DIAGRAM_ID + "]...");
        String url = DIAGRAM_BASE_URL + DIAGRAM_ID + SUFFIX;
        try {
            String json = readFromURL(url);
            Diagram diagram = DiagramFactory.getDiagram(json);
            assertNotNull(diagram);
            Assertions.assertEquals(DIAGRAM_ID, diagram.getStableId());
            System.out.print("OK\n");
        } catch (IOException e) {
            Assertions.fail("Could not retrieve diagram from: " + url);
            e.printStackTrace();
        } catch (DeserializationException e) {
            Assertions.fail();
            e.printStackTrace();
        }
    }

    /**
     * Graph Test :-)
     */
    @Test
    public void testGraph() {
        System.out.print("Testing graph[" + DIAGRAM_ID + "] ...");
        String url = DIAGRAM_BASE_URL + DIAGRAM_ID + ".graph" + SUFFIX;
        try {
            String json = readFromURL(url);
            Graph graph = DiagramFactory.getGraph(json);
            assertNotNull(graph);
            System.out.print("OK\n");
        } catch (IOException e) {
            Assertions.fail("Could not retrieve graph from: " + url);
            e.printStackTrace();
        } catch (DeserializationException e) {
            Assertions.fail();
            e.printStackTrace();
        }
    }

    /**
     * Profile Tests :-)
     */
    @Test
    public void testDiagramProfile() {
        String profileName = MODERN_PROFILE + ".json";
        System.out.print("Testing diagram colour profile[" + profileName + "] ...");
        try {
            String json = readFile(profileName);
            DiagramProfile profile = DiagramFactory.getProfile(json);
            assertNotNull(profile);
            assertEquals(MODERN_PROFILE, profile.getName());
            System.out.print("OK\n");
        } catch (IOException e) {
            Assertions.fail("Could not retrieve profile: " + profileName);
        } catch (DeserializationException e) {
            Assertions.fail();
            e.printStackTrace();
        } catch (URISyntaxException e) {
            Assertions.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testAnalysisProfile() {
        String profileName = ANALYSIS_PROFILE_1 + ".json";
        try {
            String json = readFile(profileName);
            AnalysisProfile profile = DiagramFactory.getAnalysisProfile(json);
            assertNotNull(profile);
            System.out.println("Testing analysis colour profile[" + profileName + " : " + profile.getName() + "] ... OK");
        } catch (IOException e) {
            Assertions.fail("Could not retrieve profile: " + profileName);
        } catch (DeserializationException e) {
            Assertions.fail();
            e.printStackTrace();
        } catch (URISyntaxException e) {
            Assertions.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testInteractorsProfile() {
        String profileName = INTERACTORS_PROFILE_1 + ".json";
        try {
            String json = readFile(profileName);
            InteractorProfile profile = DiagramFactory.getInteractorsProfile(json);
            assertNotNull(profile);
            System.out.println("Testing interactor colour profile[" + profileName + " : " + profile.getName() + "] ... OK");
        } catch (IOException e) {
            Assertions.fail("Could not retrieve profile: " + profileName);
        } catch (DeserializationException e) {
            e.printStackTrace();
            Assertions.fail();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    /**
     * Fireworks layout test :-)
     */
    @Test
    public void testFireworks() {
        System.out.print("Testing Fireworks[" + FIREWORKS_HOMO_SAPIENS + "]...");
        String url = FIREWORKS_BASE_URL + FIREWORKS_HOMO_SAPIENS + SUFFIX;
        try {
            String json = readFromURL(url);
            FireworksGraph fireworks = FireworksFactory.getGraph(json);
            assertNotNull(fireworks);
            assertEquals(HOMO_SAPIENS_ID, fireworks.getSpeciesId());
            System.out.print("OK\n");
        } catch (IOException e) {
            Assertions.fail("Could not retrieve fireworks layout from: " + url);
            e.printStackTrace();
        } catch (DeserializationException e) {
            Assertions.fail();
            e.printStackTrace();
        }
    }

    /**
     * Fireworks profile Tests :-)
     */
    @Test
    public void testFireworksProfile() {
        String profileName = FIREWORKS_PROFILE_1 + ".json";
        System.out.print("Testing fireworks colour profile[" + profileName + "] ...");
        try {
            String json = readFile(profileName);
            FireworksProfile profile = FireworksFactory.getProfile(json);
            assertNotNull(profile);
            assertEquals("Copper", profile.getName());
            System.out.print("OK\n");
        } catch (IOException e) {
            Assertions.fail("Could not retrieve profile: " + profileName);
        } catch (DeserializationException e) {
            Assertions.fail();
            e.printStackTrace();
        } catch (URISyntaxException e) {
            Assertions.fail();
            e.printStackTrace();
        }
    }

    private static String readFromURL(String endpoint) throws IOException {
        URL url = new URL(endpoint);
        HttpsURLConnection httpURLConnection = (HttpsURLConnection) url.openConnection();
        httpURLConnection.connect();
        InputStream in = httpURLConnection.getInputStream();
        return new BufferedReader(new InputStreamReader(in))
                .lines().collect(Collectors.joining("\n"));
    }

    private static String readFile(String filename) throws IOException, URISyntaxException {
        return new String(Files.readAllBytes(Paths.get(AppTest.class.getResource(filename).toURI())));
    }

    /**
     * Overrides the check and accept an untrusted certificate
     * <p>
     * Fix for
     * Exception in thread "main" javax.net.ssl.SSLHandshakeException:
     * sun.security.validator.ValidatorException:
     * PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException:
     * unable to find valid certification path to requested target
     */
    private static void overrideCertificateCheck() {
        try {
            trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }

                        public void checkClientTrusted(X509Certificate[] certs, String authType) {
                        }

                        public void checkServerTrusted(X509Certificate[] certs, String authType) {
                        }

                    }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };
            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
