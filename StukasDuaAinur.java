import java.util.Scanner;
public class StukasDuaAinur{
    public static void main(String[] args) {
    //scanner
    Scanner uhuy = new Scanner(System.in);
    //variables
    int lebar, panjang, diameterKolam, sisiKebun;
    double luasKolam, tanahTerpakai, tanahTidak, luasTanah, luasKebun;
    //process
    System.out.println("Masukkan lebar tanah: ");
    lebar = uhuy.nextInt();
    System.out.println("Masukkan panjang tanah: ");
    panjang = uhuy.nextInt();
    System.out.println("Masukkan diameter kolam (jika tidak ada masukkan 0): ");
    diameterKolam = uhuy.nextInt();
    System.out.println("Masukkan panjang sisi kebun (jika tidak ada masukkan 0): ");
    sisiKebun = uhuy.nextInt();
    luasTanah = lebar * panjang;
    luasKolam = diameterKolam * 3.14f;
    luasKebun = 2 * sisiKebun;
    tanahTerpakai = luasTanah - luasKolam - luasKebun;
    tanahTidak = luasTanah - tanahTerpakai;
    System.out.println(String.format("luas kolam: %s, luas kebun: %s, luas tanah yang dipakai: %s, luas tanah yang tidak dipakai: %s.", luasKolam, luasKebun,tanahTerpakai, tanahTidak));
    
    uhuy.close();
}
}