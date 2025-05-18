package Pertemuan11;

public class BentukMain {
	 public static void main(String[] args) {
	        // Buat objek Lingkaran dengan jari-jari 10
	        Lingkaran lingkaran = new Lingkaran(10);

	        // Buat objek Tabung dengan jari-jari 10 dan tinggi 5
	        Tabung tabung = new Tabung(10, 5);

	        // Tampilkan informasi dan hasil perhitungan lingkaran
	        System.out.println("== Lingkaran ==");
	        System.out.println("jari2: " + lingkaran.getJari2());
	        System.out.println("luas:" + lingkaran.luas());

	        // Tampilkan informasi dan hasil perhitungan tabung
	        System.out.println("== Tabung ==");
	        System.out.println("jari2: " + tabung.getJari2() + ", Tinggi:" + tabung.getTinggi());
	        System.out.println("luas:" + tabung.luas());
        
     // Pertanyaan
        // 1. Sebutkan method abstrak yang terdapat di kelas abstrak Bentuk !
        // 2. Jelaskan apa perbedaannya method luas di kelas Bentuk dan di kelas
        // Lingkaran dan kelas Tabung!
        // 3. Jelaskan bagaimana jika method luas di kelas Tabung dihilangkan atau tidak
        // mengimplementasikannya!
        // 4. Buatlah kelas main sehingga outputnya seperti dibawah ini:
        // 5. Buatlah diagram kelas dari contoh program kelas abstrak!

        // Jawaban :
        // 1.public abstract double luas();
        // 2.Di kelas Bentuk, method luas() dideklarasikan sebagai abstrak. Sedangkan Di kelas Lingkaran dan Tabung, method luas() di-override dan diimplementasikan sesuai rumus masing-masing
        // 3.Jika method luas() tidak diimplementasikan di kelas Tabung, maka akan muncul error saat kompilasi
        // 4.sudah dibuat diatas
        // 5.dibuat dibeda file
    }
}
