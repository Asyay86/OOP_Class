import java.util.*;

public class Student {
    
    private String uniqueID;
    private HashMap<String,String> studentAnswer = new HashMap<>();
    private static Random rand = new Random();

    //getter and setter for Unique ID
    public String getUniqueID(){
        return uniqueID;
    }

    public void setUniqueID(String ID){
        uniqueID = ID;
    }

    public void setAnswer(int type){

        if(type == 0 ){
            int temp = rand.nextInt(5)+1;
            if(temp == 1){
                    studentAnswer.put(Integer.toString(temp), "Answer A");
                }
                else if(temp == 2){
                    studentAnswer.put(Integer.toString(temp), "Answer B");
                }
                else if(temp == 3){
                    studentAnswer.put(Integer.toString(temp), "Answer C");
                }
                else if(temp == 4){
                    studentAnswer.put(Integer.toString(temp), "Answer D");
                }
                else if(temp == 5){
                    studentAnswer.put(Integer.toString(temp), "Answer E");
                }
        }

        else if(type == 1){
            int num = rand.nextInt(5) + 1;
            int count = 0;

            while(count < num){
                int temp = rand.nextInt(5)+1;
                if(temp == 1){
                    studentAnswer.put(Integer.toString(temp), "Answer A");
                    count++;
                }
                else if(temp == 2){
                    studentAnswer.put(Integer.toString(temp), "Answer B");
                    count++;
                }
                else if(temp == 3){
                    studentAnswer.put(Integer.toString(temp), "Answer C");
                    count++;
                }
                else if(temp == 4){
                    studentAnswer.put(Integer.toString(temp), "Answer D");
                    count++;
                }
                else if(temp == 5){
                    studentAnswer.put(Integer.toString(temp), "Answer E");
                    count++;
                }

            }
        }
    }

    public HashMap<String,String> getAnswer(){
        
        return studentAnswer;
    }

    public void clear(){
        studentAnswer.clear();
    }
}
