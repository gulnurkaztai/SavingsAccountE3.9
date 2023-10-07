public class SavingsAccount{
    private double balance;
    private double interest;

    /**
     * Constructs a savings account that sets both initial balance and interest rate.
     * @param balance the initial balance.
     * @param interest the interest rate.
     */

     public SavingsAccount(double balance, double interest){
        this.balance = balance;
        this.interest = interest;
     }
        /**
         * Returns the current balance
         * @return balance amount
         */
        public double getBalance(){
            return this.balance;
        }

        /**
         * Adds interest to the balance
         */
        public void addInterest(){
            this.balance += (this.balance * this.interest)/100;
        }
}