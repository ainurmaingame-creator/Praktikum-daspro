
import java.util.Scanner;

public class Tugas2PemilihanAinur {
    public static void main(String[] args) {
        //scanner
        Scanner uhuy = new Scanner(System.in);
    
        //var
        int jmlSKS;

        //proses
        System.out.println("Masukkan jumlah SKS yang hendak diambil: ");
        jmlSKS = uhuy.nextInt();

        if (jmlSKS <= 24) { 
            System.out.println("jumlah SKS yang dipilih valid, sebanyak: " + jmlSKS);
        } else {
            System.out.println("jumlah SKS tidak valid");
        }
    }
}
