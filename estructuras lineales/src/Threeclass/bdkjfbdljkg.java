/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threeclass;

/**
 *
 * @author estudiante
 */
public class bdkjfbdljkg {

    int[] AR = new int[10];

    public static void main(String[] args) {
        int[] a = new int[100];
        int[] f = new int[10];
        String c = "";
        int h = 1;
        //a[i]=(int) ((int) (Math.random()*(99+1))*(Math.random()*(99+1)));
        do {
            h++;
            int b = A();
            c += b + " ";
            if (c.contains(b + "")) {
                h -= 1;
                return;
            } else {
                a[h] = b;
            }
            System.out.println("N " + h + "= " + a[h]);
            int z2 = b / 10;
            f[z2] += 1;
        } while (h < 49);
        for (int i = 0; i < 10; i++) {
            System.out.println((i - 1) + "-- " + f[i]);
        }
        boolean f2 = B(a, 10);
        System.out.println(f2);
    }

    public static boolean B(int a[], int b) {
        boolean c = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                c = true;
                break;
            } else {
                c = false;
            }
        }
        return c;
    }

    public static int A() {
        int a = (int) (Math.random() * 99 + 1);
        return a;
    }
}
