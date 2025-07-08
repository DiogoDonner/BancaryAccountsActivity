public class InvestmentAccount extends Account {
    public InvestmentAccount(String holder, Double balance) {
        super(holder, balance);
    }

    @Override
    public void actualizeBalance() {
        double percent = (balance/100)*2;
        setBalance(getBalance()+percent -5.00);
    }
}
