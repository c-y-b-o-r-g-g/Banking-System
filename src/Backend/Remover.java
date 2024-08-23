package Backend;

public class Remover {
    public static void removeAccount(String accnum ,String email,String password)
    {
        if(Accounts.accounts.containsKey(accnum))
        {
            if(Accounts.accounts.get(accnum).getEmail().equals(email) && Accounts.accounts.get(accnum).getPassword().equals(password))
            {
                Accounts.accounts.remove(accnum);
                Saver.saveToDisk(Accounts.accounts.get(accnum));
            }
        }
    }
}
