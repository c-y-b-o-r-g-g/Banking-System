package Backend;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Saver {

    public static void saveToDisk(Account account) {
        File file = new File("D:\\JAVA PROJECTS\\Banking System\\Accounts\\" + account.getEmail() + ".txt");
        try {
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(account.getEmail());
            writer.newLine();
            writer.write(account.getPassword());
            writer.newLine();
            writer.write(account.getAccountNumber());
            writer.newLine();
            writer.write(String.valueOf(account.getBalance()));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
