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
        System.out.println("Buscar: " + a.buscar(86));
        System.out.println("Eliminar: " + a.eliminar(105));//no funciiona
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

        public void insert(int id, double dd) {//funciona
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

        public void Display() {//funciona
            Node aux;
            Node aux2;
            while (root != null) {
                root.displayNode();
            }
        }

        //pre order recuersivo
        public void preOreder(Node localRoot) {//funciona
            if (localRoot != null) {
                System.out.print(localRoot.idata + " ");
                preOreder(localRoot.izquierda);
                preOreder(localRoot.derecha);
            }
        }

        //inorder
        public void inOreder(Node localRoot) {//funciona
            if (localRoot != null) {
                posOreder(localRoot.izquierda);
                System.out.print(localRoot.idata + " ");
                posOreder(localRoot.derecha);
            }
        }

        //postorder
        public void posOreder(Node locaroot) {//funciona
            if (locaroot != null) {
                posOreder(locaroot.izquierda);
                posOreder(locaroot.derecha);
                System.out.print(locaroot.idata + " ");
            }
        }

        public int mostrarmenos() {//funciona
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

        public int mostrarmas() {//funciona
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

        public boolean buscar(int b) {//funciona
            boolean a = false;
            if (root != null) {
                if (root.idata == b) {
                    a = true;
                } else {
                    Node aux = root;
                    while (true) {
                        Node aux2 = aux;
                        if (aux.idata <= b) {
                            if (aux.idata == b) {
                                a = true;
                                break;
                            } else {
                                if (aux2.derecha != null) {
                                    aux = aux2.derecha;
                                } else {
                                    break;
                                }
                            }
                        } else {
                            if (aux.idata == b) {
                                a = true;
                                break;
                            } else {
                                if (aux2.izquierda != null) {
                                    aux = aux2.izquierda;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return a;
        }

        public boolean eliminar(int a) {//nno funciona
            boolean b = false;
            if (root != null) {
                if (root.idata == a) {
                    b = true;
                } else {
                    Node aux = root;
                    while (true) {
                        Node aux2 = aux;
                        if (aux.idata <= a) {
                            if (aux.idata == a) {
                                
                                b = true;
                                break;
                            } else {
                                if (aux2.derecha != null) {
                                    aux = aux2.derecha;
                                } else {
                                    break;
                                }
                            }
                        } else {
                            if (aux.idata == a) {
                                b = true;
                                break;
                            } else {
                                if (aux2.izquierda != null) {
                                    aux = aux2.izquierda;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return b;
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
//el menor valor de todo el arbol---ya
///el mayor vlaor de todo el arbol----ya
//nodos que son hojas
//boorado par aun nodo de dos hijos
//hacer todas la sfunciones de forma recursiva

