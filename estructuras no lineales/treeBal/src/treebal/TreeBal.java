package treebal;

public class TreeBal {

    public static void main(String[] args) {
        Tree a = new Tree();
        a.insert(3);
        a.insert(2);
        a.insert(1);
        a.insert(4);
        a.insert(5);
        a.insert(6);
        a.insert(7);
        a.insert(16);
        a.insert(15);
        a.insert(14);

        a.preOreder(a.root);
        System.out.println("");
    }

    public static class Node {

        public int idata;
        public Node izquierda;
        public Node derecha;
        public int balance;

        public Node() {

        }

        public Node(int i) {
            idata = i;
        }

        public void displayNode() {
            System.out.println("[" + idata + " - " + balance + "] ");
        }
    }

    public static class Tree {

        private Node root;

        public Tree() {
            root = null;
        }
        public int balan(Node aux){
            
        }
        
//        public Node insertRecur(Node nuevo,Node root){
//            
//        }
        //altura del subarbol derecho - el izquierdo
        //rotación simple *a la derecha
        //x=y.left
        //t=x.right
        //x.rigtt=y
        //y.left=t
        //ratacion simple a la drecha
        //o mismo de la derecha pero alrrevez
        
        // 3+
        public void insert(int id) {//funciona
            Node nuevo = new Node(id);
            int var;
            if (root == null) {
                nuevo.balance = 1;
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
                System.out.print(" [" + localRoot.idata + "," + localRoot.balance + "]");
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

        public void mostrarmenosrecursivo(Node localroot) {//funciona
            if (localroot.izquierda != null) {
                mostrarmenosrecursivo(localroot.izquierda);
            } else {
                System.out.print(localroot.idata);
            }
        }

        public void mostrarmayorrecursivo(Node localroot) {//funciona
            if (localroot.derecha != null) {
                mostrarmayorrecursivo(localroot.derecha);
            } else {
                System.out.print(localroot.idata);
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

        public void contarnodos(Node LocalRoot) {
            if (LocalRoot != null) {
                contarnodos(LocalRoot.izquierda);
                contarnodos(LocalRoot.derecha);
                System.out.print("/");
            }
        }

        public int contarnodos2(Node LocalRoot) {
            if (LocalRoot == null) {
                return 1;
            } else {
                return contarnodos2(LocalRoot.derecha) + contarnodos2(LocalRoot.izquierda);
            }
        }

        public int contar2(Tree a) {
            return contarnodos2(a.root);
        }

        public boolean eliminar(int a) {//no funciona
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

        public void mostrarrecorrido(Node aux) {
            if (aux != null) {
                System.out.print(aux.idata + " ");
                mostrarrecorrido(aux.izquierda);

                mostrarrecorrido(aux.derecha);
                if (aux.derecha == null && aux.izquierda == null) {
                    System.out.println(root.idata);
                }
            }

        }

        public void mostrarHojas(Node aux) {//funciona
            if (aux != null) {
                if (aux.izquierda == null && aux.derecha == null) {
                    System.out.print(aux.idata + " ");
                }
                mostrarHojas(aux.izquierda);
                mostrarHojas(aux.derecha);
            }
        }
    }
}
