package week3;

import java.util.Scanner;

public class gajiKaryawan {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);

        //variables
        int gajiPokok;
        int tunjTransport = 600000;
        int tunjMakan = 400000;
        double gajiAkhir, potongan, bonus;
        double potonganPajak = 0.1;
        double bonusKinerja = 0.05;

        //process
        System.out.println("Masukkan gaji pokok: ");
        gajiPokok = uhuy.nextInt();

        bonus = bonusKinerja * gajiPokok;
        potongan = gajiPokok * potonganPajak;

        System.out.println("bonus: " + bonus);
        System.out.println("potongan pajak: " + potongan);
    
        gajiAkhir = gajiPokok + bonus - potongan + tunjMakan + tunjTransport;
        int gajiInt = (int) gajiAkhir; 
        System.out.println("gaji total: " + gajiInt);

        uhuy.close();
    }
}
