import java.util.Scanner;

public class userin {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("what is your name? ");
        String name = input.nextLine();

        System.out.println("How old are you? ");
        int year = input.nextInt();

        System.out.println("what is your weath");
        double weigth = input.nextDouble();

        

        System.out.println("Hello " +name);
        System.out.println(year +" olds");
        System.out.println("you weath " +weigth);

    }

}
