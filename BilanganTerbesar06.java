import java.util.Scanner;

public class BilanganTerbesar06 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        int bil1, bil2, bil3, bilTerbesar;

        System.out.print("Masukkan bilangan 1 = ");
        bil1 = input06.nextInt();
        System.out.print("Masukkan bilangan 2 = ");
        bil2 = input06.nextInt();
        System.out.print("Masukkan bilangan 3 = ");
        bil3 = input06.nextInt();

        if (bil1 > bil2) {
            bilTerbesar = (bil1 > bil3) ? bil1 : bil3;
        } else {
            bilTerbesar = (bil2 > bil3) ? bil2 : bil3;
        }

        System.out.println("Bilangan Terbesar = " + bilTerbesar);
    }
}
