package bestGrafo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
        System.out.println("the Graph: ");
        theGraph.dispGraph();
        System.out.println("Adjacency matrix: ");
        //estado matrix
        theGraph.matrix();
    }

    public static class Graph {

        private final int MAX_VERTS = 10;
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
        public Graph() {
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
