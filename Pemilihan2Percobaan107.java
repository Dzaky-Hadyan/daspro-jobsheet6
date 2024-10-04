import java.util.Scanner;
public class Pemilihan2Percobaan107{
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input07.nextInt();
        if ((tahun % 400) == 0) {
            System.out.println("Tahun kabisat");
        }
        else if ((tahun % 100) == 0) {
            System.out.println("Tahun kabisat");
        }
        else if ((tahun % 4) == 0) {
            System.out.println("Tahun kabisat");
        }
        else {
            System.out.println("Bukan Tahun kabisat");
        }
        input07.close();
    }
}