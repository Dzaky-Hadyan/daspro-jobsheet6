import java.util.Scanner;
public class Pemilihan2Percobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        double diskon, total_bayar, harga, potongan_harga;
        int pilihan_menu;
        String member, jenis_pembayaran;
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input07.nextInt();
        input07.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input07.nextLine();
        System.out.print("Masukkan jenis pembayaran (cash/QRIS) = ");
        jenis_pembayaran = input07.nextLine();
        System.out.println("-------------------------");

    if (jenis_pembayaran.equalsIgnoreCase("QRIS")) {
        potongan_harga = 1000;
    
    if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
        }

        // Menghitung total bayar setelah diskon
        System.out.println("Potongan harga QRIS " + potongan_harga);
        total_bayar = harga - (harga * diskon) - potongan_harga;
        System.out.println("Total bayar setelah diskon = " + total_bayar);
    }

        else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar
            System.out.println("Potongan harga QRIS " + potongan_harga);
            System.out.println("Total bayar = " + (harga - potongan_harga));
            } else {
                System.out.println("Member tidak valid");
            }
            System.out.println("-------------------------");
        
            input07.close();
        }
    }
}