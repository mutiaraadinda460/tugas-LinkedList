public class Siswa {
    String nama;
   // int nomorInduk;
    Siswa berikutnya;

    public Siswa(String nama, int nomorInduk) {
        this.nama = nama;
        // this.nomorInduk = nomorInduk;
        this.berikutnya = null;
    }

    public Siswa(String nama){
        this.nama = nama;
        // this.nomorInduk = 0;
        this.berikutnya = null;
    }

    public Siswa(){
        this.berikutnya = null;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    // public int getNomorInduk(){
        // return nomorInduk;
    // }

    // public void setNomorInduk(int nomorInduk){
        // this.nomorInduk = nomorInduk;
    // }

    public Siswa getBerikutnya(){
        return berikutnya;
    }

    public void setBerikutnya(Siswa berikutnya){
        this.berikutnya = berikutnya;
    }

    @Override
    public String toString(){
        return "String{nama='" + nama + "}";
        // return "String{nama='" + nama + "', nomorInduk=" + nomorInduk + "}";
    }

}