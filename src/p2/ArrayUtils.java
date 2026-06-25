package p2;

public class ArrayUtils {
    public static <T> void tausche(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        if (a.compareTo(b) > 0){
            if (a.compareTo(c) > 0){
                return a;
            } else if (a.compareTo(c)<0) {
                return c;
            }else return a;
        } else if (a.compareTo(b) < 0) {
            if (b.compareTo(c) >0){
                return b;
            }else if(b.compareTo(c) <0){
                return c;
            }else return b;
        }
        else{ //a==b
            if (a.compareTo(c) >=0){
                return a;
            }
            else return c;
        }
        //Geht bestimmt einfacher, hoffe ich hab keinen Fall vergessen.
    }
    public static <T extends Number> void analysiere(T zahl){
        System.out.println(zahl.getClass().getSimpleName());
        System.out.println(zahl.doubleValue());
        if (zahl instanceof Double || zahl instanceof Float){
            System.out.println("Achtung: Gleitkommazahl - moegliche Rundungsfehler!");
        }
    }
}
