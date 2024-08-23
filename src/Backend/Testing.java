package Backend;

public class Testing {
    public static void main(String[] args) {
        Accounts.getAccounts();

        Account temp = AccountCreator.createAccount("gehad@gmaiol.com", "123456");
        temp.setAccountNumber("0000");
        temp.setBalance(5000);
        
        Saver.saveToDisk(temp);
        GlobalSaver.saveAll();
        Accounts.getAccounts();



}}