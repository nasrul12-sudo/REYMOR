public class Nilai {
    private String nama;
    private String alamat;
    private int umur;
    private double nilaiMTK;
    private double nilaiING;
    private double nilaiIPA;

    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return nama;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    public String getalamat(){
        return alamat;
    }
    public void setumur(int umur){
        this.umur = umur;
    }
    public int getumut(){
        return umur;
    }
    public void setnilaiMTK(double mtk){
        nilaiMTK = mtk;
    }
    public double getnilaiMTK(){
        return nilaiMTK;
    }
    public void setnilaiING(double inggris){
        nilaiING = inggris;
    }
    public double getnilaiING(){
        return nilaiING;
    }
    public void setnilaiIPA(double ipa){
        nilaiIPA = ipa;
    }
    public double getnilaiIPA(){
        return nilaiIPA;
    }
    public void cetak(String nama, String alamt){//overloading
        System.out.println("nama : " + nama);
        System.out.println("alamat : " + alamat);
    }
    public void cetak(String nama,double nilaiMK, double nilaiING,double nilaiIPA){ //overloading
        System.out.println("Nama : "+ nama);
        System.out.println("Nilai MATEMATIKA : "+ nilaiMTK);
        System.out.println("Nilai BAHASA INGGRIS : "+ nilaiING);
        System.out.println("Nilai IPA : "+ nilaiIPA);
    }
    public static void main(String[] args){

    }
}
