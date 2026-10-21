import java.util.Scanner;
public class PemilihanSwitchAinur {
    public static void main(String[] args) {
        //scanner
        Scanner uhuy = new Scanner(System.in);
        //variabel
        int semester;

        System.out.println("=== SIAKAD ===");
        System.out.print("Silahkan masukkan semester anda saat ini: ");
        semester = uhuy.nextInt();

        switch (semester) {
            case 1:
                System.out.println("menampilkan KRS semester " + semester);
                break;
            case 2:
                System.out.println("menampilkan KRS semester " + semester);
                break;
            case 3:
                System.out.println("menampilkan KRS semester " + semester);
                break;
            case 4:
                System.out.println("menampilkan KRS semester " + semester);
                break;
            case 5:
                System.out.println("menampilkan KRS semester " + semester);
                break;
            case 6:
                System.out.println("menampilkan KRS semester " + semester);
                break;
            case 7:
                System.out.println("menampilkan KRS semester " + semester);
                break;
            case 8:
                System.out.println("menampilkan KRS semester " + semester);
                break;
            default:
                System.out.println("mohon masukkan semester anda dengan rentang angka 1-8");
        }
        
        uhuy.close();
    }
}
