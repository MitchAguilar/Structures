package bestGrafo;

public class B {

    public static void main(String[] args) {
        // dirigido

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
        theGraph.addEdge(0, 3);

        //The graph
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
            adjMat[start][end] = 1;
        }

        public void displayVertx(int v) {
            System.out.print(VertexList[v].Label);
        }

        public void dispGraph() {
//            System.out.println("Graph completo");
            for (int i = 0; i < adjMat.length; i++) {
                for (int j = 0; j < adjMat.length; j++) {
                    if (adjMat[i][j] == 1) {
//                        System.out.print("["+VertexList[i].Label+"] "+"["+VertexList[j].Label+"]\n");
                        displayVertx(i);
                        displayVertx(j);
                        System.out.println("");
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
