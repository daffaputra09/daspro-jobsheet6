import java.util.Scanner;

public class Pemilihan2Percobaan206 {

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        String member, pembayaran;
        int menu, jumlahBeli;
        double totalBayar, diskon, harga;

        System.out.println("-----------------------------------------");
        System.out.println("============= MENU KAFE JTI =============");
        System.out.println("-----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input06.nextInt();
        input06.nextLine();
        System.out.print("Masukkan jumlah yang dibeli = ");
        jumlahBeli = input06.nextInt();
        input06.nextLine();
        System.out.print("Apakah punya member (y/n) = ");
        member = input06.nextLine();
        System.out.print("Apakah metode pembayaran menggunakan QRIS (y/n) = ");
        pembayaran = input06.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Jumlah yang dibeli = " + jumlahBeli);
            totalBayar = (harga - (harga * diskon)) * jumlahBeli;
        } else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Jumlah yang dibeli = " + jumlahBeli);
            totalBayar = harga * jumlahBeli;
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        if (pembayaran.equalsIgnoreCase("y")) {
            totalBayar -= 1000; 
            System.out.println("Potongan harga QRIS = Rp 1000");
        }

        System.out.println("Total bayar setelah diskon dan potongan QRIS = " + totalBayar);
        System.out.println("-----------------------------------------");
    }
}
