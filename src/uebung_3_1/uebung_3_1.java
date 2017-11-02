package uebung_3_1;

public class uebung_3_1 {

	public static void main(String[] args) {

		double p = 0;
		double q = 0;

		double unterDerWurzel = ((p / 2) * (p / 2)) - q;
		double vorDerWurzel = -1 * p / 2;

		if (unterDerWurzel > 0) {
			double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
			double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);

			System.out.println("x1 = " + loesung1);
			System.out.println("x2 = " + loesung2);

		} else {
			
			if (unterDerWurzel == 0) {
				double loesung1 = vorDerWurzel;
				System.out.println("x1 = " + loesung1);
				System.out.println("Es gibt nur eine Lösung");
			}
			else {
				System.out.println("Es ist keine Lösung möglich.");
			}
		}

	}

}
