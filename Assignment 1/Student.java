import java.util.*;

public class Student {
    
    private String uniqueID;
    private List<String> studentAnswer = new ArrayList<>();

    //getter and setter for Unique ID
    public String getUniqueID(){
        return uniqueID;
    }

    public void setUniqueID(String ID){
        uniqueID = ID;
    }

    public void setAnswer(int type){

    }

    public List<String> getAnswer(int type){
        
        return studentAnswer;
    }


}
