package newmain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
  * represent a SpecialAccount which inherits all public members from Account

 */
public class SpecialAccount extends Account{

    /**
     constructs a special account 
     */
    public SpecialAccount() {
    }

    /**
     *
     * @param account_number the account_number
     * @param balance the balance
     */
    public SpecialAccount(int account_number, double balance)
    {
        super(account_number , balance);
    }

    /**
     *
      @param m the balance
      @return m the balance
     */
    @Override
    public String withdraw(double m)
    {
        if (m<this.getbalance() + 1000)
        {
            this.setbalance(this.getbalance()-m);
            return "successfully withdrawn";
        } else {
            return "insufficient funds";
        }
    }
}
