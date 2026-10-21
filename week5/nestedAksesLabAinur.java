
import java.util.Scanner;

public class nestedAksesLabAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;
        
                System.out.print("Apakah pengguna mahasiswa? (true/false): ");
                mahasiswaAktif= uhuy.nextBoolean();
                System.out.print("Apakah pengguna asLab? (true/false): ");
                asistenLab= uhuy.nextBoolean();
                System.out.print("Apakah pengguna punya izin dosen? (true/false): ");
                punyaIzinDosen = uhuy.nextBoolean();
                System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
                sedangDisanksi = uhuy.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
        if (punyaIzinDosen || asistenLab) {
        System.out.println("Akses laboratorium diberikan");
        } else {
        System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
        }
        } else {
        System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
