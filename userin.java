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

        

        switch (year) {
            case 12: System.out.println("ป.6");
                break;
                case 11: System.out.println("ป.5");
                break;
                case 10: System.out.println("ป.4");
                break;
                case 9: System.out.println("ป.3");
                break;
                case 8: System.out.println("ป.2");
                break;
                case 7: System.out.println("ป.1");
                break;
              
            default: System.out.println("Pleas try agian");
                break;
        }

    }

}
