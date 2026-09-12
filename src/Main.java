import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Nama barang 1 : ");
        String nama1 = input.nextLine();

        System.out.print("Harga satuan  : ");
        int harga1 = input.nextInt();

        System.out.print("Jumlah        : ");
        int jumlah1 = input.nextInt();
        input.nextLine();

        System.out.print("\nNama barang 2 : ");
        String nama2 = input.nextLine();

        System.out.print("Harga satuan  : ");
        int harga2 = input.nextInt();

        System.out.print("Jumlah        : ");
        int jumlah2 = input.nextInt();
        input.nextLine();

        System.out.print("\nNama barang 3 : ");
        String nama3 = input.nextLine();

        System.out.print("Harga satuan  : ");
        int harga3 = input.nextInt();

        System.out.print("Jumlah        : ");
        int jumlah3 = input.nextInt();

        int subtotal1 = harga1 * jumlah1;
        int subtotal2 = harga2 * jumlah2;
        int subtotal3 = harga3 * jumlah3;

        int totalBelanja = subtotal1 + subtotal2 + subtotal3;

        System.out.print("\nUang dibayar  : ");
        int uangDibayar = input.nextInt();

        int kembalian = uangDibayar - totalBelanja;



    }
}