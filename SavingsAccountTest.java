public class SavingsAccountTest {
    public static void main(String[] args){
        SavingsAccount account = new SavingsAccount(1000, 10);
        account.addInterest();
        System.out.println("Expected balance is 1100$");
        System.out.println(account.getBalance());
    }
}
