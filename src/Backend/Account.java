package Backend;


import java.io.File;

public class Account {
    private String email;
    private String password;
    private double balance;
    private String accountNumber;
    private File file;

    protected Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    protected Account(AccountBuilder builder) {
        this.email = builder.getEmail();
        this.password = builder.getPassword();
        this.balance = builder.getBalance();
        this.accountNumber = builder.getAccountNumber();
        this.file = builder.getFile();
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        Saver.saveToDisk(this);
    }


    public void setPassword(String password) {
        this.password = password;
        Saver.saveToDisk(this);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        Saver.saveToDisk(this);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        Saver.saveToDisk(this);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


    public void deposit(double amount) {
        this.balance += amount;
        Saver.saveToDisk(this);
    }


}
