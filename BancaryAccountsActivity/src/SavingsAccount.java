public class SavingsAccount extends Account{
    public SavingsAccount(String holder, Double balance) {
        super(holder, balance);
    }

    @Override
    public void actualizeBalance() {
        double percent = balance/100;
         setBalance(getBalance()*percent);
    }
}
