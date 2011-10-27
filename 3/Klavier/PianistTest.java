public class PianistTest {

    public static void main(String[] args) {
        // Hinweis: Die folgende Tonfolge ist in dieses Testprogramm fest
        // einprogrammiert. In einem echten Programm wuerden solche Daten
        // in einer Sounddatei gespeichert sein, und das Programm wuerde
        // diese Datei einlesen. Wir haben das Einlesen von Dateien aber
        // noch nicht behandelt.
        int[] tonfolge = new int[24];
        tonfolge[0] = 47;
        tonfolge[1] = 44;
        tonfolge[2] = 44;
        tonfolge[3] = 45;
        tonfolge[4] = 42;
        tonfolge[5] = 42;
        tonfolge[6] = 40;
        tonfolge[7] = 42;
        tonfolge[8] = 44;
        tonfolge[9] = 45;
        tonfolge[10] = 47;
        tonfolge[11] = 47;
        tonfolge[12] = 47;
        tonfolge[13] = 47;
        tonfolge[14] = 44;
        tonfolge[15] = 44;
        tonfolge[16] = 45;
        tonfolge[17] = 42;
        tonfolge[18] = 42;
        tonfolge[19] = 40;
        tonfolge[20] = 44;
        tonfolge[21] = 47;
        tonfolge[22] = 47;
        tonfolge[23] = 40;

        // Hier Code vervollstaendigen, um ein Klavier-Objekt und ein
        // Pianist-Objekt zu erstellen. Siehe dazu Folie zu Referenztypen.
        Klavier meinKlavier = new Klavier();
        Pianist meinPianist = new Pianist();
        
        // Den folgenden Testcode koennen Sie aendern, um auch die anderen Methoden der
        // Klasse Pianist zu testen.
        meinPianist.spieleAb(meinKlavier, tonfolge);
    }
}
