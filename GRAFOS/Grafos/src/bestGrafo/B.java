package bestGrafo;

import java.util.HashMap;
import java.util.Map;

public class B {

    public static void main(String[] args) throws InterruptedException {
        double Inicio, Fin,Inicio2, Fin2,Inicio3,Fin3;
        Inicio = System.currentTimeMillis();
        GraphUno();
        Fin = System.currentTimeMillis();
//        //ojo
        Inicio2 = System.currentTimeMillis();
        GraphTwo();
        Fin2 = System.currentTimeMillis();
        //ojo
        Inicio3=System.currentTimeMillis();
        GraphDiabolic();
        Fin3=System.currentTimeMillis();
        
        Thread.sleep(2000);
        System.err.println("\nThe Time for the first graph is: " + (Fin - Inicio));
        System.err.println("\nThe Time for the second graph is: " + (Fin2 - Inicio2));
        System.err.println("\nThe Time for the third graph is: " + (Fin3 - Inicio3) + "\n");
    }
    private static void GraphDiabolic(){
        //Compro
        Graph theGraph= new Graph(26);
        //creación de graph
        theGraph.addVertex('A');//0
        theGraph.addVertex('B');//1
        theGraph.addVertex('C');//2
        theGraph.addVertex('D');//3
        theGraph.addVertex('E');//4
        theGraph.addVertex('F');//5
        theGraph.addVertex('G');//6
        theGraph.addVertex('H');//7
        theGraph.addVertex('I');//8
        theGraph.addVertex('J');//9
        theGraph.addVertex('K');//10
        theGraph.addVertex('L');//11
        theGraph.addVertex('M');//12
        theGraph.addVertex('N');//13
        theGraph.addVertex('O');//14
        theGraph.addVertex('P');//15
        theGraph.addVertex('Q');//16
        theGraph.addVertex('R');//17
        theGraph.addVertex('S');//18
        theGraph.addVertex('T');//19
        theGraph.addVertex('U');//20
        theGraph.addVertex('V');//21
        theGraph.addVertex('w');//22
        theGraph.addVertex('X');//23
        theGraph.addVertex('Y');//24
        theGraph.addVertex('Z');//25
        //LOS ARCOS
        theGraph.addEdge(0, 1, 2);
        theGraph.addEdge(0, 3, 4);
        theGraph.addEdge(0, 20, 3);
        theGraph.addEdge(1, 2, 5);
        theGraph.addEdge(1, 15, 2);
        theGraph.addEdge(1, 20, 2);
        theGraph.addEdge(1, 25, 3);
        theGraph.addEdge(2, 22, 10);
        theGraph.addEdge(3, 4, 2);
        theGraph.addEdge(3, 9, 5);
        theGraph.addEdge(3, 8, 7);
        theGraph.addEdge(4, 17, 2);
        theGraph.addEdge(4, 22, 6);
        theGraph.addEdge(6, 10, 20);
        theGraph.addEdge(7, 19, 2);
        theGraph.addEdge(7, 23, 6);
        theGraph.addEdge(8, 24, 1);
        theGraph.addEdge(10, 11, 2);
        theGraph.addEdge(10, 21, 3);
        theGraph.addEdge(11, 22, 4);
        theGraph.addEdge(12, 2, 6);
        theGraph.addEdge(12, 9, 3);
        theGraph.addEdge(12, 4, 6);
        theGraph.addEdge(13, 1, 2);
        theGraph.addEdge(13, 23, 4);
        theGraph.addEdge(14, 18, 7);
        theGraph.addEdge(15, 6, 2);
        theGraph.addEdge(15, 20, 2);
        theGraph.addEdge(15, 2, 9);
        theGraph.addEdge(16, 0, 1);
        theGraph.addEdge(16, 2, 9);
        theGraph.addEdge(17, 18, 3);
        theGraph.addEdge(17, 9, 3);
        theGraph.addEdge(17, 25, 4);
        theGraph.addEdge(19, 1, 3);
        theGraph.addEdge(19, 20, 1);
        theGraph.addEdge(19, 21, 3);
        theGraph.addEdge(20, 22, 2);
        theGraph.addEdge(21, 3, 2);
        theGraph.addEdge(22, 4, 6);
        theGraph.addEdge(23, 18, 3);
        theGraph.addEdge(24, 3, 6);
        //The graph
        System.out.println("\nThe Graph: ");
        theGraph.dispGraph();
        System.out.println("\nAdjacency matrix: ");
        //estado matrix
        theGraph.matrix();
    }
    public static void GraphTwo() {
        // dirigido
        Graph theGraph = new Graph(11);
        //creacion de los nodos como tal
        theGraph.addVertex('A');//0
        theGraph.addVertex('B');//1
        theGraph.addVertex('C');//2
        theGraph.addVertex('D');//3
        theGraph.addVertex('E');//4
        theGraph.addVertex('F');//5
        theGraph.addVertex('G');//6
        theGraph.addVertex('H');//7
        theGraph.addVertex('I');//8
        theGraph.addVertex('J');//9
        theGraph.addVertex('K');//10

        //creacion de los arcos
        theGraph.addEdge(0, 1, 3);
        theGraph.addEdge(1, 0, 8);
        theGraph.addEdge(1, 3, 6);
        theGraph.addEdge(1, 5, 2);
        theGraph.addEdge(2, 1, 7);
        theGraph.addEdge(2, 4, 6);
        theGraph.addEdge(3, 5, 2);
        theGraph.addEdge(4, 6, 4);
        theGraph.addEdge(5, 6, 6);
        theGraph.addEdge(6, 1, 2);
        theGraph.addEdge(6, 4, 9);
        theGraph.addEdge(7, 2, 2);
        theGraph.addEdge(8, 3, 1);
        theGraph.addEdge(9, 3, 3);
        theGraph.addEdge(9, 8, 2);
        theGraph.addEdge(10, 2, 3);
        theGraph.addEdge(10, 10, 2);

        //The graph
        System.out.println("\nThe Graph: ");
        theGraph.dispGraph();
        System.out.println("\nAdjacency matrix: ");
        //estado matrix
        theGraph.matrix();
    }

