package Pertemuan11;

public abstract class Bentuk {
	 protected double PHI = 3.14;   // Konstanta PHI untuk menghitung luas
	    protected int jari2;           // Atribut jari-jari

	    // Konstruktor untuk menginisialisasi jari-jari
	    public Bentuk(int jari2) {
	        super(); // Panggil konstruktor dari Object (default)
	        this.jari2 = jari2;
	    }

	    // Method abstrak luas, akan diimplementasikan oleh kelas turunan
	    public abstract double luas();

	    // Method getter untuk jari-jari
	    public int getJari2() {
	        return jari2;
	    }

	    // Method setter untuk jari-jari
	    public void setJari2(int jari2) {
	        this.jari2 = jari2;
	    }
}
