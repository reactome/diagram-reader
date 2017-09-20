<img src=https://cloud.githubusercontent.com/assets/6883670/22938783/bbef4474-f2d4-11e6-92a5-07c1a6964491.png width=220 height=100 />

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
