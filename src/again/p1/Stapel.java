package again.p1;

import java.util.ArrayList;

public class Stapel<T>{
    ArrayList<T> elemente = new ArrayList<>();

    void ablegen(T element){
        elemente.addLast(element);
    }
    T entnehmen(){
       T temp = elemente.getLast();
       elemente.removeLast();
       return temp;
    }
    T ansehen(){
        return elemente.getLast();
    }
    boolean istLeer(){
        return (elemente.size() == 0);
    }
    int groesse(){
        return elemente.size();
    }
}
