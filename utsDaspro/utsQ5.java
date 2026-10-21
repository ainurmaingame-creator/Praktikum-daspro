import java.util.Scanner;
//Ainur Rukmito Ilhamdi
//TI 1D
//264107020146
public class utsQ5 {
    public static void main(String[] args) {
        Scanner uhuy = new Scanner(System.in);
        //inisialisasi variabel
        int damage;
        boolean statusArmor;
        double dmgReduction, dmgFinal;
        String senjata, bagianTubuh;
        //proses input
        System.out.print("Masukkan tipe senjata: ");
        senjata = uhuy.nextLine();
        System.out.print("\nMasukkan bagian tubuh yang terkena tembakan: ");
        bagianTubuh = uhuy.nextLine();

        if (senjata.equalsIgnoreCase("SNIPER")) {
            if (bagianTubuh.equalsIgnoreCase("BADAN")) {
                damage = 90;
                dmgReduction = 0;
                dmgFinal = damage;
                dmgFinal = damage * (1-dmgReduction);
            } else if (bagianTubuh.equalsIgnoreCase("KEPALA")) {
                damage = 100;
                dmgFinal = damage;
                dmgReduction = 0;
                System.out.println("HEADSHOT!!! musuh langsung knockdown");
                dmgFinal = damage * (1-dmgReduction);
            } else {
                System.out.println("Input tidak valid, pastikan bagian = (kepala/badan).");
            }
        } else if (senjata.equalsIgnoreCase("SMG")) {
            System.out.println("Masukkan status penggunaan armor(true/false): ");
            statusArmor = uhuy.nextBoolean();

            if (statusArmor = true) {
                dmgReduction = 0.3;
                if (bagianTubuh.equalsIgnoreCase("BADAN")) {
                    damage = 25;
                    
                    dmgFinal = damage * (1-dmgReduction);
                } else if (bagianTubuh.equalsIgnoreCase("KEPALA")) {
                    damage = 45;
                    dmgFinal = damage * (1-dmgReduction);
                } else {
                    System.out.println("Input tidak valid, pastikan bagian = (kepala/badan).");
                }
            } else if (statusArmor = false) {
                dmgReduction = 0;
                
            } else {
                System.out.println("Input tidak valid, pastikan status armor = (true/false)");
            }
            
        } else if (senjata.equalsIgnoreCase("AR")) {
            if (bagianTubuh.equalsIgnoreCase("BADAN")) {
                damage = 25;
                System.out.println("Masukkan status penggunaan armor(true/false): ");
                statusArmor = uhuy.nextBoolean();
                    if (statusArmor = true) {
                dmgReduction = 0.2;
                dmgFinal = damage * (1-dmgReduction);
                    System.out.println("Damage dasar adalah: "+ damage);
                    System.out.println("Pengurangan damage adalah: "+ dmgReduction);
                    System.out.println("Damage terakhir adalah: "+ dmgFinal);
                    } else if (statusArmor = false) {
                dmgReduction = 0;
                dmgFinal = damage * (1-dmgReduction);
                } else {
                System.out.println("Input tidak valid, pastikan status armor = (true/false)");
                }
            } else if (bagianTubuh.equalsIgnoreCase("KEPALA")) {
                damage = 45;
                dmgReduction = 0;
                dmgFinal = damage;
                    System.out.println("Damage dasar adalah: "+ damage);
                    System.out.println("Pengurangan damage adalah: "+ dmgReduction);
                    System.out.println("Damage terakhir adalah: "+ dmgFinal);
            } else {
                System.out.println("Input tidak valid, pastikan bagian = (kepala/badan).");
            }
        } else {
            System.out.println("Input tidak valid, pastikan senjata = (AR/SNIPER/SMG)");
        }
    }
}