package pilas;

import java.util.ArrayList;

public class Pilas {

    //FILO el primero que entra el ultimo en salir
    private ArrayList<Object> filo = new ArrayList();

    public void push(Object o) {
        filo.add(o);
        //agregar valores a la pila
    }

    public Object pop() {
        //muestra el ultimo valor y lo elimina
        if (!(filo.isEmpty())) {//está llena
            Object o = filo.get(filo.size() - 1);
            filo.remove(filo.size() - 1);
            return o;
        } else {
            return null;
        }
    }

    public Object peek() {
        //muestra el ultimo valor
        if(!(filo.isEmpty())){
            return filo.get(filo.size()-1);
        }else{
            return null;
        }
    }

    public boolean empty() {
        //la pila está llana o vacia
        return filo.isEmpty();
    }
}
