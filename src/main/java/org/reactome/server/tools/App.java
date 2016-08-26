package org.reactome.server.tools;

import org.reactome.server.tools.diagram.data.DiagramFactory;
import org.reactome.server.tools.diagram.data.graph.raw.Graph;
import org.reactome.server.tools.diagram.data.graph.raw.factory.GraphObjectsFactory;
import org.reactome.server.tools.diagram.data.exception.DeserializationException;
import org.reactome.server.tools.diagram.data.layout.Diagram;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        File f = new File("/Users/ksidis/diagram/static/15869.json");
//        File f = new File("/Users/ksidis/diagram/static/15869.graph.json");
        String json = null;
        try {
            json = readFile(f.getAbsolutePath());
            System.out.println(json);
            Graph g = DiagramFactory.getGraph(json);
            System.out.println(g.getNodes().get(0).getParents());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DeserializationException e) {
            e.printStackTrace();
        }


    }

    public static String readFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
}
