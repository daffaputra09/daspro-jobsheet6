import java.util.Scanner;

public class DiskonBuku {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        
        String hari, jenisBuku;
        int jumlahBeli;
        double diskon = 0.0, hargaBuku, total;

        System.out.print("Masukkan Hari: ");
        hari = input06.nextLine().toLowerCase();
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input06.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBeli = input06.nextInt();
        System.out.print("Masukkan harga buku: ");
        hargaBuku = input06.nextDouble();

        total = hargaBuku * jumlahBeli;

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenisBuku.equalsIgnoreCase("kamus") || jenisBuku.equalsIgnoreCase("novel")) {
                if (jenisBuku.equalsIgnoreCase("kamus")) {
                    diskon = 0.10;
                    if (jumlahBeli > 2) diskon += 0.02; 
                } else {
                    diskon = 0.07;
                    if (jumlahBeli > 3) diskon += 0.02;
                    else diskon += 0.01;  
                }
            } else {
                if (jumlahBeli > 3) diskon = 0.05;
            }
        } else {
            System.out.println("Diskon hanya berlaku hari rabu");
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("Total harga sebelum diskon: Rp. " + total);
        total = total - (total * diskon);
        System.out.println("Diskon yang diperoleh: " + String.format("%.2f", (diskon * 100)) + "%");
        System.out.println("Total yang harus dibayar: Rp. " + total);
        System.out.println("-----------------------------------------");
    }
}
