import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boolean isPlayer1 = true;
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard(board);
            char symbol = isPlayer1 ? 'X' : 'O';
            System.out.println("Player " + (isPlayer1 ? "1" : "2") + " [" + symbol + "] - your turn: ");

            int row = getValidInput(scanner, "row", board, symbol);
            int col = getValidInput(scanner, "column", board, symbol);

            board[row][col] = symbol;

            if (hasPlayerWon(board, symbol) || isBoardFull(board)) {
                gameEnded = true;
            } else {
                isPlayer1 = !isPlayer1;
            }
        }

        printBoard(board);
        declareWinner(board);
        scanner.close();
    }

    private static int getValidInput(Scanner scanner, String type, char[][] board, char symbol) {
        int input = -1;
        while (true) {
            System.out.print("Enter " + type + " number (1-3): ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt() - 1;
                if (input >= 0 && input < 3) {
                    if (type.equals("row") || (type.equals("column") && board[input][input] == ' ')) {
                        break;
                    } else {
                        System.out.println("This cell is already occupied. Choose another one.");
                    }
                } else {
                    System.out.println(type + " number is out of bounds. Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input; please enter numbers only.");
                scanner.next(); // discard non-integer input
            }
        }
        return input;
    }

    private static void printBoard(char[][] board) {
        System.out.println("Board:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("-+-+-");
            }
        }
    }

    private static boolean hasPlayerWon(char[][] board, char symbol) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void declareWinner(char[][] board) {
        if (hasPlayerWon(board, 'X')) {
            System.out.println("Player 1 [X] wins!");
        } else if (hasPlayerWon(board, 'O')) {
            System.out.println("Player 2 [O] wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
