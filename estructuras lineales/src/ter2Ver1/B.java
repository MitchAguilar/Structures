package ter2Ver1;

public class B {

    int a = 0, b = 0, e = 0;
    String c = "";

    //area de lso constructores
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    //area de los los constructores

    //Constructor nulo
    public B() {
    }

    //constructor zero and negative
    public B(int a) {
        c = "0";
        this.a = a;
    }

    //cosntructor decimal
    public B(double a) {
        c = "" + a;
        this.a = 1;
        b = 1;
    }

    //cosntructor String
    public B(String a) {
        c = a;
    }

    //constrructor de dos parametros
    public B(int a, int b) {
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        if (a < b) {
            c = "";
            int c3 = b(a, b);
            this.a = (a / c3);
            this.b = (b / c3);
        } else if (b > a) {
            c = "";
            int c3 = b(a, b);
            this.a = (a / c3);
            this.b = (b / c3);
        }
    }

//    public B a(int a, int b) {
//        B d = null;
//        if (a < b) {
//            c = "D";
//            this.a/=b;
//        } else if (b > a) {
//            c = "M";
//        }
//        return d;
//    }
    //simplificación
    public static int b(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        return a;
    }

    @Override
    public String toString() {
        String d = "";
        switch (c) {
            case "":
                d += a;
                d += (double) (a / b);
                break;
//            case "":
//                break;
            default:
                if (c == "0" && a == 0 && b == 0) {
                    d += "value is 0.0";
                } else if (a == 0 && b == 0 && c == null) {
                    d += "None,all values is zero";
                } else if (a < 0 && b == 0 && c == "0") {
                    d += "values is " + a + ".0";
                } else if (a == 1 && b == 1 && c != "0") {
                    d += "Value is: " + c;
                } else if (c != "0" && c != "1" && a == 0 && b == 0) {
                    d += "Values is String: " + c;
                }
                break;
        }
        return d;
    }
}
