
import java.util.Scanner;

public class NusantaraPayRukmi {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);

        boolean blackList = true, rejectSaldo, rejectLimit, foreignTr, OTPNight, OTPSus, approve, trLuar;
        int transaksi, saldo;

        System.out.println("=== SELAMAT DATANG DI NUSANTARAPAY ===");
        System.out.print("Masukkan saldo terakhir anda: ");
        saldo = uhuy.nextInt();
        System.out.println();
        System.out.print("Masukkan transaksi: $");
        transaksi = uhuy.nextInt();

        System.out.println("Masukkan pin anda: ");
        int pin = uhuy.nextInt();

        if (pin != 000001) {
            blackList = true;
            System.out.println("Akun anda telah diblacklist, silahkan hubungi customer service untuk pemulihan akun.");
        } else if (saldo < transaksi) {
            rejectSaldo = true;
            System.out.println("Saldo anda tidak mencukupi untuk transaksi ini.");
        } else if (transaksi > 10000) {
            rejectLimit = true;
            System.out.println("Anda telah mencapai bertransaksi hari ini.");
        } else if (trLuar = true && transaksi > 2000) {
            
        }
    }
}
