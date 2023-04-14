/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Date;

/**
 *
 * @author XPC
 */
public class Saving extends Account{
    private Date date;
    private int monthsTerm;
    private double interest;

    public Saving(Date date, int monthsTerm, double interest, String numAccount, double balance, Client client) {
        super(numAccount, balance, client);
        this.date = date;
        this.monthsTerm = monthsTerm;
        this.interest = interest;
    }//end saving

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonthsTerm() {
        return monthsTerm;
    }

    public void setMonthsTerm(int monthsTerm) {
        this.monthsTerm = monthsTerm;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Saving{" + "date=" + date + ", monthsTerm=" + monthsTerm + ", interest=" + interest + '}';
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
}//end class saving
