package ter1;

public class A {

    private int a;
    private int b;
    private float c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a == 0) {
            a = 0;
        } else {
            this.a = a;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    //nulo sin valor
    public A() {
        this.b = 1;
    }

    //que recibe un entero
    public A(int a) {
        this.b = a;
    }

    //que recibe un doble
    public A(double a) {
        this.b = (int) a;
    }

    //que recibe 2 parametros
    public A(int a, int b) {
        int c = a(a, b);
        this.a = a / c;
        this.b = b / c;
    }

    //que retorna objeto de los valores
    public A a2(int a, int b) {
        A z = null;
        int c = a(a, b);
        this.a = a / c;
        this.b = b / c;
        z.a = this.a;
        z.b = this.b;
        return z;
    }

    //que simplifica
    public int a(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        return (a);
    }

    //que recibe tres valores en ese caso, mixtos
    public A(int a, int b, int c) {
        a = a * c;
        a += b;
        float a2 = a;
        float c2 = c;
        this.c = (float) (a2 / c2);
    }
    //que hace un objeto con los 3 valores
    public A a3(int a, int b, int c) {
        A z=null;
        a = a * c;
        a += b;
        float a2 = a;
        float c2 = c;
        this.c = (float) (a2 / c2);
        z.a=this.a;
        z.b=this.b;
        z.c=this.c;
        return z;
    }
    //no sé por qué lo puse
    public A s(A a, A b) {
        A z = null;
        if (a.b == 0 && b.b == 0) {

        }
        return z;
    }
    //un monstruoso to string()
    @Override
    public String toString() {
        String d = "";
        if (c > 0) {
            d += "value is: " + c;
        } else if (b == 1 && a == 0) {
            d += "value is: " + (((float) b) + "");
        } else if (a == 0 && b == 0) {
            d += "value is: " + (a + "." + b);
        } else if (a == 0 && b < 0) {
            d += "value is: " + (b + "." + a);
        } else if (a < 0 && b > 0) {
            double a2 = a / b;
            d += "value is: " + a2;
        } else {
            d += "value is: " + a + "/" + b;
        }
        return d;
    }
//    public int s(int a,int b){
//        
//        return a+b;
//    }

//    int s(MotorM a, MotorM b) {
//        
//        return 
//    }
}
/*
return  a+"/"+b;
String a="";
        if(b==1){
            a+=((float) b)+"";
        }else{
            a+="value is: "+a+"/"+b;
        }
        return  a;
 */
