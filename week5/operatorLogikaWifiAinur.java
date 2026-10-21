
import java.util.Scanner;

public class operatorLogikaWifiAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        boolean dosen;
        boolean mahasiswa;
        boolean diblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = uhuy.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = uhuy.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        diblokir = uhuy.nextBoolean();

        if ((mahasiswa || dosen) && !diblokir) {
        System.out.println("Akses WiFi diberikan");
        } else {
        System.out.println("Akses WiFi ditolak");
        }


    }
}
