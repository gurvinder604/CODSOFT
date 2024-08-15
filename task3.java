import java.nio.file.LinkPermission;
import java.util.Scanner;

public class task3 {
        public static void main(String[] args) {
            //Implementing all methods here

            ATM obj = new ATM();
            obj.MenuInterface();

        }
}

// Creating class ATM and defining methods in it
class ATM {
    public void MenuInterface() {
        System.out.println("ATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

    }

    double AmtBalance;

    public void Start() {
        Scanner Input = new Scanner(System.in);
        int Option = Input.nextInt();

        do {
            MenuInterface();

            switch (Option) {
                case 1:
                    CheckBalance();
                    break;
                case 2:
                    PerformWithdraw(Input);
                    break;
                case 3:
                    PerformDeposit(Input);
                    break;
                case 4:
                    System.out.println("Exiting the ATM,Thanks for using our services.");
                    break;

                default:
                    System.out.println("Invalid Data, Please try again.");
            }
        } while (Option != 4);

        Input.close();
    }

    public void CheckBalance() {
        System.out.println("Your current balance is: " + AmtBalance);
        MenuInterface();
    }

    public void PerformWithdraw(Scanner Input) {
        System.out.print("Enter amount to be Withdrawn: ");
        double amount = Input.nextDouble();

        if (amount > AmtBalance) {
            System.out.println("Insufficient Balance,/n Available Balance is: " + AmtBalance);
        } else {
            AmtBalance = AmtBalance - amount;
            System.out.println("Funds withdrawn successfully.");
        }
    }

    public void PerformDeposit(Scanner Input) {
        System.out.print("Enter the amount of money to be deposited: ");
        float amount = Input.nextFloat();
        AmtBalance = AmtBalance + amount;
        System.out.println("Funds deposited successfully.");


    }
}