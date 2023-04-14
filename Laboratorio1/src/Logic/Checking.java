
package Logic;


public class Checking extends Account {
     private double interest;

    public Checking(double interest, String numAccount, double balance, Client client) {
        super(numAccount, balance, client);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
     
    @Override
    public void interestCalculation() {
    }
    @Override
    public void deposit(double money) {
    }
    @Override
    public void withDraw(double money) {
    }
}//end class Checking
