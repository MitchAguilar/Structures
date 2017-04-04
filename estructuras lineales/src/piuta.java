public class piuta {
    // Algoritmo de Euclides

    public int mcd(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -=a;
            } else {
                a -= b;
            }
        }

        return (a);
    }

    public static void main(String[] args) {
        int a = 45;
        int b = 5;
        piuta max = new piuta();
        int c= max.mcd(a, b);
        a/=c;
        b/=c;
        System.out.println(a+"/"+b);
    }
}
