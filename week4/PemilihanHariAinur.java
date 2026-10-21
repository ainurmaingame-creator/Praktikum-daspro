
import java.util.Scanner;

public class PemilihanHariAinur {
    public static void main(String[] args) {
        //scanner
        Scanner uhuy = new Scanner(System.in);

        //variable
        String namaHari, dayType;

        //sikatt!
        System.out.print("Masukkan hari: ");
        namaHari = uhuy.nextLine();

        switch (namaHari.toLowerCase()) {
            case "senin" : 
            case "selasa" : 
            case "rabu" : 
            case "kamis" : 
            case "jumat" :
                dayType = "Weekday"; 
                break;
            case "sabtu" :
            case "minggu" :
                dayType = "Weekend";
                break;
            default:
                dayType = "Masukkan nama hari dalam bahasa indonesia yang baik";
        }
        System.out.println(dayType);
        uhuy.close();
    }
}
