import java.util.Scanner;
public class SegitigaAinur{
    public static void main(String[] Args) {

        //scanner

        Scanner uhuy = new Scanner (System.in);

        //variable

        int tinggi, alas;
        float luas;

        //process

        System.out.println("Masukkan tinggi: ");
        tinggi = uhuy.nextInt();
        System.out.println("Masukkan alas: ");
        alas = uhuy.nextInt();
        
        //operation

        luas = tinggi * alas / 2f;

        System.out.println("luas = " + luas);
        
        uhuy.close();
    }
}