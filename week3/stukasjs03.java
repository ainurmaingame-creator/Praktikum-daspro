package week3;

import java.util.Scanner;

public class stukasjs03 {
    public static void main(String[] args) {
        
        Scanner uhuy = new Scanner(System.in);

        int lembar, jumlah, jilid = 5000;

        System.out.println("masukkan banyak lembar yang dicetak: ");
        lembar = uhuy.nextInt();

        jumlah = (lembar * 500) + jilid;

        System.out.println(jumlah);
    }
}
