package Pertemuan6;

public class TranskripNilaiMain {
	public static void main(String[] args) { 
		// Create objek MataKuliah 
		MataKuliah mk1 = new MataKuliah("001","Algoritma Pemrograman 1","A", 3, "FAJAR DARMAWAN, ST., M.KOM");
		MataKuliah mk2 = new MataKuliah("002","Algoritma Pemrograman 2","BC", 3, "DR. IR LEONY LIDYA, MT");
		MataKuliah mk3 = new MataKuliah("003","Pemrograman Berorientasi Objek","B", 3, "Siroj Nur Ulum, S.T., M.T."); 
		// Create Objek KHS
		KartuHasilStudi khs = new KartuHasilStudi("Genap 2022/2023"); 
	    khs.addMataKuliah(mk1); 
	    KartuHasilStudi khs1 = new KartuHasilStudi("Ganjil 2023/2024"); 
	    khs1.addMataKuliah(mk2); 
	    KartuHasilStudi khs2 = new KartuHasilStudi("Genap 2024/2025"); 
	    khs2.addMataKuliah(mk3); 
		// Create Objek Mahasiswa
		Mahasiswa mhs = new Mahasiswa("303040001", "Jhon"); 
		// Create Objek TranskripNilai
		 TranskripNilai transkrip = new TranskripNilai(mhs); 
	        transkrip.addKHS(khs); 
	        transkrip.hitungIPK(); 
	        transkrip.display(); 
	         
	        // Tambahkan KHS lain 
	        transkrip.addKHS(khs1); 
	 
	        // Hitung IPK sebelum menampilkan 
	        transkrip.hitungIPK(); 
	        transkrip.display(); 
	         
	        // Tambahkan KHS lain 
	        transkrip.addKHS(khs2); 
	 
	        // Hitung IPK sebelum menampilkan 
	        transkrip.hitungIPK(); 
	        transkrip.display(); 
		} 
}
