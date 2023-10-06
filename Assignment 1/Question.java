import java.util.*;

public class Question {
    
    private static HashMap<String,String> rightAnswer = new HashMap<>();
    private static Random rand = new Random();

    //getter and setter
    //gets the correct answer
    public String getAnswer(){
        String ans = "";
        for(String i : rightAnswer.values()){
            ans += i + " ";
        }
        return ans;
    }

    //0 is single, 1 is multi
    public void setRightAnswer(int type){
        //rightAnswer.clear();
        if(type == 0 ){
            int temp = rand.nextInt(5)+1;
            if(temp == 1){
                    rightAnswer.put(Integer.toString(temp), "Answer A");
                }
                else if(temp == 2){
                    rightAnswer.put(Integer.toString(temp), "Answer B");
                }
                else if(temp == 3){
                    rightAnswer.put(Integer.toString(temp), "Answer C");
                }
                else if(temp == 4){
                    rightAnswer.put(Integer.toString(temp), "Answer D");
                }
                else if(temp == 5){
                    rightAnswer.put(Integer.toString(temp), "Answer E");
                }
        }

        else if(type == 1){
            int num = rand.nextInt(5)+1;
            int count = 0;

            while(count < num){
                int temp = rand.nextInt(5)+1;
                
                if(temp == 1){
                    rightAnswer.put(Integer.toString(temp), "Answer A");
                    count++;
                }
                else if(temp == 2){
                    rightAnswer.put(Integer.toString(temp), "Answer B");
                    count++;
                }
                else if(temp == 3){
                    rightAnswer.put(Integer.toString(temp), "Answer C");
                    count++;
                }
                else if(temp == 4){
                    rightAnswer.put(Integer.toString(temp), "Answer D");
                    count++;
                }
                else if(temp == 5){
                    rightAnswer.put(Integer.toString(temp), "Answer E");
                    count++;
                }

            }
        }
    }
    
    public void clear(){
        rightAnswer.clear();
    }

}
