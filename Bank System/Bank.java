package newmain;

import java.util.ArrayList;

/**
 *
 represent a bank
 
 */
public class Bank {
    /**
     * store name and address
     */
    private String name,address;
   /**
    *store phone 
    */
    private long phone;
    /**
     store list of clients
     */
    private ArrayList<Client> clients = new ArrayList<Client>();
    /**
     * store list of accounts
     */
    private ArrayList<Account> accounts = new ArrayList<Account>();

    /**
     * construct a bank with name and address and phone 
     * @param name the name
     * @param address the address
     * @param phone the phone 
     */
    public Bank(String name, String address, long phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * get the name 
     * @return name 
     */
    public String getName()
    {
        return name;
    }

    /**
     * set the name 
     * @param name the name 
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * get the address
     * @return address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     *set the address
     * @param address the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     *get the phone number
     * @return phone
     */
    public long getPhone()
    {
        return phone;
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
     * return list of clients
     * @return list of clients 
     */
    public ArrayList<Client> getClients(){
        return clients;
    }

    /**
     *add client
     * @param c client
     */
    public void setClients(ArrayList<Client> c){
        clients = c;
    }

    /**
     *add client to the list 
     * @param c client
     */
    public void AddClient(Client c)
    {
        clients.add(c);

    }

    /**
     *
     * @param phone the phone 
     * @return client 
     */
    public Client findClient(long phone)
    {
        for(int i=0;i<clients.size();i++){
            if(clients.get(i).getPhone()== phone){
                return clients.get(i);
            }

        }
        System.out.println("Phone number not found in our database");
        return null;
    }

//    public void addAccount(Account a)
//    {
//        accounts.add(a);
//    }

    /**
     * display info
     */

    public void DisplayClient()
    {
        for (int i=1;i<=clients.size();i++)
        {
            System.out.println("Client number:" + (i));
            System.out.println("His name:" + clients.get(i-1).getName());
            System.out.println("His ID:" + clients.get(i-1).getNationalID());
            System.out.println("His address:" + clients.get(i-1).getAddress());
            System.out.println("His phone:" + clients.get(i-1).getPhone());
            System.out.println("******");
            System.out.println("His Account's Balance:" + clients.get(i-1).getaccount().getbalance());
            System.out.println("His Account's number:" + clients.get(i-1).getaccount().getaccount_number());
            System.out.println("******");
        }
    }
}
