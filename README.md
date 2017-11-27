[<img src=https://user-images.githubusercontent.com/6883670/31999264-976dfb86-b98a-11e7-9432-0316345a72ea.png height=75 />](https://reactome.org)

## What is the Diagram Reader?
This library provides the mechanism to deserialise pathway diagrams from their JSON format, including files that contain layout information (nodes, edges, co-ordinates, glyphs, names, shades, etc.), as well as, files containing the graph of the pathway diagram.

## How to use this library?

First add EBI Nexus repository in your pom.xml file

```html
<repositories>
    ...
    <!-- EBI repo -->
    <repository>
        <id>nexus-ebi-repo</id>
        <name>The EBI internal repository</name>
        <url>http://www.ebi.ac.uk/Tools/maven/repos/content/groups/ebi-repo/</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
    </repository>
    <!-- EBI SNAPSHOT repo -->
    <repository>
        <id>nexus-ebi-snapshot-repo</id>
        <name>The EBI internal snapshot repository</name>
        <url>http://www.ebi.ac.uk/Tools/maven/repos/content/groups/ebi-snapshots/</url>
        <releases>
            <enabled>false</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

Then add the diagram-reader dependency

```html
<dependencies>
    ...
    <dependency>
         <groupId>org.reactome.server.tools</groupId>
         <artifactId>diagram-reader</artifactId>
         <version>1.1.0</version>
    </dependency>
<dependencies>
```
### Pathway diagram examples

To unmarshall a diagram from its JSON file:

```java
String json = new String(Files.readAllBytes(Paths.get(filename)));
Diagram diagram = DiagramFactory.getDiagram(json);
```

To unmarshall a graph from its JSON file:

```java
String graphJson = new String(Files.readAllBytes(Paths.get(filename)));
Graph graph = DiagramFactory.getGraph(graphJson);
```

To unmarshall a diagram colour profile from its JSON file:

```java
String profileJson = new String(Files.readAllBytes(Paths.get(filename)));
DiagramProfile profile = DiagramFactory.getProfile(profileJson);
```

To unmarshall an analysis overlay colour profile from its JSON file:

```java
String analysisProfileJson = new String(Files.readAllBytes(Paths.get(filename)));
AnalysisProfile profile = DiagramFactory.getAnalysisProfile(analysisProfileJson);
```

To unmarshall an interactor overlay colour profile from its JSON file:

```java
String interactorsProfileJson = new String(Files.readAllBytes(Paths.get(filename)));
InteractorProfile profile = DiagramFactory.getInteractorsProfile(interactorsProfileJson);
```

### Pathways overview examples

To unmarshall a Pathways overview (a.k.a Fireworks) graph from its JSON file:

```java
String json = new String(Files.readAllBytes(Paths.get(filename)));
FireworksGraph fireworks = FireworksFactory.getGraph(json);
```

To unmarshall a Pathways overview colour profile from its JSON file:

```java
String json = new String(Files.readAllBytes(Paths.get(filename)));
FireworksProfile profile = FireworksFactory.getProfile(json);
```