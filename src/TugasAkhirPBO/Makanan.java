package TugasAkhirPBO; // Package

/* Muhammad Nur Taufiq (L200190085) */
/* Muhammad Hafidz Febriansyah (L200190056) */

public class Makanan extends Minuman { // Class
    public int parkir = 2000; // Local Variable & Access Modifier (Public)

    public void setParkir(int parkir) { // Encapsulation Setter
        this.parkir = parkir;
    }

    public int getParkir() { // Encapsulation Getter
        return parkir; // Non-Void Method
    }

    static String[] makanan = { "Mie Goreng", "Nasi Goreng", "Magelangan", "Telur Orak Arik", "Omelatte",
            "Telur Balado", "Mie Rebus", "Sarden", "Ayam Goreng", "Patin Goreng" }; // Static Variable
    static int[] hargamakanan = { 7000, 8000, 10000, 8000, 10000, 8000, 7000, 9000, 10000, 12000 }; // Static Variable

    int hargatotal; // Instance Variable

    public void Makanan() { // Constructor
        System.out.println("-------------------------------------------------");
        System.out.println("| 	Daftar Makan Burjo POP			|");
        System.out.println("-------------------------------------------------");
        System.out.println("| 0. | Mie Goreng 		Rp 7.000	|");
        System.out.println("| 1. | Nasi Goreng		Rp 8.000	|");
        System.out.println("| 2. | Magelangan		Rp 10.000	|");
        System.out.println("| 3. | Telur Orak-Arik  	Rp 8.000	|");
        System.out.println("| 4. | Omelatte			Rp 10.000	|");
        System.out.println("| 5. | Telur Balado		Rp 8.000	|");
        System.out.println("| 6. | Mie Rebus		Rp 7.000	|");
        System.out.println("| 7. | Sarden			Rp 9.000	|");
        System.out.println("| 8. | Ayam Goreng		Rp 10.000	|");
        System.out.println("| 9. | Patin Goreng		Rp 12.000	|");
        System.out.println("-------------------------------------------------\n");

    }

    public int totalharga() {
        return hargatotal = hargamakanan[0] + hargaminuman[0];
    }
}