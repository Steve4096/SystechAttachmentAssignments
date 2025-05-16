import java.util.Scanner;

public class TrainSeatBooking {

    public static void trainBookingSystem() {
        boolean[] seats=new boolean[10];
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter a seat number you would like to book");
            int seatNumber=scanner.nextInt();
            for (int i=0;i<seats.length;i++){
                if(seats[i]==false){
                    if(seatNumber==i+1){
                        System.out.println("Seat "+seatNumber+" is available");
                        seats[i]=true;
                        break;
                    }

            }
        }
    }
    }
}
