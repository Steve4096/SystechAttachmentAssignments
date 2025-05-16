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
             if(hours>2){
                 totalFees=0;
             }
             //int freeHours;
             int hoursAfter2=hours-2;
             int bracketHours=0;
             //if(hoursAfter2<0){
                 bracketHours=Math.min(hoursAfter2,3);
                 feesPast2Hours=bracketHours*10;
             //}
             int hoursAfter5=hours-bracketHours-2;
            // if (hoursAfter5<0){
                 fees=hoursAfter5*15;
                 //System.out.println("Fees at 5"+fees);
             //}
             totalFees=feesPast2Hours+fees;
             System.out.println("Here is a breakdown of the hours you parked:"+originalHours+" hours = "+bracketHours+" for R 10 and "+hoursAfter5+" for R 15");
             System.out.println("Total Fees: "+totalFees);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
