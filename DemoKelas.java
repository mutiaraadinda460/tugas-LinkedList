public class DemoKelas {
    public static void main(String[] args) {
    Siswa endy = new Siswa("Endy", 123);

    Kelas k = new Kelas(endy);

    Siswa fikri = new Siswa("Fikri", 234);
    k.tambahDibelakang(fikri);
    k.tambahDibelakang(new Siswa("Naufal", 456));
    k.tambahDibelakang(new Siswa("Azmi", 678));
    k.tambahDibelakang(new Siswa("Rahma", 567));
    k.tampilkanSemua();

    System.out.println("Jumlah Siswa: " + k.jumlahSiswa());
    System.out.println("urutan Fikri: " + k.urutan("Fikri"));
    System.out.println("Siswa di index 2: " + k.ambilDi(2));

    k.hapus("Naufal");
    System.out.println("Setelah hapus Naufal:");
    k.tampilkanSemua();
    }

}