

import java.util.Scanner;
public class numma {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
    
        int firstNum, secondNum, thirdNum, fourthNum; //inputted numbers
    
        System.out.println("Enter first number:");
        firstNum = userInput.nextInt();
        System.out.println("Enter second number:");
        secondNum = userInput.nextInt();
        System.out.println("Enter third number:");
        thirdNum = userInput.nextInt();
        System.out.println("Enter fourth number:");
        fourthNum = userInput.nextInt();
    
    
        int firstPlace = 0, secondPlace = 0, thirdPlace = 0, fourthPlace = 0;
        int storeFirstNum = 0;
        int storeSecondNum = 0;
        int storeThirdNum = 0;
        int storeFourthNum = 0;
        
        // secondPlace start
        if (firstNum != firstPlace && firstNum != fourthPlace) {
            storeFirstNum = firstNum;
        }
        if (secondNum != firstPlace && secondNum != fourthPlace) {
            storeSecondNum = secondNum;
        }
        if (thirdNum != firstPlace && thirdNum != fourthPlace) {
            storeThirdNum = thirdNum;
        }
        if (fourthNum != firstPlace && fourthNum != fourthPlace) {
            storeFourthNum = fourthNum;
        }
        if (storeFirstNum > storeSecondNum && storeFirstNum > storeThirdNum
                && storeFirstNum > storeFourthNum) {
            secondPlace = storeFirstNum;
        } else if (storeSecondNum > storeFirstNum
                && storeSecondNum > storeThirdNum
                && storeSecondNum > storeFourthNum) {
            secondPlace = storeSecondNum;
        } else if (storeThirdNum > storeFirstNum
                && storeThirdNum > storeSecondNum
                && storeThirdNum > storeFourthNum) {
            secondPlace = storeThirdNum;
        } else if (storeFourthNum > storeFirstNum
                && storeFourthNum > storeSecondNum
                && storeFourthNum > storeThirdNum) {
            secondPlace = storeFourthNum;
        }
    
        System.out.println("The sorted numbers are: "+ firstPlace + " " + secondPlace + " " + thirdPlace + " " + fourthPlace);
        }
    }
    
