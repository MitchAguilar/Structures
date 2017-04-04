package tree;

public class Arboles {

    public static void main(String[] args) {
        Tree a = new Tree();
        a.insert(30, 344.4);
        a.insert(25, 344.4);
        a.insert(15, 344.4);
        a.insert(10, 344.4);
        a.insert(27, 344.4);
        a.insert(29, 344.4);
        a.insert(40, 344.4);
        a.insert(48, 344.4);
        
        System.out.println("pos: ");
        a.posOreder(a.root);
        System.out.println("inor: ");
        a.inOreder(a.root);
        System.out.println("pre oreder: ");
        a.preOreder(a.root);
    }

    public static class Node {

        public int idata;
        public double ddata;
        public Node lleftchild;
        public Node rightChild;

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
            Node node = new Node(id, dd);
            if (root == null) {
                root = node;
            } else {
                Node aux=root;
                Node hoj;
                while(true){
                    no
                          
                    Node tem;
                    if(id < node.idata){
                        node.lleftchild=node;
                        
                        return;
                    }
                    if(id>node.idata){
                        node.rightChild=node;
                        return;
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
        public void preOreder(Node localRoot){
            if(localRoot!=null){
                System.out.println(localRoot.idata+" ");
                preOreder(localRoot.lleftchild);
                preOreder(localRoot.rightChild);
            }
        }
        //inorder
        public void inOreder(Node localRoot){
            if(localRoot!=null){
                posOreder(localRoot.lleftchild);
                System.out.println(localRoot.idata+" ");
                posOreder(localRoot.rightChild);
            }
        }
        
        //postorder
        public void posOreder(Node locaroot){
            if(locaroot!=null){
                posOreder(locaroot.lleftchild);
                posOreder(locaroot.rightChild);
                System.out.println(locaroot.idata+" ");
            }
        }
    }
}
