
import java.util.Scanner;

public class PemilihanIfElseAinur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        int semester;

        System.out.print("masukkan semester anda: ");
        semester = uhuy.nextInt();

        if (semester == 1) {
            System.out.println("menampilkan KRS semester " + semester);
        } else if (semester == 2) {
            System.out.println("menampilkan KRS semester " + semester);
        } else if (semester == 3) {
            System.out.println("menampilkan KRS semester " + semester);
        } else if (semester == 4) {
            System.out.println("menampilkan KRS semester " + semester);
        } else if (semester == 5) {
            System.out.println("menampilkan KRS semester " + semester);
        } else if (semester == 6) {
            System.out.println("menampilkan KRS semester " + semester);
        } else if (semester == 7) {
            System.out.println("menampilkan KRS semester " + semester);
        } else if (semester == 8) {
            System.out.println("menampilkan KRS semester " + semester);
        } else {
            System.out.println("mohon masukkan semester anda dengan rentang angka 1-8");
        }
    }
}
