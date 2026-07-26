package again.p2;

public class ZahlAnalyse {
    public static <T extends Number> void analysiere(T zahl){
        System.out.println(zahl.getClass().getSimpleName());
        if (zahl.getClass() == Double.class || zahl.getClass() == Float.class){
            System.out.println("Achtung: Gleitkommazahl - moegliche Rundungsfehler!");
        }
    }
}
