package week3;

import java.util.Scanner;

public class MenghitungTotalBayarAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        //variables
        double harga;
        double diskon = 0.15;
        double hargaAkhir;

        //process
        System.out.println("Masukkan harga celana: ");
        harga = uhuy.nextInt();

        hargaAkhir = harga * (1 - diskon);

        System.out.println("maka harga akhir setelah diskon adalah: " + hargaAkhir);
    }
}
