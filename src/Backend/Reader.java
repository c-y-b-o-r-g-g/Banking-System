package Backend;

import javax.script.ScriptContext;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Reader {

    public static Account readFile(String fileName) {
        try {
            File file = new File(fileName);
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            String line;
            AccountBuilder builder;
            ArrayList<String> data = new ArrayList<>();
            int i = 0;
            while ((line = read.readLine()) != null) {
                data.add(i, line);
                i++;
            }
            builder = new AccountBuilder(data.get(0), data.get(1));
            builder.setAccountNumber(data.get(2));
            builder.setBalance(Double.parseDouble(data.get(3)));
            builder.setFile(new File(fileName));
            Account temp = builder.build();
            read.close();
            return temp;


        } catch (FileNotFoundException e) {
            System.out.println("File not found!!");
            return null;

        } catch (IOException x) {
            System.out.println("File empty");
            return null;
        }

    }


}
