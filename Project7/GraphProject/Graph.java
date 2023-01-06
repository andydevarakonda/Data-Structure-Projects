import java.util.LinkedList;

public class Graph {

    // Represents the number of vertices (nodes) in the graph

    private int numVertices;

    // Stores the adjacency matrix

    private int[][] adjMatrix;

    // Stores the adjacency lists (note it is an array of LinkedLists)

    private LinkedList < Integer > [] adjListArray;

    public Graph(int[][] adjMatrix) {

        numVertices = adjMatrix.length;
        this.adjMatrix = adjMatrix; 
        generateAdjList();

    }

    private void generateAdjList() {

        adjListArray = new LinkedList[numVertices];
        for(int i = 0; i < numVertices; i++){
            adjListArray[i] = new LinkedList<Integer>(); 
            for(int j = 0; j < numVertices; j++){
                if(adjMatrix[i][j] == 1) {
                    adjListArray[i].add(j); 
                }
            }
        }

    }

    // A method to print the adjacency matrix

    public void printMatrix() {

        System.out.println("Adjacency matrix ("+numVertices+" nodes)");
        for(int i = 0; i < numVertices; i++){ 
            System.out.print("  "); 
            for(int j = 0; j < numVertices; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
        //System.out.println();
    }
    // A method to print the adjacency list
    public void printList() {

        generateAdjList();
        for(int i = 0; i < numVertices; i++){ 
            System.out.print("Adjacency vertex "+i+" : ");
            for(int j = 0; j < adjListArray[i].size(); j++){
                if (j != adjListArray[i].size()-1) {
                    System.out.print(adjListArray[i].get(j)+", ");
                }
                else  {
                    System.out.println(adjListArray[i].get(j));
                }

            }

        }
    }
}