
import java.util.Scanner;

public class nestedUjianSkripsiAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        String pesan;

        System.out.println("Apakah mahasiswa bebas kompen?");
        String bebasKompen = uhuy.nextLine().trim();

        System.out.print("Masukkan jumlah log dengan dosen pembimbing 1: ");
        int bimbinganP1 = uhuy.nextInt();
        System.out.print("Masukkan jumlah log dengan dosen pembimbing 2: ");
        int bimbinganP2 = uhuy.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
        if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
        pesan = "All requirements met. The student may register for the thesis exam";
        } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
        pesan = "Failed! Guidance sessions with Supervisor 1 are below 8 and Supervisor 2 are below 4";
        } else if (bimbinganP1 < 8) {
        pesan = "Failed! Guidance sessions with Supervisor 1 have not reached 8";
        } else {
        pesan = "Failed! Guidance sessions with Supervisor 2 have not reached 4";
        }   } else {
            pesan = "Failed! The student still has an outstanding penalty";
        }
        System.out.println(pesan);
    }
}
