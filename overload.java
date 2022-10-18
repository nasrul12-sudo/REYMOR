public class overload {
    int a, b, c;
    double d, e;

    static void tambah(int a, int b) {
        System.out.println(a + b);
    }

    static void kali(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    static void tambah(double d, double e) {
        System.out.println(d + e);
    }

    public static void main(String[] args) {
        overload over = new overload();
        over.tambah(56, 11);
        over.kali(9, 7, 2);
        over.tambah(1.5, 10.5);
        over.tambah(7, 8.75);

    }
}
