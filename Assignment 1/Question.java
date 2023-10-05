import java.util.*;

public class Question {
    
    private static List<String> rightAnswer;
    private static Random rand = new Random();

    //getter and setter
    //gets the correct answer
    public List<String> getAnswer(){
        return rightAnswer;
    }

    //0 is single, 1 is multi
    public void setRightAnswer(int type){
        if(type == 0 ){
            int ans = rand.nextInt(5);
            rightAnswer.add(Character.toString((char)ans));
        }

        else if(type == 1){
            int num = rand.nextInt(5);

            //TODO how to implement multiple answers    
        }
    }
    

}
