package Pertemuan11;

public class Tabung extends Bentuk {
	 private int tinggi; // Atribut tambahan: tinggi tabung

	    // Konstruktor default (tanpa parameter)
	    public Tabung() {
	        super(0); // Nilai default jari2 = 0
	    }

	    // Konstruktor dengan parameter jari-jari dan tinggi
	    public Tabung(int jari2, int tinggi) {
	        super(jari2); // Panggil konstruktor Bentuk
	        this.tinggi = tinggi;
	    }

	    /*
	     * Menghitung luas permukaan tabung:
	     * Rumus: 2 * PHI * r * (r + t)
	     */
	    @Override
	    public double luas() {
	        return 2 * PHI * jari2 * (jari2 + tinggi);
	    }

	    // Getter untuk tinggi
	    public int getTinggi() {
	        return tinggi;
	    }

	    // Setter untuk tinggi
	    public void setTinggi(int tinggi) {
	        this.tinggi = tinggi;
	    }
}
