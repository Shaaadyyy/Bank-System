package newmain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 represent an account
 */
public class Account {
    /**
     * store the balance
     */
    private double balance;
    /**
     * store account number
     */
    private int account_number;

    /**
     construct empty account
     */
    public Account() {
    }

    /**
     *construct account with account_number and balance
     * @param account_number the account_number
     * @param balance the balance
     */
    public Account(int account_number, double balance)
    {
        this.account_number = account_number;
        this.balance = balance;
    }

    /**
     * set the balance
     * @param balance the balance
     */
    public void setbalance(double balance)
    {
        this.balance = balance;
    }

    /**
     * set the account_number
     * @param account_number the account_number
     */
    public void setaccount_number(int account_number)
    {
        this.account_number = account_number;
    }

    /**
     * get the balance
     * @return balance
     */
    public double getbalance()
    {
        return balance;
    }

    /**
     *get the account number
     * @return account_number
     */
    public int getaccount_number()
    {
        return account_number;
    }

    
    public String withdraw(double m)
    {
        if (balance >= m)
        {
            balance-=m;
            return "successfully withdrawn" + m;
        } else {
            return "insufficient funds";
        }    
    }

    
    public double deposit(double m)
    {
        balance += m;
        return balance;
    }

    /**
     
     * @return all account data 
     */
    public String toString()
    {
        return "Account Number: " + account_number + "\n Balance: " + balance;
    }
}
