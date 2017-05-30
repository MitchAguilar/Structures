package bestGrafo;

public class A {

    public static void main(String[] args) {
        //No dirigido
        
        
        Graph theGraph = new Graph();
        //creacion de los nodos como tal
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addVertex('F');

        //creacion de los arcos
        theGraph.addEdge(0, 1);
        theGraph.addEdge(0, 2);
        //theGraph.addEdge(0, 3);
        //theGraph.addEdge(0, 4);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(1, 3);
        //theGraph.addEdge(1, 4);
        theGraph.addEdge(2, 5);
        theGraph.addEdge(3, 4);
        theGraph.addEdge(4, 5);

        //
//        theGraph.displayVertx(2);
        //
        theGraph.dispGraph();
    }

    public static class Graph {

        private final int MAX_VERTS = 10;
        private Vertex VertexList[];
        private int adjMat[][];
        private int nVerts;

        public Graph() {
            VertexList = new Vertex[MAX_VERTS];
            adjMat = new int[MAX_VERTS][MAX_VERTS];
            nVerts = 0;
        }

        public void addVertex(char lab) {
            VertexList[nVerts++] = new Vertex(lab);
        }

        public void addEdge(int start, int end) {
            adjMat[end][start] = adjMat[start][end] = 1;
        }

        public void displayVertx(int v) {
            System.out.print(VertexList[v - 2].Label);
        }

        public void dispGraph() {
//            System.out.println("Graph completo");
            for (int i = 1; i < adjMat.length; i++) {
                for (int j = 1; j < adjMat.length; j++) {
                    if (adjMat[i][j] == 1) {
                        System.out.print("["+VertexList[i-1].Label+"] "+" ["+VertexList[j-1].Label+"]\n");
//                          displayVertx(i);
//                          displayVertx(j);
//                          System.out.println("");
                    }
                }
            }
        }
    }

    public static class Vertex {

        public char Label;

        public Vertex(char lab) {
            Label = lab;
        }
    }
}
