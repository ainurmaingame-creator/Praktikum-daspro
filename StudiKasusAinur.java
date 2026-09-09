import java.util.Scanner;
public class StudiKasusAinur{
    public static void main(String[] Args) {

        //scanner

    Scanner uhuy = new Scanner(System.in);

        //variables

    int jumlahAnak, gaji, tunjanganAnak;
    double potongan, gajiPokok;

        //process

    System.out.println("Masukkan gaji bulanan: ");
    gaji = uhuy.nextInt();
    System.out.println("Masukkan jumlah Anak: ");
    jumlahAnak = uhuy.nextInt();
    System.out.println("Masukkan tunjangan per anak: ");
    tunjanganAnak = uhuy.nextInt();
    System.out.println("Masukkan potongan gaji bulanan (dalam bentuk pecahan):");
    potongan = uhuy.nextDouble();

    gajiPokok = (gaji * (1 - potongan)) + tunjanganAnak * jumlahAnak;

    System.out.println("Maka gaji bersih bulanan anda adalah: " + gajiPokok);

    uhuy.close();

    }
}