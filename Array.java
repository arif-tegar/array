
import java.util.Scanner;

//Driver Class
public class Array {
    public static void main(String[] args) {
        // int[] angka = {1, 2, 3};
        // int[] angka2 = new int [5];
        // angka2[0] = 10;
        // angka2[3] = 100;
        
        // String[] nama = {"Ana", " Salsa", "Adi"};
        // String[] nama2 = new String[10];
    

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan jumlah objek: ");
        int objek = in.nextInt();

        //Array object     
        Product[] p = new Product[10];
        for (int i = 0; i < p.length; i++) {
            System.out.println("Masukkan nomor: ");
            int number = in.nextInt();
            System.out.println("Masukkan nama: ");
            String name = in.next();
            System.out.println("Masukkan quantity: ");
            int quantity = in.nextInt();
            System.out.println("Masukkan Price");
            double price = in.nextDouble();
            p[i] = new Product(number, name, quantity, price);
            p[i].print(); 
        }
        p[1] = new Product();
        //loop
        // CD[] c = new CD[5];
        // c[4] = new CD();
    }
}
