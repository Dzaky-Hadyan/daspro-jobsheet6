/**import java.util.Scanner;
public class Flowchart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3;
        System.out.println("Masukkan bilangan pertama: ");
        bil1 = sc.nextInt();
        System.out.println("Masukkan bilangan kedua: ");
        bil2 = sc.nextInt();
        System.out.println("Masukkan bilangan ketiga: ");
        bil3 = sc.nextInt();
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println(bil1);
            }
            else {
                System.out.println(bil3);
            }
        }
        else if (bil2 > bil3) {
            System.out.println(bil2);
        }
            else {
                System.out.println(bil3);
            }
        
    }
}**/
import java.util.Scanner;
    public class Flowchart1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bil1, bil2, bil3;
    System.out.print("Masukkan bilangan pertama: ");
    bil1 = sc.nextInt();
    System.out.print("Masukkan bilangan kedua: ");
    bil2 = sc.nextInt();
    System.out.print("Masukkan bilangan ketiga: ");
    bil3 = sc.nextInt();
    if((bil1 > bil2) && (bil1 > bil3)){
    System.out.println("Bilangan terbesar adalah " + bil1);
    } else if((bil2 > bil1) && (bil2 > bil3)){
        System.out.println("Bilangan terbesar adalah " + bil2);
        } else{
        System.out.println("Bilangan terbesar adalah " + bil3);
        }
    sc.close();
    }
}