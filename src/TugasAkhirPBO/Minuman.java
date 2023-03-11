package TugasAkhirPBO; // Package

/* Muhammad Nur Taufiq (L200190085) */
/* Muhammad Hafidz Febriansyah (L200190056) */

public class Minuman { // Class
    static String[] minuman = { "Teh Panas", "Jeruk Panas", "Es Teh", "Es Jeruk", "Good Day Panas", "Es Good Day",
            "Es KukuBima", "Susu Hangat", "Es Susu" }; // Static Variable
    static int[] hargaminuman = { 2500, 3000, 3000, 3500, 3500, 4000, 5000, 5000, 5000 }; // Static Variable

    public void MinumanPilihan() { // Void Method
        System.out.println("\n -------------------------------------------------");
        System.out.println("| 	 Daftar Minuman Burjo POP		|");
        System.out.println("-------------------------------------------------");
        System.out.println("| 0. | Teh Panas 		Rp 2.500	|");
        System.out.println("| 1. | Jeruk Panas		Rp 3.000	|");
        System.out.println("| 2. | Es Teh			Rp 3.000	|");
        System.out.println("| 3. | Es Jeruk  		Rp 3.500	|");
        System.out.println("| 4. | Good Day Panas		Rp 3.500	|");
        System.out.println("| 5. | Es Good Day		Rp 4.000	|");
        System.out.println("| 6. | Es KukuBima		Rp 5.000	|");
        System.out.println("| 7. | Susu Hangat		Rp 5.000	|");
        System.out.println("| 8. | Es Susu			Rp 5.000	|");
        System.out.println("-------------------------------------------------");
    }
}