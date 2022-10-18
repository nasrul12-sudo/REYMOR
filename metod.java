import java.util.Scanner;

public class metod {
    private String kodeBarang;
    private String namaBarang;
    private int jumlah;
    private double harga;

    public metod(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    public metod(String kodeBrang, String namaBarang, int jumlah, double harga) {
        this.kodeBarang = kodeBrang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public static void main(String[] args) {
        String kode, nama;
        int jumlah;
        double harga;
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan kode barang : " );
        kode = input.nextLine();
        System.out.print("masukkan nama barang : " );
        nama = input.nextLine();
        metod barang1 = new metod(kode, nama);
        System.out.println(barang1.kodeBarang);
        System.out.println(barang1.namaBarang);


        System.out.print("masukkan kode barang : " );
        kode = input.nextLine();
        System.out.print("masukkan nama barang : " );
        nama = input.nextLine();
        System.out.print("masukkan jumlah barang : " );
        jumlah = input.nextInt();
        System.out.print("masukkan harga barang : " );
        harga = input.nextDouble();
        metod barang2 = new metod(kode, nama, jumlah, harga);
        System.out.println(barang2.kodeBarang);
        System.out.println(barang2.namaBarang);
        System.out.println(barang2.jumlah);
        System.out.println(barang2.harga);
    }
}