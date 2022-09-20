package banking;

import java.util.Scanner;

public class Account {
    int ac_no;
    String name;
    float amount;

    public void insertValues(int no,String n,float amt)
    {
        ac_no = no;
        name = n;
        amount = amt;

    }



    public void deposit(float amt)
    {
        System.out.println("Depsoited "+ amt);
        amount += amt;
    }

    public void checkBal()
    {
        System.out.println("Your Ac Balance is : "+ amount);
    }

    public void withdraw(float amt)
    {
        if(amount>amt)
        {
            System.out.println("Withdrawal Success "+ amt);
            amount = amount - amt;
        }
        else
        {
            System.out.println("Insufficient Fund");
        }
    }

    public void displayAcdetails()
    {
        System.out.println("Account number : "+ac_no);
        System.out.println("Accountant name : "+name);
        System.out.println("Balance : "+amount);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        ac.insertValues(101, "Vijay", 50000);
        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("**************WELCOME TO VIJAYBANK*******************");
            System.out.println("=====================================================");
            System.out.println("Enter Your Choice : ");
            System.out.println("1.Display the account details");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Check balance");
            System.out.println("5.Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    ac.displayAcdetails();
                    break;

                case 2:
                    float s = sc.nextFloat();
                    ac.deposit(s);
                    break;

                case 3:
                    float a = sc.nextFloat();
                    ac.withdraw(a);
                    break;

                case 4:
                    ac.checkBal();
                    break;

                default:
                    System.out.println("Thank You for Banking With Us");
                    flag = false;
                    break;
            }
        }
    }
}
