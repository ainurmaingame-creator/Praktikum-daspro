import java.util.Scanner;
public class BankAinur{
    public static void main(String[] Args) {

        //Scanner

        Scanner uhuy = new Scanner(System.in);

        //Variables

        int jumlahTabungan, lamaMenabung;
        double bunga, jumlahAkhir, prosentaseBunga;

        //Process

        System.out.println("Masukkan jumlah awal tabungan: ");
        jumlahTabungan = uhuy.nextInt();
        System.out.println("Masukkan berapa tahun anda menabung");
        lamaMenabung = uhuy.nextInt();
        System.out.println("Masukkan prosentase bunga");
        prosentaseBunga = uhuy.nextDouble();

        bunga = lamaMenabung * prosentaseBunga * jumlahTabungan; 
        jumlahAkhir = bunga + jumlahTabungan;

        System.out.println("jumlah bunga adalah =" + bunga);
        System.out.println("jumlah tabungan terakhir anda adalah = " + jumlahAkhir);

        uhuy.close();

    }
} 