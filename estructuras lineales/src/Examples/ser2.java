
package Examples;

import java.util.ArrayList;

public class ser2 {

    public static void main(String[] args) {
        /*
        Encontrar y mostrar todos los números de cuatro cifras que cumplan la condición de que la suma de las cifras de orden impar es igual a la suma de las cifras de orden par.
         */
        //other possible solution
        ArrayList<Integer> a= new ArrayList<>();
        a.add(122323);
        a.add(1212);
        a.add(2433);
        System.out.println(a.get(1).toString().chars().count());
        
        for (int i = 0; i < a.size(); ++i) {
            if((a.get(i).toString().chars().count())==4){
                int b=a.get(i);
                for (int j = 0; j <=3; ++j) {
                    //not found
                }
            }
        }
    }
    
}
