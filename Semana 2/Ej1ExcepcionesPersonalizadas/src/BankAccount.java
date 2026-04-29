// --- Cuenta Bancaria ---
public class BankAccount {
  private double balance;
  private boolean locked;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
    this.locked = false;
  }

  public void deposit(double amount) {
    // TODO: si amount <= 0 lanzar InvalidAmountException
    if (amount <= 0) throw new InvalidAmountException("Monto invalido: " + amount);

    // TODO: sumar al balance
    this.balance += amount;
  }

  public void withdraw(double amount) throws InsufficientBalanceException {
    if (amount <= 0) throw new InvalidAmountException("Monto invalido: " + amount);
    // TODO: si amount > balance lanzar InsufficientBalanceException con deficit
    if (amount > this.balance)
      throw new InsufficientBalanceException(
          String.format("Format insuficientes para restaurar $%.2f", amount),
          amount - this.balance);
    // TODO: restar del balance
    this.balance -= amount;
  }

  public void transfer(BankAccount target, double amount) throws InsufficientBalanceException {
    // TODO: usar try-with-resources con TransactionLog
    //       dentro: withdraw, target.deposit, log ambas operaciones

    try (TransactionLog tl = new TransactionLog(); ) {
      this.withdraw(amount);
      tl.log(
          String.format(
              "Retiro de $%.2f de cuenta de origen. Saldo: $%.2f", amount, this.getBalance()));

      target.deposit(amount);
      tl.log(
          String.format(
              "Deposito de $%.2f en cuenta de destino. Saldo: $%.2f", amount, target.getBalance()));
    } catch (InsufficientBalanceException e) {
      // TODO: handle exception
      System.out.println("Exception handled");
    }
  }

  public void lock() {
    this.locked = true;
  }

  public double getBalance() {
    return balance;
  }

  public static void main(String[] args) {
    BankAccount cuenta1 = new BankAccount(1000.00);
    BankAccount cuenta2 = new BankAccount(500.00);

    // Operaciones validas
    try {
      cuenta1.deposit(500);
      System.out.printf("Deposito exitoso. Saldo: $%.2f%n", cuenta1.getBalance());

      cuenta1.withdraw(200);
      System.out.printf("Retiro exitoso. Saldo: $%.2f%n", cuenta1.getBalance());

      cuenta1.transfer(cuenta2, 300);
      System.out.printf(
          "Transferencia exitosa. Saldo cuenta1: $%.2f, cuenta2: $%.2f%n",
          cuenta1.getBalance(), cuenta2.getBalance());
    } catch (InsufficientBalanceException e) {
      System.out.println("Error: " + e.getMessage());
    }

    System.out.println("\n=== Manejo de Errores ===");

    // TODO: multi-catch para monto invalido
    try {
      cuenta1.deposit(-100);
    } catch (InvalidAmountException e) {
      System.out.println("Error: " + e.getMessage());
    }

    // TODO: fondos insuficientes con deficit
    try {
      cuenta1.withdraw(999999);
    } catch (InsufficientBalanceException e) {
      System.out.printf("Error: %s (deficit: $%.2f)%n", e.getMessage(), e.getDeficit());
    }
  }
}
