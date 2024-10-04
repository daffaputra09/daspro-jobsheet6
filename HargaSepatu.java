import java.util.Scanner;

public class HargaSepatu {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        String merk, kategori;
        int ukuran;
        double harga;
        boolean ukuranValid;

        System.out.print("Masukkan merk sepatu: ");
        merk = input06.nextLine();
        System.out.print("Masukkan kategori: ");
        kategori = input06.nextLine();
        System.out.print("Masukkan ukuran: ");
        ukuran = input06.nextInt();

        switch (merk.toLowerCase()) {
            case "converse":
                switch (kategori.toLowerCase()) {
                    case "slip on":
                        ukuranValid = (ukuran >= 36 && ukuran <= 40);
                        harga = 800000;
                        break;
                    case "high top":
                        ukuranValid = (ukuran >= 40 && ukuran <= 44);
                        harga = 1200000;
                        break;
                    default:
                        System.out.println("Kategori tidak valid");
                        return;
                }
                break;
            case "sketcher":
                switch (kategori.toLowerCase()) {
                    case "woman":
                        ukuranValid = (ukuran >= 36 && ukuran <= 41);
                        harga = 1000000;
                        break;
                    case "man":
                        ukuranValid = (ukuran >= 41 && ukuran <= 44);
                        harga = 1800000;
                        break;
                    default:
                        System.out.println("Kategori tidak valid");
                        return;
                }
                break;
            case "nike":
                switch (kategori.toLowerCase()) {
                    case "kids":
                        ukuranValid = (ukuran >= 36 && ukuran <= 40);
                        harga = 750000;
                        break;
                    case "adult":
                        ukuranValid = (ukuran >= 40 && ukuran <= 44);
                        harga = 1500000;
                        break;
                    default:
                        System.out.println("Kategori tidak valid");
                        return;
                }
                break;
            default:
                System.out.println("Merk tidak valid");
                return;
        }

        if (ukuranValid) {
            System.out.println("Harga: Rp. " + harga);
        } else {
            System.out.println("Ukuran tidak valid");
        }
    }
}