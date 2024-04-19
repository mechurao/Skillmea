import java.util.List;
import java.util.Scanner;

public class Quiz {
    private String name;
    private List<OneOptQuestion> questions;

    private int correctAnswers = 0;

    Quiz(String name, List<OneOptQuestion> questions) {
        this.name = name;
        this.questions = questions;
    }

    void run(){
        System.out.println("Welcome to Quiz " + name + ".");
        System.out.println("This quiz have "+this.questions.size()+" questions.");
        for (int i = 0; i < this.questions.size(); i++) {
            OneOptQuestion question = this.questions.get(i);
            System.out.println((i+1)+". "+question);
            String input = this.readInput();
            if (question.check(input)) {
                this.correctAnswers++;
            }
        }

        System.out.println("You had "+this.correctAnswers+"/"+this.questions.size()+" correct");
    }




    private String readInput(){

        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if(!isInputValid(input)){
                System.out.println("The input must contain only numbers in range of 1 - "+questions.size()+1);
                System.out.println("Enter again");
            }else{
                return  input;
            }
        }
    }

    private boolean isInputValid(String input){
        for(final char c : input.toCharArray()){
            if(!Character.isDigit(c)){return  false;}
            int num = Character.getNumericValue(c);
            if(num < 1 || num > questions.size()+1){return false;}
        }
        return true;
    }



}
