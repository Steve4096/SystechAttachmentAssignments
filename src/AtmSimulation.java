import java.util.Scanner;

public class AtmSimulation {

    public  static void atmSimulator(){
        int balance=10000;
        int amount;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter amount to withdraw or deposit");
            amount=scanner.nextInt();
            if (amount%100!=0){
                System.out.println("Your amount must be a multiple of 100");
            } else if (amount>balance) {
                System.out.println("Your balance is: "+balance+" Please enter an amount less than or equal to your balance");
            }else {
                int originalAmount=amount;
                int count2000=amount/2000;
                amount%=2000;
                int count500=amount/500;
                amount%=500;
                int count100=amount/100;
                balance-=originalAmount;
                System.out.println("You have withdrawn "+originalAmount + " and your balance is: "+balance);
                System.out.println("Your withdrawal details are: ");
                if(count2000>0)System.out.println(count2000+" x 2000");
                if(count500>0)System.out.println(count500+" x 500");
                if(count100>0)System.out.println(count100+" x 100");
                break;
            }
        }
    }

}
