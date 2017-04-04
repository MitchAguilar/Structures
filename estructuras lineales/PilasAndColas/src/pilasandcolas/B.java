package pilasandcolas;

public class B {
//    private int b;
//    private int[] a = new int[b];
//    private int c;

    private int c;
    int[] b = new int[0];

    public B(int a) {
        b = new int[a];
        c = 0;
    }

    //inserta
    public void C(int a) {
        b[c++] = a;
    }

    //muestra
    public String D(int a) {
        String a2 = "";
        for (int i = 0; i < a; i++) {
            if (b[i] == 0) {
            } else {
                Z(b[i]);
            }
        }
        return a2;
    }

    //eliminar
    public boolean E(int a) {
        boolean a2 = true;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a) {
                a2 = true;
                b[i] = 0;
                break;
            } else {
                a2 = false;
            }
        }
        return a2;
    }

    //buscar
    public String F(int a) {
        String a2 = "";
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a) {
                a2 = "Lo encontré";
                break;
            } else {
                a2 = "No lo encontré";
            }
        }
        return a2;
    }

    //ordenar por borbuja
    public void G(int a) {
        int a1 = a;
        int temp = 0;
        long cil = 0;
        for (int i = 0; i < a1; i++) {
            temp += 1;
            for (int j = 1; j < (a1 - i); j++) {
                if (b[j - 1] > b[j]) {
                    int z2 = b[j - 1];
                    b[j - 1] = b[j];
                    b[j] = z2;
                    cil += 1;
                }
            }
        }
        System.out.println("\n" + temp + " Tb vs Swap " + cil);
    }

    //ordenar por divide y vencerás
    public void H(int a) {
        int a2 = a;
        for (int i = 0; i < a2; i++) {
            for (int j = 0; j < a2; j++) {

            }
        }
    }

    //busqueda binaria
    public boolean I(int a, int c) {
        int a2 = a / 2;
        boolean a3 = false;
        int c2 = 0;
        int c3 = 0;
        if (b[a2 - 1] > c) {
            for (int i = 0; i < a2; i++) {
                if (b[i] == c) {
                    a3 = true;
                    break;
                } else {
                    a2 /= 2;
                    a3=false;
                }
                c3 += 1;
            }
        } else {
            for (int i = a2; i < a; i++) {
                if (b[i] == c) {
                    a3 = true;
                    break;
                } else {
                    a2 /= 2;
                    a3=false;
                }
                c3 += 1;
            }
        }
        System.out.println("izquie: " + c2 + "------ dere: " + c3);
        return a3;
    }

    //mostrar
    public void Z(int a) {
        System.out.print(a + " ");
    }
//    public int E(int a){
//        
//    }
//    public void D(int a){
//        b[a]=
//    }
}
