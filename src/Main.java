import java.util.*;

public class Main {
    public static boolean login(String Atm_no, int pwd){
        return Objects.equals(Atm_no, "1912280922012003") && pwd == 1010;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ATM Interface");
        System.out.println("Enter your ATM Number: ");
        String Atm_no=sc.nextLine();
        System.out.println("Enter your Password: ");
        int pwd=sc.nextInt();
        boolean success=login(Atm_no,pwd);
        if(success){
            System.out.println("Logged in  Successfully");
        }
        else{
            System.out.println("Enter valid ATM NO and Password");
        }
        int balance= 10000;
        System.out.println("Select for the Transaction");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Display amount");
        System.out.println("4.Exit");
        int op=sc.nextInt();
        switch (op){
            case 1:
                withDraw(balance);
                break;
            case 2:
                Deposit(balance);
                break;
            case 3:
                displayBalance(balance);
                break;
            case 4:
                exit();
        }

    }

    private static void exit() {
        System.exit(0);
    }

    private static int Deposit(int balance) {
        System.out.println("Enter your Deposit Amount: ");
        Scanner sc=new Scanner(System.in);
        int deposit=sc.nextInt();
        balance=balance+deposit;
        displayBalance(balance);
        return balance;
    }

    private static int withDraw(int balance) {
        System.out.println("Enter your Withdrawing amount: ");
        Scanner sc=new Scanner(System.in);
        int withdraw=sc.nextInt();
        if(balance>=withdraw){
            balance=balance-withdraw;
            System.out.println("Successfully Withdrawn");
            displayBalance(balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
        return balance;

    }
    private static void displayBalance(int balance){
        System.out.println("Current Balance "+balance);
    }
}