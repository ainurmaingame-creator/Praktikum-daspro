
import java.util.Scanner;

public class Tugas1PemilihanAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);

        //variabel
        boolean statusUkt;
        //proses
        System.out.println("=== LAMAN PENCETAKAN KRS ===");
        System.out.print("Selamat datang, silahkan masukkan status pembayaran UKT(true/false): ");
        statusUkt = uhuy.nextBoolean();

        String status = statusUkt ? "Pembayaran telah dikonfirmasi, silahkan mencetak KRS yang telah disediakan" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(status);
        

        // if (statusUkt == true) {
        //     //jika true, blok kode ini akan dijalankan
        //     System.out.println("Pembayaran telah dikonfirmasi, silahkan mencetak KRS yang telah disediakan");
        // } else {
        //     //sedangkan false, maka kode ini akan dijalankan
        //     System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        // }

        
        uhuy.close();
    }
}
