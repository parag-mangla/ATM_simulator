package A_ATM_Project;
import java.util.*;

public class atm_class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        //scanner imported

        int[] acc_nos = {654641, 536846, 6656135, 561561};           //enter any random account numbers
        int[] passwords = {4255, 5454, 2555, 5784};                 //enter any random passwords
        int[] balance = {1000, 2000, 5000, 1000};                      //enter random account balance


        while(true) {
            System.out.print("Enter Account number : ");
            long acc_no = sc.nextLong();
//

            for(int i=0; i<acc_nos.length; i++) {
                if (acc_nos[i] == acc_no) {

                    int acc_balance = balance[i];

                    System.out.print("Enter password : ");
                    long password = sc.nextLong();
                    if (passwords[i] == password) {

                        while (true) {
                            System.out.println("Type 1 to check balance");       //operations we want to perform
                            System.out.println("type 2 to deposit money");
                            System.out.println("Type 3 to withdraw money");
                            System.out.println("Type 4 to exit");
                            int do1 = sc.nextInt();
                            if (do1 == 1) {                                                             //check balance
                                System.out.println("Your account balance is: " + acc_balance + " ₹");
                            }
                            if (do1 == 2) {                                                             //deposit money
                                System.out.print("Enter amount to deposit : ");
                                int toDeposit = sc.nextInt();
                                acc_balance = acc_balance + toDeposit;
                                balance[i] = acc_balance;
                                System.out.println("Your account balance is: " + acc_balance + " ₹");
                            }
                            if (do1 == 3) {                                                             //withdraw money
                                System.out.print("Enter amount to withdraw : ");
                                int toWithdraw = sc.nextInt();
                                if (toWithdraw > acc_balance) {
                                    System.out.println("Account Balance can't be Negative");
                                } else {
                                    acc_balance = acc_balance - toWithdraw;
                                    balance[i] = acc_balance;
                                    System.out.println("Your account balance is: " + acc_balance + " ₹");
                                }
                            }
                            if (do1 == 4) {                           //if exit
                                break;
                            }
                        }
                    } else {
                        System.out.println("Account Number or Password Incorrect");     //if account number or password didn't match
                    }
                }
            }

//            System.out.println("No such account exits");           //if account number not present in account_nos array

        }
    }
}
