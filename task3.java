import java.sql.SQLOutput;
import java.util.Scanner;

public class task3 {
        public static void main(String[] args) {
            //Implementing all methods here

            // Making clas ATM an object
            ATM obj = new ATM();
            obj.AtmMenu(); // Calling AtmMenu

        }
}

// Creating class ATM and defining methods in it
class ATM {
    float AmtBalance = 10000.0f;

    // Presenting ATM menu where we will have the all the functions
    public void AtmMenu() {

        // Displaying the menu
        System.out.println("ATM Machine");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        // Taking user choice
        System.out.print("Please enter your choice: ");
        Scanner Input = new Scanner(System.in);
        int EntChoice = Input.nextInt();

        // Running methods as per users input
         switch (EntChoice) {
             case 1:
                 CheckBal();
                 break;
             case 2:
                 Withdraw();
                 break;
             case 3:
                 Deposit();
                 break;
             case 4:
                 System.out.println("Thanks for using our services :) ");
                 return;

             default:
                 System.out.println("-------------------------");
                 System.out.println("     Invalid Choice");
                 System.out.println("-------------------------");
         }
    }

    // Defining Check Balance
    public void CheckBal() {
        System.out.println("----------------------------------------");
        System.out.println("  Available Funds: " + AmtBalance);
        System.out.println("----------------------------------------");

        AtmMenu();
    }

    // Defining Withdraw
    public void Withdraw() {
        System.out.println("Available Funds " + AmtBalance);
        System.out.print("Please enter the amount you want to withdraw: ");
        Scanner Input = new Scanner(System.in);
        float AmtWithdrawn = Input.nextFloat();

        if (AmtWithdrawn<AmtBalance) {
            AmtBalance = AmtBalance - AmtWithdrawn;
            System.out.println("-----------------------------------------------------");
            System.out.println("   Funds Withdrawn, Available Funds: " + AmtBalance);
            System.out.println("------------------------------------------------------");


        }
        else {
            System.out.println("Insufficient Balance !!!");
            Withdraw();

        }
        AtmMenu();

    }

    // Defining Deposit
    public void Deposit() {
        System.out.print("PLease enter the amount need to be Deposit: ");
        Scanner Input = new Scanner(System.in);
        float AmtDeposit = Input.nextFloat();

        if (AmtDeposit >= 0) {
            AmtBalance += AmtDeposit;
            System.out.println("------------------------------------------------------");
            System.out.println("   Funds deposited successfully, Available Funds now: " + AmtBalance);
            System.out.println("------------------------------------------------------");

        }
        else {
            System.out.println("Please enter valid amount !!!");
        }
        AtmMenu();
    }
}



