import java.util.List;

public class Quiz {
    private final String name;
    private final List<Question> questions;

    private int correctAnswers = 0;

    Quiz(String name, List<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    void run(){
        System.out.println("Welcome to Quiz " + name + ".");
        System.out.println("This quiz have "+this.questions.size()+" questions.");
        for (int i = 0; i < this.questions.size(); i++) {
            Question question = this.questions.get(i);
            System.out.println((i+1)+". "+question);
            String input = InputReader.readInput(this.questions.size());
            if (question.check(input)) {
                this.correctAnswers++;
            }
        }
        System.out.println("You had "+this.correctAnswers+"/"+this.questions.size()+" correct");
    }

    @Override
    public String toString() {
        return  this.name;
    }
}
