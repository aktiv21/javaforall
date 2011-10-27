public class Rechteck {
	int a ; // Hoehe
	int b ; // Breite
	int flaeche  ;// Flaeche
	int umfang   ;//Umfang
	
	void rechnung(){flaeche = a * b;
			umfang = 2 * a + 2 * b;
	}//Umfang/Flaeche berechnen	
		
	void flaeche(){ 		
		System.console().printf("Flaeche:"+ flaeche + "\n");
	}//Fläche ausgeben
	
	void umfang(){ 
		System.console().printf("Umfang:"+ umfang +"\n");
	}//Umfang ausgeben
	
	void kippeUm(){ 
		System.console().printf("Boooom das Rechteck kippt um.:\n");
		int Zwischenspeicher= a ;
		a = b ;
		b = Zwischenspeicher ;
	}//Umkippen
	
	void zeigeEigenschaftenAn(){ System.console().printf("Höhe:"+ a +"\n" +"Breite:"+ b + "\n"+ 										"Flaeche:"+ flaeche +"\n"+ "Umfang:"+ umfang +"\n");
	}//Eigenschaften ausgeben
}
