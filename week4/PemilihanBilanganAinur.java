
import java.util.Scanner;

public class PemilihanBilanganAinur {
    public static void main(String[] args) {
        //scanner
        Scanner uhuy = new Scanner(System.in);

        //input
        System.out.print("Masukkan angka: ");
        int angka = uhuy.nextInt();

        //proses
        
        if (angka % 2 ==0 ) {
            System.out.println(String.format("angka %s adalah genap", angka));
        } else {
            System.out.println(String.format("angka %s adalah ganjil", angka));
        }

        uhuy.close();
    }
}