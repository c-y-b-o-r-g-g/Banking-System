package Backend;

public class GlobalSaver {

    // public static void saveAll()
    // {
    //     for(Account temp: Accounts.accounts)
    //     {
    //         Saver.saveToDisk(temp);
    //     }
    // }

    public static void saveAll() {
        for (String key : Accounts.accounts.keySet()) {
            Saver.saveToDisk(Accounts.accounts.get(key));
        }
    }
}
