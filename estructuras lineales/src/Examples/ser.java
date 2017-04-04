package Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class ser {

    public static void main(String[] args) {
        /*
        Encontrar y mostrar todos los números de cuatro cifras que cumplan la condición de que la suma de las cifras de orden impar es igual a la suma de las cifras de orden par.

         */
        //possible solution
        Scanner b = new Scanner(System.in);
        int[] a = new int[4];
        while (true) {
            int c = 0;
            int d = 0;
            String e = "";
            for (int i = 0; i <=3; i++) {
                a[i] = b.nextInt();
                if (a[i] % 2 == 0) {
                    c += a[i];
                } else {
                    d += a[i];
                }
                e+=a[i];
                if(i==3){
                    if(c==d)
                        System.out.println(e);
                    else
                        System.out.println("Type Again");
                }
            }
        }
    }

}
