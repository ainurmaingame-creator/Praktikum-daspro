import java.util.Scanner;
public class StudiKasus2Ainur {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        String namaMasis, perlombaan;    //inisialisasi variabel String
        int jmlDoc, peringkat, danaPKM;  //inisialisasi variabel integer

        System.out.print("Masukkan nama: "); 
        namaMasis = uhuy.nextLine();           //input nama
        System.out.print("Kegiatan yang diikuti(BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        perlombaan = uhuy.nextLine();          //input kegiatan  
        System.out.print("Jumlah dokumen: ");
        jmlDoc = uhuy.nextInt();               //input jumlah dokumen

        //pemilihan kegiatan
        if ((perlombaan.equalsIgnoreCase("BELMAWA") || perlombaan.equalsIgnoreCase("BAKORMA") || perlombaan.equalsIgnoreCase("MANDIRI")) && jmlDoc == 4 ) {
                    System.out.print("Peringkat juara: ");
                    peringkat = uhuy.nextInt();            // input juara

            if (jmlDoc == 4 && peringkat >0 && peringkat <4) { // 4 dokumen menjadi persyaratan pencairan dana
                System.out.println("Dana diberikan.");
            } else {
                System.out.println("Dana tidak diberikan.");
            }

        } else if (perlombaan.equalsIgnoreCase("PKM")) { //untuk kasus PKM
            if (jmlDoc == 4) {  //hanya ketika jumlah dokumen 4, proses nested if akan dilanjutkan
            System.out.print("Masukkan status lolos pendanaan tim(1 = lolos/0 = tidak): ");
            danaPKM = uhuy.nextInt();
            if (danaPKM == 1) { //katakanlah 1 merupakan representasi dari "ya"
                System.out.println("Dana diberikan.");
            } else if (danaPKM == 0) {
                System.out.println("Dana tidak diberikan.");
            } } else { //merupakan outcome dari jmlDoc != 4
                System.out.println("Dana tidak diberikan");
            }

        } else { //merupakan outcome dari kegiatan selian BAKORMA, BELMAWA, PKM, dan MANDIRI.
            System.out.println("Dana tidak diberikan.");
        }

    }
}
