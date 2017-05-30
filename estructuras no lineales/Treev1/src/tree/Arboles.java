package tree;

public class Arboles {

    public static void main(String[] args) {
        Tree a = new Tree();
        a.insert(80, 344.4);
        a.insert(45, 344.4);
        a.insert(30, 344.4);
        a.insert(38, 344.4);
        a.insert(50, 344.4);
        a.insert(99, 344.4);
        a.insert(85, 344.4);
        a.insert(105, 344.4);
        a.insert(91, 344.4);

        System.out.println("pos:");
        a.posOreder(a.root);
        System.out.println("\ninor: ");
        a.inOreder(a.root);
        System.out.println("\npre oreder:");
        a.preOreder(a.root);
        System.out.println("");
        System.out.println("EL menor es: " + a.mostrarmenos());
        System.out.println("el mayor es: " + a.mostrarmas());
        System.out.println("Buscar: " + a.buscar(544));
    }

    public static class Node {

        public int idata;
        public double ddata;
        public Node izquierda;
        public Node derecha;

        public Node() {

        }

        public Node(int i, double d) {
            idata = i;
            ddata = d;
        }

        public void displayNode() {
            System.out.println("[" + idata + "," + ddata + "] ");
        }
    }

    public static class Tree {

        private Node root;

        public Tree() {
            root = null;
        }

        public void insert(int id, double dd) {
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

        public void Display() {
            Node aux;
            Node aux2;
            while (root != null) {
                root.displayNode();
            }
        }

        //pre order recuersivo
        public void preOreder(Node localRoot) {
            if (localRoot != null) {
                System.out.print(localRoot.idata + " ");
                preOreder(localRoot.izquierda);
                preOreder(localRoot.derecha);
            }
        }

        //inorder
        public void inOreder(Node localRoot) {
            if (localRoot != null) {
                posOreder(localRoot.izquierda);
                System.out.print(localRoot.idata + " ");
                posOreder(localRoot.derecha);
            }
        }

        //postorder
        public void posOreder(Node locaroot) {
            if (locaroot != null) {
                posOreder(locaroot.izquierda);
                posOreder(locaroot.derecha);
                System.out.print(locaroot.idata + " ");
            }
        }

        public int mostrarmenos() {
            int re = 0;
            Node aux = root;
            while (true) {
                Node aux2 = aux;
                if (aux.izquierda == null) {
                    re = aux.idata;
                    break;
                } else {
                    aux = aux2.izquierda;
                }
            }
            return re;
        }

        public int mostrarmas() {
            int re = 0;
            Node aux = root;
            while (true) {
                Node aux2 = aux;
                if (aux.derecha == null) {
                    re = aux.idata;
                    break;
                } else {
                    aux = aux2.derecha;
                }
            }
            return re;
        }

        public boolean buscar(int b) {
            boolean a = false;
            if (root != null) {
                Node aux = root;
                Node temp;
                boolean ca = true;
                if (aux.idata == b) {
                    a = true;
                } else {
                    while (ca) {
                        temp = aux;
                        if (b < aux.idata) {
                            aux = aux.izquierda;
                            if (aux.idata == b) {
                                a = true;
                                ca = false;
                            }
                        } else {
                            aux = aux.derecha;
                            if (aux.idata == b) {
                                a = true;
                                ca = false;
                            }
                        }
                    }
                }
            }
            return a;
        }

        public void msotrarhojas(int a) {
            Node aux = root;
            Node temp;
            while (true) {
                temp = aux;
                if (a < aux.idata) {

                } else {

                }
//                if (a < aux.idata) {
//                    aux = aux.izquierda;
//                    if (aux == null) {
//                        temp.izquierda = nuevo;
//                        return;
//                    }
//                } else {
//                    aux = aux.derecha;
//                    if (aux == null) {
//                        temp.derecha = nuevo;
//                        return;
//                    }
//                }
            }
        }
    }
}
//que busque y que elimine
//el menor valor de todo el arbol
///el mayor vlaor de todo el arbol
//nodos que son hojas
//boorado par aun nodo de dos hijos
//hacer todas la sfunciones de forma recursiva

