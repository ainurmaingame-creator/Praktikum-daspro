package BetaTest2026;

public class array1 {
    public static void main(String[] args) {
        
        //inisialisasi
        int[] nilai = {19,23,20,11};

        //instansiasi
        int[] nilae = new int[9];
    
        //assignment

        nilae [0] = 1;
        nilae [1] = 13;
        nilae [2] = 12;
        nilae [3] = 33;
        nilae [4] = 67;
        nilae [5] = 75;
        nilae [6] = 73;
        nilae [7] = 22;
        nilae [8] = 90;

        // System.out.println(nilae[1]);                               //kosongan
        // System.out.println("Banyak bilah kosong: " + nilae.length); //ngeluarin panjang rak

        // System.out.println("isi: " + nilae[0]);
        // System.out.println("isi: " + nilae[1]);
        // System.out.println("isi: " + nilae[7]);
        // System.out.println("isi: " + nilae[8]);

        for (int i = 0; i < nilae.length; i++) {
            System.out.println(nilae[i]);
        }
    }
}
