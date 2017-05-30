package Threeclass;

public class A {

    int[] AR = new int[10];

    public static void main(String[] args) {
        int[] a = new int[100];
        int[] f = new int[10];
        String c = "";
        int h = 0;
        //a[i]=(int) ((int) (Math.random()*(99+1))*(Math.random()*(99+1)));
        while (h < 50) {
            int b = A();
            if (c.contains(b + "")) {
                h--;
            } else {
                a[h] = b;
                System.out.println("N " + h + "= " + a[h]);
                c += b + " ";
                int z2 = b / 10;
                f[z2] += 1;
            }
            h++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i) + "-- " + f[i]);
        }
//        int f2 = B(a, 10);
//        System.out.println(f2);
    }
//
//    public static int B(int a[], int b) {
//        int c = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == b) {
//                c = i;
//                break;
//            } else {
//                c = i;
//            }
//        }
//        return c;
//    }

    public static int A() {
        int a = (int) (Math.random() * 99 + 1);
        return a;
    }

}
