package Pertemuan14;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Error: Cannot override final method from BankAccount
    /*
    @Override
    public void displayAccountInfo() {
        // Akan menyebabkan compile error karena method final tidak boleh di-override
        System.out.println("Overridden Account Info");
    }
    */

    // Cara yang benar: Buat method tambahan khusus subclass
    public void displaySavingsInfo() {
        super.displayAccountInfo(); // gunakan method final dari superclass
        System.out.println("Jenis Rekening: Tabungan");
    }
}
