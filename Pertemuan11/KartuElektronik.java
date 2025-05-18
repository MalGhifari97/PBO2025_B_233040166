package Pertemuan11;

public class KartuElektronik implements Kartu {
	 // Atribut private untuk menyimpan kode bank dan PIN
    private String kodeBank;
    private String pin;

    // Konstruktor: inisialisasi kode bank dan pin saat objek dibuat
    public KartuElektronik(String kodeBank, String pin) {
        super(); // Memanggil konstruktor kelas induk (Object)
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    // Implementasi method otentikasi dari interface
    @Override
    public boolean otentikasi(String pinInput) {
        // Cek apakah pin input dari user cocok dengan pin yang tersimpan
        return pin.equals(pinInput);
    }

    // Implementasi method encode dari interface
    @Override
    public String encode(String pin) {
        // Melakukan "enkripsi" sederhana dengan menambahkan prefix
        return "encrypted_" + pin;
    }
}
