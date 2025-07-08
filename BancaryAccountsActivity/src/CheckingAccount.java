public class CheckingAccount extends Account {
    public CheckingAccount(String holder, Double balance) {
        super(holder, balance);
    }

    @Override
    public void actualizeBalance() {
        setBalance(getBalance()-10);
    }
}
