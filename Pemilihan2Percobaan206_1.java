import java.util.Scanner;

public class Pemilihan2Percobaan206_1 { public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        String member;
        int menu, jumlahBeli;
        double totalBayar, diskon, harga;

        System.out.println("-----------------------------------------");
        System.out.println("============= MENU KAFE JTI =============");
        System.out.println("-----------------------------------------");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input06.nextInt();
        input06.nextLine();
        System.out.print("Masukkan jumlah yang dibeli = ");
        jumlahBeli = input06.nextInt();
        input06.nextLine();
        System.out.print("Apakah punya member (y/n) = ");
        member = input06.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 12000;
                System.out.println("Harga Kopi = " + harga);
            }
            else if (menu == 2) {
                harga = 7000;
                System.out.println("Harga Teh = " + harga);
            }
            else if (menu == 3) {
                harga = 20000;
                System.out.println("Harga Roti = " + harga);
            }
            else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            totalBayar = (harga - (harga*diskon)) * jumlahBeli;
            System.out.println("Total bayar setelah diskon = " + totalBayar);
        }
        else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 12000;
                System.out.println("Harga Kopi = " + harga);
            }
            else if (menu == 2) {
                harga = 7000;
                System.out.println("Harga Teh = " + harga);
            }
            else if (menu == 3) {
                harga = 20000;
                System.out.println("Harga Roti = " + harga);
            }
            else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            totalBayar = harga * jumlahBeli;
            System.out.println("Total bayar = " + totalBayar);
        }
        else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-----------------------------------------");
    }
}
