package repaso.lista;

public class RepasoLista {

    public static void main(String[] args) {
        Lista a = new Lista();
        lista2 c = new lista2();
        a.insertar(10);
        a.insertar(23);
        a.insertar(21);
       
//        for (int i = 50; i >= 1; i--) {
//            a.insertar(i);
//        }
        a.mostrar();
//        System.out.println("");
//        for (int i = 0; i < 10; i++) {
//            c.insertar(a.AleaLista());
//        }
//        c.mostrar();
    }

    public static class Enlace {

        int dato = 0;
        Enlace sig;
        Enlace ante;

        Enlace() {
        }

        Enlace(int a) {
            this.dato = a;
        }

        public void mostrar() {
            System.out.print(dato + " ");
        }
    }

    public static class Lista {
        private Enlace cabeza=null;//cabeza

        public void insertar(int dato) {
            Enlace enlace = new Enlace(dato);
            if(cabeza==null){
                cabeza=enlace;
            }else{
                Enlace aux=cabeza;
                while(aux.sig!=null){
                    aux=aux.sig;
                }
                aux.sig=enlace;
            }
        }

        public void mostrar() {
            Enlace aux = cabeza;
            while (aux != null) {
                aux.mostrar();
                aux = aux.sig;
            }
        }

        public int aut() {
            int a = (int) (Math.random() * 50 + 1);
            return a;
        }

        public int AleaLista() {
            Enlace aux = cabeza;
            int dev = 0;
            int base = aut();
            while (aux != null) {
                if (aux.dato == base) {
                    dev = base;
                    aux.dato = 0;
                    break;
                }
                aux = aux.sig;
                if (aux == null) {
                    aux = cabeza;
                    base = aut();
                }
            }
            return dev;
        }
    }

    public static class lista2 {

        int con = 0;
        Enlace a = new Enlace();
        private Enlace cabeza;

        public void insertar(int a) {
            Enlace nuevo = new Enlace(a);
            Enlace aux = cabeza;
            if (con > 2) {
                if (aux.sig.dato > nuevo.dato && aux.sig.dato < nuevo.dato) {
                    nuevo.sig = aux.sig;
                    nuevo.ante = aux.ante;
                    this.cabeza = nuevo;
                }
            } else {
                nuevo.sig = this.cabeza;
                this.cabeza = nuevo;
            }
            con++;
        }

        public void mostrar() {
            Enlace aux = cabeza;
            while (aux != null) {
                aux.mostrar();
                aux = aux.sig;
            }
        }
    }
}
