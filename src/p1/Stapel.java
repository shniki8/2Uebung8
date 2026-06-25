package p1;

import java.util.ArrayList;

public class Stapel<T> {
    ArrayList<T> elemente = new ArrayList<>();

    void ablegen(T element){
        elemente.addLast(element);
    }
    T entnehmen(){ //Darf davon ausgehen das elemente nicht leer ist ig
        T temp = elemente.getLast();
        elemente.removeLast();
        return temp;
    }
    T ansehen(){
        return elemente.getLast();
    }
    boolean istLeer(){
        return elemente.isEmpty();
    }
    int groesse(){
        return elemente.size();
    }
}
