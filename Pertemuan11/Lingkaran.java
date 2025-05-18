package Pertemuan11;

public class Lingkaran extends Bentuk {
	// Konstruktor memanggil konstruktor induk Bentuk
    public Lingkaran(int jari2) {
        super(jari2);
    }

    /*
     * Menghitung luas lingkaran menggunakan rumus: PHI * r * r
     */
    @Override
    public double luas() {
        return PHI * jari2 * jari2;
    }
}
