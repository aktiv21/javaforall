
public class KinoTester {

	public static void main(String[] args) {
		KinoKasse kleinesKino = new KinoKasse();

		// Bestellung Besucher 1 
		kleinesKino.platzBelegen();
		kleinesKino.popkornBestellen();
		kleinesKino.kassieren();
		
		//Bestellung Besucher 2, er l�dt seine Freundin ein
		kleinesKino.platzBelegen();
		kleinesKino.platzBelegen();
		kleinesKino.popkornBestellen();
		kleinesKino.kassieren();
		
		/* Bestellung Besucher 3, er hat den Auftrag f�r
		 * seine Freunde die Karten mitabzuholen.
		 */
		kleinesKino.platzBelegen();
		kleinesKino.platzBelegen();
		kleinesKino.platzBelegen();
		kleinesKino.platzBelegen();
		kleinesKino.platzBelegen();
		kleinesKino.kassieren();
	}

}
