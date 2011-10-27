public class RaumschiffTest {
    public static void main(String[] args) {

        Raumschiff enterprise = new Raumschiff();
        enterprise.name = "Enterprise";
        enterprise.heimatplanet = "Erde";
        enterprise.macheMeldung();
        
        Raumschiff falcon = new Raumschiff();
        falcon.name = "Millennium Falcon";
        falcon.heimatplanet = "Corellia";
        falcon.macheMeldung();
    }
}
