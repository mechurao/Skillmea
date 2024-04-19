import java.util.Scanner;

public abstract class InputReader {

    public static  String readInput(int optionsCnt){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if(!isInputValid(input,optionsCnt)){
                System.out.println("The input must contain only numbers in range of 1 - "+optionsCnt+1);
                System.out.println("Enter again");
            }else{
                return  input;
            }
        }
    }

    private static boolean isInputValid(String input, int optionsCnt){
        for(final char c : input.toCharArray()){
            if(!Character.isDigit(c)){return  false;}
            int num = Character.getNumericValue(c);
            if(num < 1 || num > optionsCnt+1){return false;}
        }
        return true;
    }
}
