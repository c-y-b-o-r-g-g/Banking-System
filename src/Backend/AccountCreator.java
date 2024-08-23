package Backend;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AccountCreator {

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


}
