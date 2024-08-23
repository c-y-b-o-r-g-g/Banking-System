package Backend;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Accounts {

    public static HashMap<String, Account> accounts = new HashMap<>();

    static File folderName = new File("D:\\JAVA PROJECTS\\Banking System\\Accounts");

    static File[] listOfFiles = folderName.listFiles();

    public static void getAccounts() {
        for (File file : listOfFiles) {
            Account temp = Reader.readFile("D:\\JAVA PROJECTS\\Banking System\\Accounts\\" + file.getName());
            accounts.put(temp.getAccountNumber(), temp);
        }

    }
}


