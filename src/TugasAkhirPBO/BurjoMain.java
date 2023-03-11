package TugasAkhirPBO; // Package

/* Muhammad Nur Taufiq (L200190085) */
/* Muhammad Hafidz Febriansyah (L200190056) */

import java.util.Scanner;

public class BurjoMain extends Makanan { // Inheritance

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Input Output

        Makanan n = new Makanan(); // Object
        n.Makanan();
        n.setParkir(2000);

        System.out.print("Masukkan makanan yang anda ingin (masukkan angka) : ");
        int pilih_makan = input.nextInt();

        Minuman k = new Minuman(); // Object
        k.MinumanPilihan();

        System.out.print("Masukkan minuman yang anda ingin (masukkan angka) : ");
        int pilih_minum = input.nextInt();

        String makan_minum = makanan[pilih_makan] + " dan " + minuman[pilih_minum];
        System.out.println("Makanan dan Minuman yang anda pilih : " + "\n" + makan_minum + " + Parkir (Rp 2000)");
        int totals_harga = hargamakanan[pilih_makan] + hargaminuman[pilih_minum] + n.getParkir();
        System.out.println("Total Harga : " + "Rp " + totals_harga);

        System.out.println("Masukkan Uang Anda Rp : ");
        int uang_anda = input.nextInt();
        int kembali = uang_anda - totals_harga;
        System.out.println("Kembalian Uang anda Rp " + kembali);
    }
}