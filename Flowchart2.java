import java.util.Scanner;
public class Flowchart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jmlBuku;
        double diskon = 0.0;
        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jmlBuku = sc.nextInt();
        if (jenisBuku.equalsIgnoreCase("kamus")) {
        diskon = 0.1;
            if (jmlBuku > 2) {
            diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
        diskon = 0.07;
            if (jmlBuku > 3) {
            diskon += 0.02;
            } 
            else {
            diskon += 0.01;
            } } 
        else {
            if (jmlBuku > 3) {
        diskon = 0.05;
        } }
        System.out.println("Total Diskon = " + diskon);
    sc.close();
    }
}