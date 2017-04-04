package firshclass;

public class Prog {
    Object f= new Object();
    private int a=3, b=5;

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

    //construc area
    public Prog() {

    }

    public Prog(int a) {
        System.out.println("I: " + a);
    }

    public Prog(double a) {
        System.out.println("D: " + a);
    }

    public Prog(int a, int b) {
        String c = "";
        if (a < 0 || a <= 1) {
            System.out.println("1");
        } else if ((a >= 1) && (b >= 1)) {
            System.out.println(a + "/" + b);
        }
    }

    public String Motore(int a, int b) {
//        if(b==0)
//        return a;
//        else
//            return Motore(b,a%b);
        String r="";
        int c = (int) (a / b);
        if (((a / b) - c) == 0) {
            int r1=(a/b);
            r=r1+"";
        } else {
            int v=a(a,b);
            a/=v;
            b/=v;
            r=a+"/"+b;
        }
        return r;
    }
    public int a(int a,int b){
        if(b==0)
            return a;
        else
            return a(b,a%b);
    }
    
//    public int Motore1(int b,int c){
//       int a=10;
//       int d=36;
////        
////       x=new Motore1(a,b);
////        return x;
//    }
//    public String a(int getA, int getB){
//        return "Fra: "+a+"/"+b;
//    }
//    
//    public String b(int getA,int getB){
//        int a=getA;
//        int b=getB;
//        String c="";
//        if(a<0){
//            c="1";
//        }else if(b<0){
//            c="1";
//        }else{
//            c=a+"/"+b;
//        }
//        return c;
//    }
}
