package week3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjangAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        //variables
        int luas;
        int lebar;
        int panjang;

        //process
        System.out.println("masukkan panjang: ");
        panjang = uhuy.nextInt();

        System.out.println("masukkan lebar: ");
        lebar = uhuy.nextInt();
        luas = lebar * panjang;

        System.out.println("maka panjang persegi adalah: " + luas);
    
        uhuy.close();
    }
    
}
