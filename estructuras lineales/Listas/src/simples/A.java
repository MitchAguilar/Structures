package simples;

public class A {

    public static void main(String[] args) {
        Lista a = new Lista();
        
        a.Inser(12, 0);
        a.Inser(6.25, 1);
        a.Inser(-3.85, 3);
        a.Dis();
    }

    public static class Enlace {//enlace

        int info;
        double dato;
        Enlace sig;

        Enlace() {

        }

        Enlace(int b, double c) {
            this.info = b;
            this.dato = c;
        }

        public void D() {
            if (info == 0) {
                System.out.print(dato + "");
            } else {
                System.out.print(dato + "x^" + info + "+");
            }
        }
    }

    public static class Lista {//lista cabeza

        Enlace a = new Enlace();
        private Enlace cabeza;//cabeza

        public Lista() {
            cabeza = null;
        }

        public void Inser(double j, int i) {
            Enlace nuevo = new Enlace(i, j);
            nuevo.sig = this.cabeza;
            this.cabeza = nuevo;
        }

        public void Dis() {//this a display
            Enlace aux = cabeza;
            while (aux != null) {
//                System.out.println(aux.dato+"x^"+aux.info);
                aux.D();
                aux = aux.sig;
            }
        }
    }

}
