import java.util.Scanner;
public class internetee {
    public static void main(String[] args) {
        
        double playtime;
        Scanner sctime = new Scanner(System.in);

        System.out.println("inter hour");
        playtime  = sctime.nextDouble();
      
        if( playtime >= 0.30 && playtime <= 1 ){
        System.out.println("you need to pay 20 Bath");
            

        }if (playtime > 1 && playtime <= 2){
        System.out.println("you need to pay 40 Bath");
            

        }if(playtime > 2){
            playtime = 40 + (25*(playtime -2));
        System.out.println("you need to pay " + playtime + " Bath");


        }
        
    }
}
