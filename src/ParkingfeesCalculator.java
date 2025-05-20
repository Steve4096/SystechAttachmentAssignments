import java.util.Scanner;

public class ParkingfeesCalculator {
        //static double feesPast2Hours;

    public static void parkingFeesCalculator() {
        double fees=0;
        int hours;
        double feesPast2Hours=0;
        double totalFees;

        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter the number of hours you parked");
            hours=scanner.nextInt();
             if(hours<0) {
                 throw new Exception("Invalid Duration");
             }
             int originalHours=hours;
            int freeHours=Math.min(hours,2);
             if(freeHours<=2){
                 totalFees=0;
             }
             int hoursAfter2=hours-freeHours;
             int bracketHours=0;
             //if(hoursAfter2<0){
                 bracketHours=Math.min(hoursAfter2,3);
                 feesPast2Hours=bracketHours*10;
             //}
             int hoursAfter5=hoursAfter2-bracketHours;
             if (hoursAfter5>0){
                 fees=hoursAfter5*15;
                 //System.out.println("Fees at 5"+fees);
             }
             totalFees=feesPast2Hours+fees;
             System.out.println("Here is a breakdown of the hours you parked:"+originalHours+" hours = "+freeHours+" for free"+" "+bracketHours+" for R 10 and "+hoursAfter5+" for R 15");
             System.out.println("Total Fees: "+totalFees);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
