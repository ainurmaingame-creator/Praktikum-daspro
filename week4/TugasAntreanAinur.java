
import java.util.Scanner;

public class TugasAntreanAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        int pil;
        System.out.println("=== MESIN ANTREAN DIGITAL ===");
        System.out.println("1. Legalisir Ijazah");
        System.out.println("2. Surat Keterangan Aktif Kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan Cuti Akademik");
        System.out.print("Masukkan kode layanan: ");
        pil = uhuy.nextInt();

        switch (pil) {
            case 1:
                System.out.println("Silahkan pergi ke loket A.");
                break;
            case 2:
                System.out.println("Silahkan pergi ke loket B.");
                break;
            case 3:
                System.out.println("Silahkan pergi ke loket C.");
                break;
            case 4:
                System.out.println("Silahkan pergi ke loket D.");
                break;
            default:
                System.out.println("Kode  layanan tidak tersedia");
                break;
        }
    }
}
