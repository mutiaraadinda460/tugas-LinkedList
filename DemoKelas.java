public class DemoKelas {
    public static void main(String[] args) {
    Siswa nisa = new Siswa("Nisa", 123);

    Kelas k = new Kelas(nisa);

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

    k.tambahDidepan(new Siswa("Tiara"));
    k.tampilkanSemua();

    k.tambahSetelah("Fikri", new Siswa("Manda"));
    k.tampilkanSemua();
    }

}