public class Blackbox {
	public static void main(String[] args){
		int v1 = 2;
			while (v1 <= 100){
				System.console().printf("Naechste Zahl: " + v1 + "\n"); v1 = v1 + 2;
			}
	}
}
