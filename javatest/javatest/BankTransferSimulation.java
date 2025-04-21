package javatest;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAccount {
    private String accountNumber;
    private double balance;
public BankAccount(String accNum, double initialBalance) {
        this.accountNumber = accNum;
        this.balance = initialBalance;
    }
public void deposit(double amount) {
        balance += amount;
    }
public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("잔액이 부족합니다. 현재 잔액: " + balance);
        }
        balance -= amount;
    }
public double getBalance() {
        return balance;
    }
public String getAccountNumber() {
        return accountNumber;
    }
}
public class BankTransferSimulation {
    public static void main(String[] args) {
        BankAccount sender = new BankAccount("100-123", 5000);
        BankAccount receiver = new BankAccount("100-456", 1000);
try {
            System.out.println("이체 전 송금자 잔액: " + sender.getBalance());
            System.out.println("이체 전 수신자 잔액: " + receiver.getBalance());
	transfer(sender, receiver, 7000);  // 잔액 부족 예외 발생 예상
} catch (InsufficientFundsException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("기타 예외 발생: " + e.getMessage());
        } finally {
            System.out.println("이체 시도 완료");
            System.out.println("이체 후 송금자 잔액: " + sender.getBalance());
            System.out.println("이체 후 수신자 잔액: " + receiver.getBalance());
        }
    }
public static void transfer(BankAccount from, BankAccount to, double amount) throws InsufficientFundsException {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
