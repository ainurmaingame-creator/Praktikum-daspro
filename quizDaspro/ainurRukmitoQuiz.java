import java.util.Scanner;
//Ainur Rukmito Ilhamdi (04) TI1D
public class ainurRukmitoQuiz{
    public static void main(String[] args) {
        // deklarasi scanner
        Scanner uhuy = new Scanner(System.in);

        //deklarasi variabel ponsel
        int jualHp, beliHp, kemasHp, ongkirHp, jmlPenjualanPonsel, diskonHp, keuntunganItemPonsel, totalPonsel, targetUntungPonsel;
        double fkrHp, PonselUntung, jmlUntungPonsel, meanPonsel, persentaseKeuntungandariHarapanPonsel;

        //deklarasi variabel kabel
        int jualKabel, beliKabel, kemasKabel, ongkirKabel, jmlPenjualanKabel, diskonKabel, targetUntungKabel, keuntunganItemKabel, totalKabel;
        double fkrKabel, kabelUntung, jmlUntungKabel, meanKabel, persentaseKeuntungandariHarapanKabel;

        //deklarasi variabel earphone
        int jualEp, beliEp, kemasEp, ongkirEp, jmlPenjualanEp, diskonEp, keuntunganItemEp, totalEp, targetUntungEp;
        double fkrEp, epUntung, jmlUntungEp, meanEp, persentaseKeuntungandariHarapanEp;

        //proses input value pada variabel
        System.out.println("=== DATA PENJUALAN PONSEL ===");
        System.out.println("Masukkan harga jual HP, harga beli HP, harga pengemasan HP, ongkos kirim HP, diskon HP, dan jumlah penjualan HP secara beurutan: ");
        //input
        System.out.print("Harga jual: ");
        jualHp = uhuy.nextInt();

        System.out.print("Harga beli: ");
        beliHp = uhuy.nextInt();

        System.out.print("Harga pengemasan: ");
        kemasHp = uhuy.nextInt();

        System.out.print("Ongkos kirim: ");
        ongkirHp = uhuy.nextInt();
        
        System.out.print("Diskon: ");
        diskonHp = uhuy.nextInt();

        System.out.print("Jumlah penjualan: ");
        jmlPenjualanPonsel = uhuy.nextInt();
        
        System.out.print("Target Keuntungan: ");
        targetUntungPonsel = uhuy.nextInt();

            //persentase faktor risiko kerusakan
            System.out.print("Masukkan persentase faktor risiko kerusakan: ");
            fkrHp = uhuy.nextDouble();

        //proses menghitung
        keuntunganItemPonsel = jualHp - beliHp - ongkirHp - kemasHp - diskonHp;
        totalPonsel = keuntunganItemPonsel * jmlPenjualanPonsel;
        PonselUntung = jmlPenjualanPonsel - (fkrHp/100 * jmlPenjualanPonsel);
        meanPonsel = totalPonsel / PonselUntung;
        jmlUntungPonsel = (long) PonselUntung * keuntunganItemPonsel;
        persentaseKeuntungandariHarapanPonsel = totalPonsel/targetUntungPonsel * 100;

        //output final hp
        System.out.println("Keuntungan tiap unit ponsel: " + keuntunganItemPonsel);
        System.out.println("Keuntungan seluruh unit ponsel sebelum penghitungan risiko kerusakan: " + totalPonsel);
        System.out.println("Keuntungan seluruh unit ponsel pasca hitung kerusakan: " + jmlUntungPonsel);
        System.out.println("Mean keuntungan seluruh unit HP: " + meanPonsel);
        System.out.println("Persentase keuntungan yang dicapai dari target keuntungan total yang diharapkan: " + persentaseKeuntungandariHarapanPonsel);
        
        // === KABEL ===

        //proses input value pada variabel
        System.out.println("=== DATA PENJUALAN KABEL ===");
        
        //input
        System.out.print("Harga jual: ");
        jualKabel = uhuy.nextInt();

        System.out.print("Harga beli: ");
        beliKabel = uhuy.nextInt();

        System.out.print("Harga pengemasan: ");
        kemasKabel = uhuy.nextInt();

        System.out.print("Ongkos kirim: ");
        ongkirKabel = uhuy.nextInt();
        
        System.out.print("Diskon: ");
        diskonKabel = uhuy.nextInt();

        System.out.print("Jumlah penjualan: ");
        jmlPenjualanKabel = uhuy.nextInt();
        
        System.out.print("Target Keuntungan: ");
        targetUntungKabel = uhuy.nextInt();

            //persentase faktor risiko kerusakan
            System.out.print("Masukkan persentase faktor risiko kerusakan: ");
            fkrKabel = uhuy.nextDouble();

        //proses menghitung
        keuntunganItemKabel = jualKabel - beliKabel - ongkirKabel - kemasKabel - diskonKabel;
        totalKabel = keuntunganItemKabel * jmlPenjualanKabel;
        kabelUntung = jmlPenjualanKabel - (fkrKabel/100 * jmlPenjualanKabel);
        meanKabel = totalKabel / kabelUntung;
        jmlUntungKabel = (long) kabelUntung * keuntunganItemKabel;
        persentaseKeuntungandariHarapanKabel = totalKabel/targetUntungKabel * 100;

        //output final hp
        System.out.println("Keuntungan tiap unit kabel: " + keuntunganItemKabel);
        System.out.println("Keuntungan seluruh unit kabel sebelum penghitungan risiko kerusakan: " + totalKabel);
        System.out.println("Keuntungan seluruh unit kabe; pasca hitung kerusakan: " + jmlUntungKabel);
        System.out.println("Mean keuntungan seluruh unit kabe;: " + meanKabel);
        System.out.println("Persentase keuntungan yang dicapai dari target keuntungan total yang diharapkan: " + persentaseKeuntungandariHarapanKabel);
        
        // === EARPHONE ===

        //proses input value pada variabel
        System.out.println("=== DATA PENJUALAN EARPHONE ===");
        
        //input
        System.out.print("Harga jual: ");
        jualEp = uhuy.nextInt();

        System.out.print("Harga beli: ");
        beliEp = uhuy.nextInt();

        System.out.print("Harga pengemasan: ");
        kemasEp = uhuy.nextInt();

        System.out.print("Ongkos kirim: ");
        ongkirEp = uhuy.nextInt();
        
        System.out.print("Diskon: ");
        diskonEp = uhuy.nextInt();

        System.out.print("Jumlah penjualan: ");
        jmlPenjualanEp = uhuy.nextInt();
        
        System.out.print("Target Keuntungan: ");
        targetUntungEp = uhuy.nextInt();

            //persentase faktor risiko kerusakan
            System.out.print("Masukkan persentase faktor risiko kerusakan: ");
            fkrEp = uhuy.nextDouble();

        //proses menghitung
        keuntunganItemEp = jualEp - beliEp - ongkirEp - kemasEp - diskonEp;
        totalEp = keuntunganItemEp * jmlPenjualanEp;
        epUntung = jmlPenjualanEp - (fkrEp/100 * jmlPenjualanEp);
        meanEp = totalEp / epUntung;
        jmlUntungEp = (long) epUntung * keuntunganItemEp;
        persentaseKeuntungandariHarapanEp = totalEp/targetUntungEp * 100;

        //output final hp
        System.out.println("Keuntungan tiap unit earphone: " + keuntunganItemEp);
        System.out.println("Keuntungan seluruh unit earphone sebelum penghitungan risiko kerusakan: " + totalEp);
        System.out.println("Keuntungan seluruh unit earphone; pasca hitung kerusakan: " + jmlUntungEp);
        System.out.println("Mean keuntungan seluruh unit earphone: " + meanEp);
        System.out.println("Persentase keuntungan yang dicapai dari target keuntungan total yang diharapkan: " + persentaseKeuntungandariHarapanEp);

        //menghitung total keuntungan akhir semua produk
        double keuntunganTotal = jmlUntungEp + jmlUntungKabel + jmlUntungPonsel;

        //output final

        System.out.println("=== OUTPUT FINAL ===");
        System.out.println("total keuntungan seluruh produk: " + keuntunganTotal);

        uhuy.close();

    }
}
