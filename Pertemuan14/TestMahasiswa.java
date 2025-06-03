package Pertemuan14;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040166", "Akmal");
        Mahasiswa m2 = new Mahasiswa("233040126", "Azhar");

        m1.displayInfo();
        System.out.println("-----");
        m2.displayInfo();

        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
