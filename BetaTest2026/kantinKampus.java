package BetaTest2026;
public class kantinKampus{
    public static void main(String[] args) {

    //tipe data primitif, variabel, aritmatika.
    int hargaNasiPadang = 12000;
    byte jumlahPorsi = 2;
    int hargaTotal = hargaNasiPadang * jumlahPorsi;

    System.out.println("harga total nasi padang dengan harga 12000 dan jumlah porsi 2 adalah: " + hargaTotal);

    //operator assignment
    int totalDgnTeh = hargaTotal;
    totalDgnTeh += 5000;

    System.out.println("Total Nasgor + Es Teh: " + totalDgnTeh);

    //casting
    double totalBayar = (double) totalDgnTeh;
    System.out.println("Total Keseluruhan Pesanan:" + totalBayar);


    }
}