
public class KinoKasse {
	________________ platzVerwaltung = new Platzverwaltung();
	________________ kiosk = new Kiosk();
    // Hinweis: In einer echten Kino-Software wuerde man die Preise nicht fest
    // im Quellcode einbauen, man will schliesslich nicht jedes Mal die
    // Software neu kompilieren, wenn der Popkornpreis geaendert wird.
    // Wir machen das hier nur, weil wir noch nicht gelernt haben, wie man
    // Daten aus einer Datei ausliest.
	________________ preisProPlatz = 9.50;
	________________ popkornPreis = 5;
	________________ rechnungsBetrag = 0;
	
    /*
     * Reserviert einen Platz und addiert die Kosten zum
     * Rechnungsbetrag hinzu.
     */
	public void platzBelegen() {
		platzVerwaltung.reservierePlatz();
		rechnungsBetrag = rechnungsBetrag + preisProPlatz;
	}

    /*
     * Gibt eine Popkornbestellung an den Kiosk weiter, und
     * addiert die Kosten zum Rechnungsbetrag hinzu.
     */
	public void popkornBestellen() {
		kiosk.popkornAbfuellen();
		rechnungsBetrag = rechnungsBetrag + popkornPreis;
	}
	
    /*
     * Bittet den Kunden um Begleichung der Rechnung, und setzt den
     * Rechnungsbetrag zurueck.
     */
	public void kassieren() {
		System.console().printf("Ihre Rechnung betraegt " + rechnungsBetrag + "\n");
		rechnungsBetrag = 0;
	}
}
