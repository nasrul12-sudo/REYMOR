public class Buku {
    String pengarang;
    String judul;

    public void IsiParam(String judul, String pengarang) {
        judul = judul;
        pengarang = pengarang;
    }

    public void cetak() {
        if (judul == null && pengarang == null)
            return;
        System.out.println("judul : " + judul + pengarang + "+ pengarang");
    }

    public static void main(String[] args) {
        Buku b1 = new Buku();
        b1.IsiParam("detactif Conan", "Anonima Ghoso ");
        b1.cetak();
    }

}
