import java.util.ArrayList;

public class MoreOptQuestion extends  OneOptQuestion{
    MoreOptQuestion(String text, ArrayList<Option> optionsList) {
        super(text, optionsList);
    }

    @Override
    protected  String getDescription(){
        return  "Question with multiple answers";
    }

    @Override
    boolean check(String input){
        int correctCnt = 0;
        for(final  Option option : this.options){
            if(option.isTrue()){correctCnt++;}
        }

        int correctAnswersCnt = 0;
        for(final char a : input.toCharArray()){
            int index = Character.getNumericValue(a)-1;
            if(this.options.get(index).isTrue()){
                correctAnswersCnt++;
            }
        }
        return  correctCnt == correctAnswersCnt;
    }

}
