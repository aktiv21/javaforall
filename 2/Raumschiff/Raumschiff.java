public class Raumschiff {

    // Der Planet, auf dem das Raumschiff gebaut wurde.
    String heimatplanet;

    // Die Schiffsbezeichnung.
    String name;

    // Gibt eine Statusmeldung aus.
    public void macheMeldung() {
        System.console().printf("Hier spricht das Raumschiff " + name + " vom Planeten " + heimatplanet + ".\n");
    }
}
