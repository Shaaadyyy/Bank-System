package newmain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
  represent a client 
 */
public class Client {
    /**
     store name and address
     */
    private String name,address;
   /**
    store the nationalID
    */
    private long nationalID;
    /**
     Store the phone number
     */
    private long phone;
    /**
      store the user account
     */
    private Account account;
    
    /**
    
     * @return client info
     */
    
    public String toString()
    {
        return "Name: " + name + "\n Address: " + address + account + "\n National ID: " + nationalID + "\n Phone: " + phone;
    }

    /**
    construct an empty client 
     */
    public Client() {
    }

    /**
     *construct a client with name and address and nationalID and phone and account
     * @param name the name
     * @param address the address
     * @param nationalID the nationalID
     * @param phone the phone
     * @param account the account
     */
    public Client(String name, String address, long nationalID, long phone, Account account)
    {
        this.name = name;
        this.address = address;
        this.nationalID = nationalID;
        this.phone = phone;
        this.account = account;
    }

    /**
 
     * @return account 
     */
    public Account getaccount()
    {
        return account;
    }

    /**
     *set the account 
     * @param account the account 
     */
    public void setaccount(Account account)
    {
        this.account = account;
    }

    /**
     * set name 
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *set address
     * @param address the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * set the nationalID
     * @param nationalID the nationalID
     */
    public void setNationalID(int nationalID)
    {
        this.nationalID = nationalID;
    }

    /**
     * set the phone
     * @param phone the phone
     */
    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    /** 
     * @return name 
     */
    public String getName()
    {
        return name;
    }

    /**
    
     * @return address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     *
     * @return nationalID
     */
    public long getNationalID()
    {
        return nationalID;
    }

    /**
     *
     * @return the phone number
     */
    public long getPhone()
    {
        return phone;
    }
    
    
}
