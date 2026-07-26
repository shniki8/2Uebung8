package again.p2;

public class ArrayUtils {
    public static <T> void tausche(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        if (a.compareTo(b) >= 0){
            if (a.compareTo(c) >= 0){
                return a;
            }else return c;
        }
        else if (a.compareTo(b)<0){
            if (b.compareTo(c) >= 0)return b;
            else return c;
        }
        return null;
    }

}
