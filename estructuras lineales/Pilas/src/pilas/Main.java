package pilas;
public class Main {
    public static void main(String[] args) {
        Pilas a= new Pilas();
        
        a.push(4.3);
        a.push(true);
        a.push("pila");
        a.push('c');
        a.push('d');
        
//        System.out.println(a.peek());
        while(a.empty()==false){
            System.out.println(a.pop());
        }
    }
    
}
