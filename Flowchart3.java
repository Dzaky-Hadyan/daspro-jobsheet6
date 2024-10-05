import java.util.Scanner;
public class Flowchart3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String merk;
    String kategori;
    int ukuran;
    System.out.print("Masukkan merk sepatu yang dicari : ");
    merk = sc.nextLine();
    System.out.print("Masukkan kategori sepatu yang dicari : ");
    kategori = sc.nextLine();
    System.out.print("Masukkan ukuran sepatu yang dicari : ");
    ukuran = sc.nextInt();
    if (merk.equalsIgnoreCase("Specs")) {
        if (kategori.equalsIgnoreCase("Slip On")) {
            if (ukuran >= 36) {
                if (ukuran < 40) {
                System.out.println("Sepatu yang anda cari berharga Rp. 800.000");
                } else {
                System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                }
            }
        } else if (kategori.equalsIgnoreCase("High Top")) {
                    if (ukuran >= 40) {
                        if (ukuran <= 44) {
                        System.out.println("Sepatu yang anda cari berharga Rp. 1.200.000");
                        } else {
                        System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                        }
                    } else {
                    System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                    }
                } else {
                System.out.println("Kategori yang anda cari tidak tersedia");
                }
    } else if (merk.equalsIgnoreCase("910")) {
                if (kategori.equalsIgnoreCase("Woman")) {
                    if (ukuran >= 36) {
                        if (ukuran < 41) {
                        System.out.println("Sepatu yang anda cari berharga Rp. 1.000.000");
                        } else {
                        System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                        }
                    } else {
                    System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                    }
                } else if (kategori.equalsIgnoreCase("Man")) {
                            if (ukuran >= 41) {
                                if (ukuran <= 44) {
                                System.out.println("Sepatu yang anda cari berharga Rp. 1.800.000");
                                } else {
                                System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                                }
                            } else {
                            System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                            }
                        } else {
                        System.out.println("Kategori yang anda cari tidak tersedia");
                        }
            } else if (merk.equalsIgnoreCase("Ortus")) {
                        if (kategori.equalsIgnoreCase("Kids")) {
                            if (ukuran >= 36) {
                                if (ukuran < 40) {
                                System.out.println("Sepatu yang anda cari berharga Rp. 750.000");
                                } else {
                                System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                                }
                            } else {
                            System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                            }
                        } else if (kategori.equalsIgnoreCase("Adults")){
                                    if (ukuran >= 40) {
                                        if (ukuran <= 44) {
                                        System.out.println("Sepatu yang anda cari berharga Rp. 1.500.000");
                                        } else {
                                        System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                                        }
                                    } else {
                                    System.out.println("Ukuran sepatu yang anda cari tidak tersedia");
                                    }
                                } else {
                                System.out.println("Kategori yang anda cari tidak tersedia");
                                }
                    } else {
                    System.out.println("Merk yang anda cari tidak tersedia");
                    }
    sc.close();
    }
}          