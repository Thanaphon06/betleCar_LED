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
            case 7: System.out.println("Gread 4");
                break;
                case 8: System.out.println("Gread 5");
                break;
                case 9: System.out.println("Gread 6");
                break;
                case 10: System.out.println("Gread 7");
                break;
                case 11: System.out.println("Gread 8");
                break;
                case 12: System.out.println("Gread 9");
                break;
              
            default: System.out.println("Pleas try agian");
                break;
        }

    }

}
