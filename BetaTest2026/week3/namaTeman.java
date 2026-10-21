
import java.util.Scanner;

public class namaTeman {
    public static void main(String[] args) {
        
        //scanner
        Scanner uhuy = new Scanner(System.in);

        //dek. vari.
        String[][] namaFwens = new String[3][3];

        //pros1
        for (int row = 0; row < namaFwens.length; row++) {
            for (int col = 0; col < namaFwens.length; col++) {
                System.out.println("Masukkan nama: ");
                namaFwens[row][col] = uhuy.nextLine();
                System.out.println("Masukkan prodi teman anda: ");
                namaFwens[row][col] = uhuy.nextLine();
                System.out.println("Masukkan hobi teman: ");
                namaFwens[row][col] = uhuy.nextLine();

                System.out.println(namaFwens[row][col]);
            }
            System.out.println();
        }
        
        

        // //pros2
        // for (int row = 0; row < namaFwens.length; row++) {
        //     for (int col = 0; col < namaFwens[row].length; col++) {
        //         System.out.print(namaFwens[row][col] + " ");
        //     }
        // System.out.println();
        //}
    }
}
