package gradleproject;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import com.google.common.graph.*;
import java.awt.Color;



public class ReadFile {

  public static void ReadInFile() {
    String filename = "app\\src\\main\\java\\gradleproject\\TexasRoadnetworks.txt";
    File file = null;

    Scanner scanner = null;
      
    try {
      file = new File(filename);
    }
    // find exactly what exception this is supposed to be
    catch (Exception e) {
      System.out.println("Cannot locate file.");
      System.exit(-1);
    }

    try {
      scanner = new Scanner(file);
    }
    catch (Exception e){
      System.out.println("scanner not working");
      e.printStackTrace();
      System.exit(-1);
    }
    // MutableGraph<String> graph = GraphBuilder.directed().build();

    //Need to initialize nodes in text files
    // Node fromNodeID = new ReadFile(File[0]);
    // Node ToNodeID = File[1];
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
      String[] vertices = line.split("");
      System.out.println("1st node: " + vertices[0] + " 2nd node: " + vertices[2]);

      // graph.addNode(vertices[0]);
      // graph.putEdge(vertices)
      // vertices[0].addNode();
    }

    // new GraphDisplay(graph);

    scanner.close();
  }
    public static void main(String[] args) {
      ReadFile.ReadInFile();
    }
}
