package again.p2;

import java.util.Arrays;

public class MethodenDemo {
    public static void main(String[] args) {
        String[] fruechte = {"Banane", "Apfel", "Kirsche", "Mango", "Erdbeere"};
        System.out.println(Arrays.toString(fruechte));
        ArrayUtils.tausche(fruechte, 2,4); // peak Früchte!
        System.out.println(Arrays.toString(fruechte));
        System.out.println(ArrayUtils.maximum(2,3,2));
        ZahlAnalyse.analysiere(1);
        ZahlAnalyse.analysiere(1.0);
        ZahlAnalyse.analysiere(1f);

    }
}
