package colas;

import java.util.LinkedList;

public class Colas {

    public static void main(String[] args) {
        // offer, poll
        LinkedList cola=new LinkedList();
        for (int i = 1; i <= 10; i++) {
            cola.offer(i);
//            cola.push(i);
        }
        while (cola.peek()!=null){
            System.out.println(cola.poll());
        }
    }
    
}
