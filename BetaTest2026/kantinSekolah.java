package BetaTest2026;

public class kantinSekolah {
    public static void main(String[] args) {
        
        //Step1
        int porsi = 2;
        int harga = 12000;
        int duaPorsi = porsi * harga;

        System.out.println("Dua porsi nasi goreng seharga 12000 totalnya: " + duaPorsi);

        //Step2
        float denganTeh = duaPorsi += 3500.50;

        System.out.println("Dua porsi nasgor dengan es teh: " + denganTeh);

        //Step3
        float setelahDiskon = denganTeh *= 0.9f;

        System.out.println("Setelah dikenakan diskon 10% harga akhirnya adalah: " + setelahDiskon);

        //Step4
        int hargaBayar = (int) setelahDiskon;
        System.out.println("Harga akhir pembayaran adalah: " + hargaBayar);

    }
}
