import java.util.ArrayList;

public class OneOptQuestion {
    private final String text;
    protected final ArrayList<Option> options;

    OneOptQuestion(String text, ArrayList<Option> optionsList) {
        this.text  = text;
        this.options = optionsList;
    }

    protected String getDescription(){
        return  "Question with single answer";
    }

    boolean check(String input){
        char opt = input.charAt(0);
        int index = Character.getNumericValue(opt)-1;
        return this.options.get(index).isTrue();
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder(this.text);
        res.append(" (").append(this.getDescription()).append(")");
        res.append("\n-----------------");

        for(int i = 0; i < this.options.size(); i++) {
            res.append("\n").append((i + 1)).append(": ").append(this.options.get(i).toString());
        }
        return res.toString();
    }
}
