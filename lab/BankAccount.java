public class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;


    public String GetAccountHolder(){
        return accountHolder;
    }

    // Edited: return type must match the balance field type (double).
    public double GetBalance(){
        return balance;
    }

    // Edited: fixed method name typo so callers can use SetAccountHolder.
    public void SetAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    
    public void SetBalance(double balance){
        if(balance<0){
            System.out.println("Error: Balance cannot be negative!");
        }
        else{
            this.balance=balance;
        }
        
    }

    
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.SetAccountHolder("Temesgen");
        ba.SetBalance(-23000);

        System.out.println("Holder: " + ba.GetAccountHolder());
        System.out.println("Balance: $" + ba.GetBalance());
        
    }
}