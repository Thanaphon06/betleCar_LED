package After_July;

import java.util.Scanner;

public class cookienum {
    public static void main(String[] args) {
        
        int num1,num2,num3;

        Scanner InpputNum = new Scanner(System.in);
        
        System.out.println("Enter number1");
        num1 = InpputNum.nextInt();
        System.out.println("Enter number2");
        num2 = InpputNum.nextInt();
        System.out.println("Enter number3");
        num3 = InpputNum.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
            if(num2 > num3){
                System.out.println(num2);
                System.out.println(num3);
        }else if(num3 > num2){
            System.out.println(num3);
            System.out.println(num2);
        }else if(num2 == num3){
            System.out.println("number2 and number3 are the same");
        }else{
            System.out.println("Something when wrong");
        }
    }
        if(num2 > num1 && num2 > num3){
            System.out.println(num2);
            if(num1 > num3){
                System.out.println(num1);
                System.out.println(num3);
        }else if(num3 > num1){
            System.out.println(num3);
            System.out.println(num1);
    }else if(num1 == num3){
        System.out.println("number1 and number3 are the same");
    }else{
        System.out.println("Something when wrong");
    }
}
    if(num3 > num2 && num3 > num1){
        System.out.println(num3);
        if(num2 > num1){
            System.out.println(num2);
            System.out.println(num1);
    }else if(num1 > num2){
        System.out.println(num1);
        System.out.println(num2);
    }else if(num1 == num2){
        System.out.println("number1 and number2 are the same");
    }else{
        System.out.println("Something when wrong");
    }
}
    if(num1 == num2 && num2 == num3){
        System.out.println("We are the same boi");
    }else{
        System.out.println("Something when wrong");
        
    }

}
}


