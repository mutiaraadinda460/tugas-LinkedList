public class Kelas {
    Siswa pertama;
    Siswa terakhir;

    public Kelas(Siswa x) {
        pertama = x;
        terakhir = x;
    }

    public Siswa ambilDi(Integer index){
        if (index < 0) return null;
        Siswa sekarang = pertama;
        int i = 0;
        while (sekarang != null && i < index){
            sekarang = sekarang.berikutnya;
            i++;
        }
        return (i == index) ? sekarang : null;
    }

    public Integer urutan(String nama){
        Siswa sekarang = pertama;
        int urutan = 0;
        while (sekarang != null){
            if (sekarang.nama.equals(nama)) return urutan;
            sekarang = sekarang.berikutnya;
            urutan++;
        }
        return -1;
    }
    
    public Integer jumlahSiswa(){
        int jumlah = 0;
        Siswa sekarang = pertama;
        while (sekarang != null){
            jumlah++;
            sekarang = sekarang.berikutnya;
        }
        return jumlah;
    }

    public void tambahDidepan(Siswa s){
        s.berikutnya = pertama;
        pertama = s;
        if (terakhir == null) terakhir = pertama;
    }

    public void tambahSetelah(String nama, Siswa s){
        Siswa sekarang = pertama;
        while (sekarang != null && !sekarang.nama.equals(nama)){
            sekarang = sekarang.berikutnya;
            sekarang.berikutnya = s;
            if (sekarang == terakhir) terakhir = s;
        }
    }

    public void hapus(String nama){
        if (pertama == null) return;
        if (pertama.nama.equals(nama)){
            pertama = pertama.berikutnya;
            if (pertama == null) terakhir = null;
            return;
        }
        Siswa sekarang = pertama;
        Siswa sebelumnya = null;
        while (sekarang != null && !sekarang.nama.equals(nama)){
            sebelumnya = sekarang;
            sekarang = sekarang.berikutnya;
        }
        if (sekarang != null) {
            sebelumnya.berikutnya = sekarang.berikutnya;
            if (sekarang == terakhir) terakhir = sebelumnya;
        }
    }

    public void tambahDibelakang(Siswa s) {
        if (terakhir == null){
            pertama = s;
        } else {
            terakhir.berikutnya = s;
        }
        terakhir = s;
    }

    public void tampilkanSemua(){
        System.out.println("Daftar Siswa:");
        Siswa sekarang = pertama;
        while (sekarang != null){
            System.out.println(sekarang);
            sekarang = sekarang.berikutnya;
        }
    }

private Siswa cariTerakhir(){
    Siswa sekarang = pertama;
    if (sekarang == null) return null;
    while(sekarang.berikutnya != null){
        sekarang = sekarang.berikutnya;
    }
    return sekarang;
}
}