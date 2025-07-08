public abstract class Account {
    protected String holder;
    protected double balance;

    public Account(String holder, Double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public abstract void actualizeBalance();

    public void deposit(Double value) {
        if (value > 0) {
            balance += value;
            System.out.println("O valor RS " + value + " foi depositado na sua conta - TOTAL: " + balance);
        } else {
            System.out.println("-----------------------------");
            System.out.println("ERROR - Transação não é possível");
            System.out.println("-----------------------------");
        }
    }

    public void withdraw(Double value) {
        if (balance > value && value > 0) {
            balance -= value;
            System.out.println("O valor RS " + value + " foi sacado de sua conta - TOTAL: " + balance);
        } else {
            System.out.println("-----------------------------");
            System.out.println("ERROR - Transação não é possível");
            System.out.println("-----------------------------");
        }
    }

    public void showData() {
        System.out.println("Titular: " + holder + " - SALDO: " + balance);
    }

    // Getters
    public String getHolder() {
        return holder;
    }
    public double getBalance() {
        return balance;
    }
    // Setters
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
