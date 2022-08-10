package newmain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * represent a CommercialClient which inherits all public members from client
 */
public class CommercialClient extends Client {
    
    /**
     * set commercialID with 000000
     */
    private int commercialID = 000000;

    /**
     construct an empty CommercialClient
     */
    public CommercialClient() {

    }

    /**
     * get id 
     * @return commercialID
     */
    public int getC_ID()
    {
        
        return commercialID;
    }

    /**
     *set the commercial id
     * @param Co_ID the commercialID
     */
    public void setC_ID(int Co_ID)
    {
        commercialID = Co_ID;
    }
    
    /**
     * construct commercialclient object with name and address and id and phone and commercialID and account
     * @param n the name 
     * @param add the address
     * @param id the nationalID
     * @param phon the phone
     * @param xx  the commercialID
     * @param A2 Account 
     */
    public CommercialClient(String n, String add, int id, int phon,int xx, Account A2 )
    {
        super(n, add, id, phon,A2);
        commercialID =xx;
    }
    /**
     * display
     * @return all commercial client data 
     */
    @Override
    public  String toString() 
    {
        return "Name: " + super.getName() + "\n Address: " + super.getAddress() + super.getaccount() + "\n National ID: " + super.getNationalID() + "\n Phone: " + super.getPhone();
    }
    
}
