import java.util.ArrayList;

public class Graph {
        ArrayList<Node> nodes;
        int [][] matrix;
        Graph(int size){
            nodes = new ArrayList<>();
            matrix = new int[size][size];
        }
        public void addNode(Node node){

            nodes.add(node);
        }
        public void addEdge(int source, int destination){
            matrix[source][ destination] = 1;

        }
        public boolean checkEdge(int source, int destination){
            if(matrix[source][ destination] == 1){
                return true;

            }else{
                return false;
            }
        }
        public void printNode(){

            System.out.print("\t");
            for (Node node: nodes ) {
                System.out.print(node.data + "\t");

            }
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(nodes.get(i).data + "\t");
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]+ "\t");
                }
                System.out.println();
            }
        }
}
