import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Option> q1options = new ArrayList<>();
        q1options.add(new Option("100", false));
        q1options.add(new Option("4", true));
        q1options.add(new Option("1", false));
        Question q1 = new Question("2+2 ?", q1options);

        ArrayList<Option> q2options = new ArrayList<>();
        q2options.add(new Option("3*3", true));
        q2options.add(new Option("1+1", false));
        q2options.add(new Option("3^2", true));
        MoreOptQuestion q2 = new MoreOptQuestion("What is equal 9 ?", q2options);


        ArrayList<Question> quiz1questions = new ArrayList<>();
        quiz1questions.add(q1);
        quiz1questions.add(q2);


        Quiz quiz1 = new Quiz("Basic math",quiz1questions);

        ArrayList<Option> q3Options = new ArrayList<>();
        q3Options.add(new Option("Paris", true));
        q3Options.add(new Option("London", false));
        q3Options.add(new Option("Berlin", false));
        MoreOptQuestion q3 = new MoreOptQuestion("Which city is the capital of France?", q3Options);

        ArrayList<Option> q4Options = new ArrayList<>();
        q4Options.add(new Option("Beethoven", true));
        q4Options.add(new Option("Mozart", false));
        q4Options.add(new Option("Bach", false));
        Question q4 = new Question("Who composed the Moonlight Sonata?", q4Options);

        ArrayList<Option> q5Options = new ArrayList<>();
        q5Options.add(new Option("Red", true));
        q5Options.add(new Option("Green", true));
        q5Options.add(new Option("Blue", true));
        q5Options.add(new Option("Yellow", false));
        q5Options.add(new Option("Purple", false));
        MoreOptQuestion q5 = new MoreOptQuestion("Which of the following colors are primary colors?", q5Options);



        ArrayList<Question> quiz2Questions = new ArrayList<>();
        quiz2Questions.add(q3);
        quiz2Questions.add(q4);
        quiz2Questions.add(q5);
        Quiz quiz2 = new Quiz("More advanced questions", quiz2Questions);

        List<Quiz> quizList = new ArrayList<>();
        quizList.add(quiz1);
        quizList.add(quiz2);

        Game game = new Game(quizList);
        game.run();


    }
}