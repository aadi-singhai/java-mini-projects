class InvalidCardException extends Exception{
    public InvalidCardException(String message){
        super(message);
    }
}
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class Transaction{
    private String transactionId;
    private String cardNumber;
    private double amount;
    public Transaction(String transactionId, String cardNumber, double amount) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public double getAmount() {
        return amount;
    }
    
}
class PaymentProcessor{
    public void processPayment(Transaction tx) throws InvalidCardException, InsufficientFundsException{
        if(tx.getCardNumber().length()!= 16){
            throw new InvalidCardException("Fraud Alert: Card number must be 16 digits.");
        }
        else if(tx.getAmount()>5000){
            throw new InsufficientFundsException("Decline: Amount exceeds available balance.");
        }
        else{
            System.out.println("[SUCCESS] Transaction " + tx.getTransactionId() + " approved for $" + tx.getAmount());
        }
    }
}
public class GatewayApp {
    public static void main(String[] args) {

        System.out.println("--- Booting Payment Gateway --- \n");

        Transaction[] tx = new Transaction[3];
        tx[0] = new Transaction("TX-001", "1234567887654321", 100);
        tx[1] = new Transaction("TX-002", "1234", 400);
        tx[2] = new Transaction("TX-003", "1233223344556677", 9000);

        PaymentProcessor pp = new PaymentProcessor();

        for(int i = 0 ; i < tx.length; i++){
            try{
                pp.processPayment(tx[i]);
            }
            catch (InvalidCardException e) {
                System.out.println("[SECURITY LOG] " + e.getMessage());
            } catch (InsufficientFundsException e) {
                System.out.println("[BANK LOG] " + e.getMessage());
            }
            finally{
                System.out.println("--> Closing secure bank connection for " + tx[i].getTransactionId() + "\n");
            }
        }
    }
}
