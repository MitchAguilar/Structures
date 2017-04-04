package secondclass;

public class Estructuras {

    int[] AR = new int[10];

    public static void main(String[] args) {
        int[] a = new int[100];
        int[] f = new int[10];
        String c = "";
        //a[i]=(int) ((int) (Math.random()*(99+1))*(Math.random()*(99+1)));
        for (int i = 0; i < 50; i++) {
            int b = A();
            c += b + " ";
            if (c.contains(b + "")) {
                a[i] = A();
            } else {
                a[i] = b;
            }
            System.out.println("N " + i + "= " + a[i]);
            int z2=b/10;
            f[z2]+=1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+"-- "+f[i]);
        }
    }

    public static int A() {
        int a = (int) (Math.random() * 99 + 1);
        return a;
    }

}

/*
con el swith
switch (b / 10) {
                case 1:
                    f[1] += 1;
                    break;
                case 2:
                    f[2] += 1;
                    break;
                case 3:
                    f[3] += 1;
                    break;
                case 4:
                    f[4] += 1;
                    break;
                case 5:
                    f[5] += 1;
                    break;
                case 6:
                    f[6] += 1;
                    break;
                case 7:
                    f[7] += 1;
                    break;
                case 8:
                    f[8] += 1;
                    break;
                case 9:
                    f[9] += 1;
                    break;
            }




probar metodo
System.out.println(a[i]);
            for (int j = 0; j < 50; j++) {
                if(a[i]==b){
                    System.out.println("idiota");
                }
            }


 if(a[i]>=0&&a[i]<=9){ 
                b+="*";
            }else if(a[i]>=10&&a[i]<=19){
                c+="*";
            }else if(a[i]>=20&&a[i]<=29){
                d+="*";
            }else if(a[i]>=30&&a[i]<=39){
                
            }else if(a[i]>=40&&a[i]<=49){
                
            }else if(a[i]>=50&&a[i]<=59){
                
            }else if(a[i]>=60&&a[i]<=69){
                
            }else if(a[i]>=70&&a[i]<=79){
                
            }else if(a[i]>=80&&a[i]<=89){
                
            }else if(a[i]>=90&&a[i]<=99){
                
            }
 */
//a[i]==0||a[i]==1||a[i]==2||a[i]==3||a[i]==4||a[i]==4||a[i]==5||a[i]==6||a[i]==7||a[i]==8||a[i]==9
//            for (int j = 0; j < 50; j++) {
//                if(a[i]==a[j]){
//                    a[j]=(int) (Math.random()*99+1);
//                }
//            }