    public static void GraphUno() {
        // dirigido
        Graph theGraph = new Graph(7);
        //creacion de los nodos como tal
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addVertex('F');
        theGraph.addVertex('G');

        //creacion de los arcos
        theGraph.addEdge(0, 1, 3);
        theGraph.addEdge(0, 2, 8);
        theGraph.addEdge(1, 3, 6);
        theGraph.addEdge(1, 5, 2);
        theGraph.addEdge(2, 1, 7);
        theGraph.addEdge(2, 4, 6);
        theGraph.addEdge(3, 5, 2);
        theGraph.addEdge(4, 6, 4);
        theGraph.addEdge(5, 6, 6);

        //The graph
        System.out.println("The Graph: ");
        theGraph.dispGraph();
        System.out.println("\nAdjacency matrix: ");
        //estado matrix
        theGraph.matrix();
    }

    public static class Graph {

        private int MAX_VERTS;
        private Vertex VertexList[];
        private int adjMat[][];
        private int value[][];
        private int nVerts;
//        mapa a= new mapa();
        //LO DEL MAPA
        private Map<String, Long> k2p3;

//        public mapa(){
//            k2p3= new HashMap<String, Long>();
//        }
//        
//        public void Enter(String key, long val) {
//            k2p3.put(key, val);
//        }
//
//        public long dev(String keyString) {
//            return k2p3.get(keyString);
//        }
        //FIN  DE LO DEL MAPA
        public Graph(int MAX_VALUE) {
            this.MAX_VERTS = MAX_VALUE;
            VertexList = new Vertex[MAX_VERTS];
            adjMat = new int[MAX_VERTS][MAX_VERTS];
            value = new int[MAX_VERTS][MAX_VERTS];
            nVerts = 0;
            k2p3 = new HashMap<String, Long>();
        }

        public void addVertex(char lab) {
            VertexList[nVerts++] = new Vertex(lab);
        }

        public void addEdge(int start, int end, long peso) {
            adjMat[start][end] = 1;
//            value[start][end] = peso;
            k2p3.put(start + "," + end, peso);
        }

        public void displayVertx(int v) {
            System.out.print(VertexList[v].Label);
        }

        public void matrix() {
            for (int i = 0; i < adjMat.length; i++) {
                System.out.print(VertexList[i].Label + "| ");
                for (int j = 0; j < adjMat.length; j++) {
                    System.out.print(adjMat[i][j] + "  ");
                }
                System.out.println("");
            }
        }

        public void dispGraph() {
//            System.out.println("Graph completo");
            for (int i = 0; i < adjMat.length; i++) {
                for (int j = 0; j < adjMat.length; j++) {
                    if (adjMat[i][j] == 1) {
//                        System.out.prit("["+VertexList[i].Label+"] "+"["+VertexList[j].Label+"]\n");
                        System.out.print("[");
                        displayVertx(i);
                        System.out.print("]-" + k2p3.get(i + "," + j) + "->[");
                        displayVertx(j);
                        System.out.print("]\n");
                    }
                }
            }
        }
    }
//le enviamos el mapa

    public static class Vertex {

        public char Label;

        public Vertex(char lab) {
            Label = lab;
        }
    }

//    public static  class mapa{
//        private Map<String, Long> k2p3; 
//        
//        public mapa(){
//            k2p3= new HashMap<String, Long>();
//        }
//        
//        public void Enter(String key,long val){
//            k2p3.put(key, val);
//        }
//        public long dev(String keyString){
//            return k2p3.get(keyString);
//        }
//    }
//    public static class mapa {
//
//        private static void contarLetras(String b) {
//            CounLetras map = new CounLetras();//objeto contabilizador, para llevar el "contador de las letras"
//            map.contabiliza(b);
//            Map<String, Long> ocurrencias = map.getOcurrencias();//la interfáz map
//
//            Set<String> keys = ocurrencias.keySet();//identifica de forma úncia, como en la base de datos... sin claves iguales, podemos dejar una clave vasia pero nunca repetida
//            Iterator<String> iterator = keys.iterator();//los iteradores son
//            String key = null;
//            //es como almacenar información en una tabla como de 2 columnas, la key o clave identifica el valor
//            while (iterator.hasNext()) {
//                key = iterator.next();
//                System.out.println("\tkey: [" + key + "] valor: [" + ocurrencias.get(key) + "]");//ojo get obtiene valor con la clave
//            }
//        }
//
//        public static class CounLetras {
//
//            private Map<String, Long> ocurrencias; //Map porque son... recive la clave y el valor, la clave es lo que se nos ocurra
//
//            public CounLetras() {
//                ocurrencias = new HashMap<String, Long>();//el hash map que se deriva de la categoría map
//            }
//
//             public void contabiliza(String linea) {
//                for (int i = 0; i < linea.length(); i++) {
//                    if (null == ocurrencias.get("" + linea.charAt(i))) {
//                        ocurrencias.put("" + linea.charAt(i), 1L);//recive la clave y el valor...
//                    } else {
//                        Long valor = ocurrencias.get("" + linea.charAt(i));
//                        valor++;
//                        ocurrencias.put("" + linea.charAt(i), valor);//ojo con el valor
//                    }
//                }
//            }
//
//            public Map<String, Long> getOcurrencias() {
//                return ocurrencias;
//            }
//        }
//    }
}
