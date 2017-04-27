
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

        System.out.print("pos:        ");
        a.posOreder(a.root);
        System.out.print("\ninor:       ");
        a.inOreder(a.root);
        System.out.print("\npre oreder: ");
        a.preOreder(a.root);
        System.out.println("\n");
        System.out.print("EL menor es: " + a.mostrarmenos());
        System.out.print("  ----- El menor recursivo: ");
        a.mostrarmenosrecursivo(a.root);
        System.out.println("");
        System.out.print("el mayor es: " + a.mostrarmas());
        System.out.print(" ----- El mayor recursivo: ");
        a.mostrarmayorrecursivo(a.root);
        System.out.println("\n");
        System.out.print("Buscar: " + a.buscar(80));
        System.out.print(" ----- Buscar recursivo: ");
//        a.buscarrecursivo(a.root, 80);
        System.out.println("\n");
        System.out.println("El arbol tiene: ");
        a.contarnodos(a.root);
        System.out.println("\nEl arbol tiene2: " + a.contarnodos2(a.root));
        System.out.println("\nContar bien: " + a.contar2(a));
        System.out.println("\nMostrar hojas: ");
        a.mostrarHojas(a.root);
        System.out.println("\nrrecorrido: ");
        a.mostrarrecorrido(a.root);

//        System.out.println("Eliminar: " + a.eliminar(105));//no funciiona
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
//que busque y que elimine---- solo busca pero no elimina
//el menor valor de todo el arbol---ya
///el mayor vlaor de todo el arbol----ya
//nodos que son hojas---ya
//boorado par aun nodo de dos hijos
//hacer todas la sfunciones de forma recursiva

