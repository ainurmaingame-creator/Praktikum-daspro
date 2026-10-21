import java.util.Scanner;
public class StudiKasus1Ainur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        int perCup = 18000, jumlahCup, bayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = uhuy.nextInt();
        System.out.print("Masukkan uang bayar: ");
        bayar = uhuy.nextInt();

        totalHarga = jumlahCup * perCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        } else {}
        totalBayar = totalHarga - diskon;

        System.out.println(String.format("Harga sebelum diskon: %d. Diskon: %d. Harga setelah diskon: %d.", totalHarga, diskon, totalBayar));

        if (bayar >= totalBayar) {
            kembalian = bayar - totalBayar;
            System.out.println("Kembalian: "+kembalian);
        } else {
            kurang = totalBayar - bayar;
            System.out.println("Uang tidak cukup, kurang: "+kurang);
        }
        uhuy.close();
    }
}
