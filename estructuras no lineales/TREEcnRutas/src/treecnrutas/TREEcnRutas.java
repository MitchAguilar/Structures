package treecnrutas;

public class TREEcnRutas {

    public static void main(String[] args) {
        tree a = new tree();
        a.insert('m', 344.4);

        a.insert('f', 344.4);
        a.insert('c', 344.4);
        a.insert('a', 344.4);
        a.insert('h', 344.4);
        a.insert('g', 344.4);
        a.insert('p', 344.4);
        a.insert('v', 344.4);
        a.insert('z', 344.4);

        System.out.print("pos:        ");
        a.posoreder(a.root);
        System.out.println("");
        a.posor(a.root);
    }

    public static class Node {

        public char idata;
        public double ddata;
        public Node izquierda;
        public Node derecha;

        public Node() {

        }

        public Node(char i, double d) {
            idata = i;
            ddata = d;
        }

        public void displayNode() {
            System.out.println("[" + idata + "," + ddata + "] ");
        }
    }

    public static class tree {

        private Node root;

        public tree() {
            root = null;
        }

        public void posor(Node localroot) {
           
            if (localroot != null) {
                Node aux = root;
                while (true) {
                    Node temp = aux;
                    System.out.print(aux.idata+"-");
                    if(temp.izquierda!=null){
                        aux=temp.izquierda;
                    }else{
                        break;
                    }
                }
                System.out.println("");
                Node aux2=root;
                while (true) {
                    Node temp = aux2;
                    System.out.print(aux2.idata+"-");
                    if(temp.derecha!=null){
                        aux2=temp.derecha;
                    }else{
                        if(aux2.derecha==null){
                            
                        }else{
                            
                        }
                    }
                }
            }
//                posoreder(localroot.derecha);

//            Node aux = root;
//            while (true) {
//                Node temp = aux;
//                if(aux.idata<temp.idata){
//                    System.out.println(aux.idata+"-");
//                    temp.izquierda=aux;
//                }else{
//                    break;
//                }
//            }
        }

        public void mostrarreco() {
//            Node aux=root;
//            if(){
//                
//            }
        }

        public void insert(char id, double dd) {//funciona
            Node nuevo = new Node(id, dd);
            if (root == null) {
                root = nuevo;
            } else {
                Node aux = root;
                Node temp;
                while (true) {
                    temp = aux;
                    if (id < aux.idata) {
                        aux = aux.izquierda;
                        if (aux == null) {
                            temp.izquierda = nuevo;
                            return;
                        }
                    } else {
                        aux = aux.derecha;
                        if (aux == null) {
                            temp.derecha = nuevo;
                            return;
                        }
                    }
                }
            }
        }

        public void posoreder(Node localroot) {
            if (localroot != null) {
                System.out.print(localroot.idata + " ");
                posoreder(localroot.izquierda);
                posoreder(localroot.derecha);
            }
        }

    }
}
//por nivles
//reccorrido enprofundidad
//recorrido enanchura
//m-f-c-a
//m-f-h-g
//m-p-v-z