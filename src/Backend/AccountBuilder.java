package Backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AccountBuilder {

    private String email;
    private String password;
    private double balance;
    private String accountNumber;
    private File file;


    public static Account createAccount(String email, String password) {
        File file = new File("D:\\JAVA PROJECTS\\Banking System\\Accounts\\" + email + ".txt");
        try {
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(email);
            writer.newLine();
            writer.write(password);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Account(email, password);
    }


    public AccountBuilder(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AccountBuilder setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public AccountBuilder setFile(File file) {
        this.file = file;
        return this;

    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public File getFile() {
        return file;
    }


//    public void saveToDisk() {
//        File file = new File("D:\\JAVA PROJECTS\\Banking System\\Accounts\\" + email + ".txt");
//        try {
//            file.createNewFile();
//            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//            writer.write(this.getEmail());
//            writer.newLine();
//            writer.write(this.getPassword());
//            writer.newLine();
//            writer.write(this.getAccountNumber());
//            writer.newLine();
//            writer.write(String.valueOf(this.getBalance()));
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    public Account build() {
        Saver.saveToDisk(new Account(this));
//        Accounts.getAccounts();
        return new Account(this);

    }


}
