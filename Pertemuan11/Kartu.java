package Pertemuan11;

public interface Kartu {
	 // Method otentikasi: menerima input PIN dan mengembalikan true/false
    public boolean otentikasi(String pin);

    // Method encode: menerima input PIN dan mengembalikan hasil enkripsi (dalam bentuk String)
    public String encode(String pin);
}
