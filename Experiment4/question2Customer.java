public class question2Customer{
    public static void main(String[] args) {
        customer c1 = new customer();
        c1.addBalance(50.0);
        c1.deductBalance(30.0);
        c1.showBalance();
    }
}
class customer{
    private double balance;
    public void showBalance() {
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
    }
    public void addBalance(double amount) {
        balance += amount;
        showDetails();
    }
    public void deductBalance(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }
        balance -= amount;
        showDetails();
    }
    private void showDetails() {
        System.out.println("\nCustomer Details");
        System.out.printf("\tBalance: %.2f", balance);
    }
}
