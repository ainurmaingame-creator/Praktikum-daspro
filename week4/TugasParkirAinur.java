
import java.util.Scanner;

public class TugasParkirAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);

        System.out.print("Masukkan lama parkir: ");
        int jam = uhuy.nextInt();
        int biaya;
        if (jam > 2) {
            biaya = 2000 + 1000*(jam-2);
        } else {
            biaya = 2000;
        }

        System.out.println("Biaya akhir: " + biaya);
    }
}
