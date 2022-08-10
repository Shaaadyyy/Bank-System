
package newmain;



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
*@author Mostafa Ashraf / Mohamed Taha / Shady Walid
*@since 30/4/2021 
*/

/**
 *
 * represent NewMain class that interact with user
 */
public class NewMain {

    /**
     *
     */
    public static Scanner input = new Scanner(System.in);

    /**
     * Display all class bank info
     * @param bank the Bank
     */
    public static void Display(Bank bank)
    {
        int choice;
        System.out.println("********** Bank Menu **********");
        System.out.println("1- Add New Client");
        System.out.println("2- List All Accounts / Clients");
        System.out.println("3- Withdraw / Deposit");
        System.out.println("4- Exit");
        choice = input.nextInt();
        do {

            switch (choice) {
                case 1:
                    //create new client
                    System.out.println("Please select what type of client you'd like (1 for client , 2 for commercial client )");
                    int choice2 = input.nextInt();
                    if(choice2 == 1)
                    {
                        Client client = new Client();
                        System.out.println("Please enter your name");
                        input.nextLine(); //This is needed to pick up the new line
                        String value = input.nextLine();
                        client.setName(value);
                        System.out.println("Please enter your Address");
                        value = input.nextLine();
                        client.setAddress(value);
                        System.out.println("Please enter your nationalID");
                        int number = input.nextInt();
                        client.setNationalID(number);
                        System.out.println("Please enter your phone number");
                        number = input.nextInt();
                        client.setPhone(number);
                        System.out.println("Please select what type of account you'd like (1 for normal, 2 for special)");
                        number = input.nextInt();
                        if(number==1){
                            Account account = new Account();
                            client.setaccount(account);
                            account.setbalance(0);
                            System.out.println("Please enter your account_number");
                            number = input.nextInt();
                            account.setaccount_number(number);
                        }
                        else
                        {
                            SpecialAccount special = new SpecialAccount();
                            client.setaccount(special);
                            special.setbalance(0);
                            System.out.println("Please enter your account_number");
                            number = input.nextInt();
                            special.setaccount_number(number);
                        }

                        bank.AddClient(client);
                    }
                    else
                    {
                        CommercialClient client = new CommercialClient();
                        System.out.println("Please enter your name");
                        input.nextLine(); //This is needed to pick up the new line
                        String value = input.nextLine();
                        client.setName(value);
                        System.out.println("Please enter your Address");
                        value = input.nextLine();
                        client.setAddress(value);
                        System.out.println("Please enter your nationalID");
                        int number = input.nextInt();
                        client.setNationalID(number);
                        System.out.println("Please enter your phone");
                        number = input.nextInt();
                        client.setPhone(number);
                        System.out.println("Please enter your commercial ID");
                        number = input.nextInt();
                        client.setC_ID(number);
                        System.out.println("Please enter what type of account you'd like (1 for normal, 2 for special)");
                        number = input.nextInt();
                        if(number==1){
                            Account account = new Account();
                            client.setaccount(account);
                            account.setbalance(0);
                            System.out.println("Please enter your account_number");
                            number = input.nextInt();
                            account.setaccount_number(number);
                        }
                        else
                        {
                            SpecialAccount special = new SpecialAccount();
                            client.setaccount(special);
                            special.setbalance(0);
                            System.out.println("Please enter your account_number");
                            number = input.nextInt();
                            special.setaccount_number(number);
                        }
                        bank.AddClient(client);
                    }


                    break;
                case 2:
                    //list all
                    bank.DisplayClient();
                    break;
                case 3:
                    //withdraw
                    System.out.println("Please provide us with your phone number");
                    long phone = input.nextLong();
                    Client c1 = bank.findClient(phone);
                    if(c1==null)
                        break;
                    int option;
                    System.out.println();
                    System.out.println("1- Withdraw");
                    System.out.println("2- Deposit");
                    option = input.nextInt();
                    if (option == 1) {
                        System.out.println("how much would you like to withdraw");
                        double val1 = input.nextDouble();
                        c1.getaccount().withdraw(val1);
                    } else {
                        System.out.println("how much would you like to deposit?");
                        double val2 = input.nextDouble();
                        c1.getaccount().deposit(val2);                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose from 1 to 4");
            }
            System.out.println("********** Bank Menu **********");
            System.out.println("1- Add New Client");
            System.out.println("2- List All Accounts / Clients");
            System.out.println("3- Withdraw / Deposit");
            System.out.println("4- Exit");
            choice = input.nextInt();
        }while (choice != 4);


        }

    
    public static void main(String[] args) {
        Account A1 = new Account(5,10.5);
        Account A2 = new SpecialAccount(6,505.0);
        SpecialAccount A3 = new SpecialAccount(3,200.1);
        Client client = new Client("fayez","maadi",154502,1113918809,A1);
        Bank bank = new Bank("Masr","Maadi",1134561);
        bank.AddClient(client);
        Display(bank);

    }
    
}
