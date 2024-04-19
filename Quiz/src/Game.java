import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Quiz> quizzes;

    Game(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to this very funny game :)");
        System.out.println("Choose your quiz:");

        while (true) {
            for (int i = 0; i < this.quizzes.size(); i++) {
                System.out.println((i + 1) + " " + this.quizzes.get(i).toString());
            }

            while (true) {
                System.out.print("Enter the number of the quiz or 'q' to quit: ");
                String input = scanner.nextLine();

                if (input.equals("q")) {
                    System.out.println("Have a good day :)");
                    return;
                }

                if (!input.matches("\\d+") || Integer.parseInt(input) < 1 || Integer.parseInt(input) > this.quizzes.size()) {
                    System.out.println("Invalid input. Please enter a number in range 1 - " + this.quizzes.size() + " or 'q' to quit the game.");
                    continue;
                }

                int index = Integer.parseInt(input) - 1;
                this.quizzes.get(index).run();
                break;
            }
        }
    }
}
