/*Universidad de Costa Rica 2
c) Defina una clase abstracta llamada “Cuenta” con los siguientes atributos (10pts):
1) Número, saldo, cuentahabiente
2) Defina un método llamado calculoIntereses, de la siguiente forma:
i) Para las cuentas de ahorro el cálculo de los intereses ganados se logra
multiplicando el número de meses del plazo fijo por el saldo actual de la
cuenta, por el porcentaje de interés pactado con el banco
ii) Para las cuentas corrientes el cálculo de los intereses ganados se logra
multiplicando el saldo actual por el porcentaje de interés, dividido entre 12
iii) En ambos casos, el interés acumulado debe agregarse al saldo actual de la
cuenta*/
package Logic;

public abstract class Account {
    private String numAccount;
    private double balance;
    private Client client;

    public Account(String numAccount, double balance, Client client) {
        this.numAccount = numAccount;
        this.balance = balance;
        this.client = client;
    }

    public String getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(String numAccount) {
        this.numAccount = numAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
    
    public abstract void interestCalculation();
    public abstract void deposit(double money);
    public abstract void withDraw(double money);
    /*3) Defina 2 métodos adicionales: depósito y retiro que permita realizar movimientos a una
cuenta (ahorros y corriente)*/
}//end class Account
