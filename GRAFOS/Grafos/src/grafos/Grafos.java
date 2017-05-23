package grafos;

import java.util.Scanner;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Grafos {

    static int[][] a = new int[6][6];
    public static void main(String[] args) {
        //matrix de adyacencia
        agregar(1, 2);
        agregar(1, 5);
        agregar(2, 3);
        agregar(2, 1);
        agregar(2, 5);
        agregar(3, 4);
        agregar(3, 2);
        agregar(4, 5);
        agregar(4, 3);
        agregar(4, 6);
        agregar(5, 4);
        agregar(5, 1);
        agregar(6, 4);
        pintar();
        System.out.println("");
        caminos(1, 6);
    }
    public static void pintar() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" [" + a[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    public static void agregar(int c, int d) {
        a[c - 1][d - 1] = 1;
    }
    
    public static void caminos(int c, int b){
        c-=1;
        b-=1;
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j]==1){
                    System.out.print("["+a[i][j]+"]->");
                }
                System.out.println("");
            }
        }
    }
}
