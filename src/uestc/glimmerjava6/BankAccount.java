package uestc.glimmerjava6;

public final class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;
    private String password;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.password = password;
    }

    public void deposit(double amount) {
        if (validateAmount(amount)) {
            balance += amount;
            System.out.println("存款成功，当前余额为" + balance);
        } else {
            System.out.println("存款金额无效");
        }
    }

    public boolean withdraw(double amount, String inputPassword) {
        if (validatePassword(inputPassword) && validateAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("取款成功，当前余额为" + balance);
            return true;
        }
        System.out.println("取款失败");
        return false;
    }

    public boolean transfer(BankAccount recipient, double amount, String inputPassword) {
        if (validatePassword(inputPassword) && validateAmount(amount) && balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            System.out.println("转账成功，转账金额为" + amount + "，当前余额为" + balance);
            System.out.println("对方账户信息如下");
            System.out.println(recipient.getAccountInfo());
            return true;
        }
        System.out.println("转账失败");
        return false;
    }

    public double getBalance() {
        return balance;
    }

    //因为password为敏感信息，故不对外展示
    public String getAccountInfo() {
        return "账户为" + accountNumber + "，户主为" + accountHolder + "，余额为" + balance;
    }

    private boolean validatePassword(String inputPassword) {
        return true;
    }

    private boolean validateAmount(double amount) {
        return true;
    }
}
