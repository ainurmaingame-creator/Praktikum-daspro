package week3;

import java.util.Scanner;

public class stukasJs3 {
    public static void main(String[] args) {
        
        Scanner uhuy = new Scanner(System.in);

        int hargaLaptop, uangMuka, cicilBulan;
        double bunga = 0.2;
        double jumlahCicilan;

        System.out.print("Masukkan harga laptop: ");
        hargaLaptop = uhuy.nextInt();

        System.out.print("Masukkan uang muka: ");
        uangMuka = uhuy.nextInt();
        
        System.out.print("Masukkan lama mencicil: ");
        cicilBulan = uhuy.nextInt();

        jumlahCicilan = (hargaLaptop - uangMuka) * (1 - bunga) / cicilBulan;

        System.out.println(jumlahCicilan);


    }
}
