package pilasandcolas;

import java.util.Scanner;

public class A {

    /*
        .................................................................................
        .               ...debe poder hacerlo con entero y con objetos....              .              .
        .    *-crear el arreglo.                                                        .
        .    *-mostrar las poscicones.                                                  .
        .    *-insertar en la posicion de enseguida.                                    .
        .    *-debe poder simular las pilas, es decir priero en entrar ultimo en salir. .
        .    *-debe pdoer simular las cola, y las listas.                               .
        .................................................................................
     */
    public static int A(){
        return (int) (Math.random()*(99+1));
    }
    
    public static void main(String[] args) {
        /*proposito general*/
        int t=10;
        B b = new B(t);
        //ingresa
        for (int i = 0; i < t; i++) {
            b.C(A());
        }
        //por borbuja
        System.out.println(b.D(t));
        b.G(t);
        System.out.println("\n---ordenado---\n");
        System.out.println(b.D(t));
        //Quicksort
////////////////////////        System.out.println(b.D(t));
////////////////////////        b.G(t);
////////////////////////        System.out.println("\n\n---ordenado---\n\n");
////////////////////////        System.out.println(b.D(t));
        //Busqueda binaria
        System.out.println(b.I(t,20));
        Scanner a = new Scanner(System.in);
        int aassa=a.nextInt();
        
//        System.out.println("ordenado");
//        System.out.println(b.D());
//        //muestra
//        System.out.println(b.D());
//        //eliminar
//        System.out.println("se eliminó? "+b.E(1)+"\n");
//        //muestra nuevo arreglo
//        System.out.println(b.D());
//        //buscar
//        System.out.println(b.F(1));
        
        /*simulando pilas*/
        
    }

}
