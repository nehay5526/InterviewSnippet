package 
import java.util.*;
import java.util.concurrent.*;
public class Graph{
    private final int MAX_VERTEX = 15;
  private Vertex arrayOfVertex[]; //cities
  private Map<String,Integer> mapOfVertex;
  //matrix of adjacent vertex:
  private int matrixOfAdjVertex[][];
  //register the location at the arrayOfVertex:
  private int numOfVertices;
  private Stack stack;

  public Graph() {
    arrayOfVertex = new Vertex[MAX_VERTEX];
    mapOfVertex = new ConcurrentHashMap<>();
    numOfVertices = 0;
    matrixOfAdjVertex = new int[MAX_VERTEX][MAX_VERTEX];
    stack = new Stack<>();
    //initialize matrix
    for (int i = 0; i < MAX_VERTEX; i++) {
      for (int j = 0; j < MAX_VERTEX; j++) {
        matrixOfAdjVertex[i][j] = 0;
      }
    }
  }
    public void addVertex(Vertex city) {
        mapOfVertex.put(city.getName(), numOfVertices);
        arrayOfVertex[numOfVertices++] =city;
      }
    public void addEdge(String city1, String city2) {
        int start = mapOfVertex.get(city1);
        int end = mapOfVertex.get(city2);
        matrixOfAdjVertex[start][end] =1;
        matrixOfAdjVertex[end][start] =1;
    }

    public void dfs(String city) {
        int vertex = mapOfVertex.get(city);
        arrayOfVertex[vertex].setIsVisited(true);
        System.out.print(city + " ");
        stack.push(vertex);
    
        while (!stack.isEmpty()) {
          int adjVertex = getAdjVertex((int)stack.peek());
          if (adjVertex != -1) {
            arrayOfVertex[adjVertex].setIsVisited(true);
            System.out.print(
                arrayOfVertex[adjVertex].getName() + " ");
            stack.push(adjVertex);
          } else {
            stack.pop();
          }
        }
      }

      private int getAdjVertex(int vertex) {
        for (int adj=0; adj<numOfVertices; adj++) {
           if (matrixOfAdjVertex[vertex][adj] ==1 &&
               arrayOfVertex[adj].getIsVisited() ==false)
               return adj; //return first adjacent vertex
           }
           return -1; //not vertices found
        }
    public static void main(String... args){
        Graph graph = new Graph();
        String city1="a";
        String city2="b";
        String city3="c";
        String city4="d";
        String city5="e";
        String city6="f";
        String city7="g";
        String city8="h";
        String city9="i";
        String city10="j"; 
        String city11="k";
        String city12="l";
        graph.addVertex(new Vertex(city1));
        graph.addVertex(new Vertex(city2));
        graph.addVertex(new Vertex(city3));
        graph.addVertex(new Vertex(city4));
        graph.addVertex(new Vertex(city5));
        graph.addVertex(new Vertex(city6));
        graph.addVertex(new Vertex(city7));
        graph.addVertex(new Vertex(city8));
        graph.addVertex(new Vertex(city9));
        graph.addVertex(new Vertex(city10));
        graph.addVertex(new Vertex(city11));
        graph.addVertex(new Vertex(city12));
        graph.addEdge(city1,city2);
        graph.addEdge(city2,city3);
        graph.addEdge(city3,city4);
        graph.addEdge(city4,city10);
        graph.addEdge(city11,city5);
        graph.addEdge(city5,city7);
        graph.addEdge(city7,city8);
        graph.addEdge(city8,city9);
        graph.addEdge(city1,city6);
        graph.addEdge(city1,city11);
        graph.addEdge(city5,city12);
        graph.dfs(city1);
    }
}