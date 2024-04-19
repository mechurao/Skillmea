import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Option> q1options = new ArrayList<>();
        q1options.add(new Option("100", false));
        q1options.add(new Option("4", true));
        q1options.add(new Option("1", false));
        OneOptQuestion q1 = new OneOptQuestion("2+2 ?", q1options);

        ArrayList<Option> q2options = new ArrayList<>();
        q2options.add(new Option("3*3", true));
        q2options.add(new Option("1+1", false));
        q2options.add(new Option("3^2", true));
        MoreOptQuestion q2 = new MoreOptQuestion("What is equal 9 ?", q2options);


        ArrayList<OneOptQuestion> quiz1questions = new ArrayList<>();
        quiz1questions.add(q1);
        quiz1questions.add(q2);


        Quiz quiz1 = new Quiz("Quiz 1",quiz1questions);
        quiz1.run();

    }
}