import java.util.Scanner;
public class NusantaraPayAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        boolean blList, saldoReject, limitReject, flaggedFraud, otpNight, otpSus, approve, transaksiLuar;
        int duit, jam, saldo = 10000;
        int limitHarian = 10000, transaksiHarian = 6000;

        System.out.println("Masukkan jumlah transaksi: ");
        duit = uhuy.nextInt();
        System.out.println("Waktu menunjukkan pukul: ");
        jam = uhuy.nextInt();

        if (blList = true) {
            System.out.println("Akun anda telah diblacklist.");
        } else if (duit > saldo) {
            System.out.println("Saldo tidak cukup");
            saldoReject=true;   
        } else if (transaksiHarian > limitHarian) {
            limitReject = true;
        } else if (transaksiLuar = true && duit >2000) {
            flaggedFraud = true;
        } else if (jam >= 0000 && jam <0401 && duit > 1000) {
            otpNight = true;
        } else if (duit > 2000) {
            otpSus = true;
        } else {
            approve = true;
        }
    }
}
