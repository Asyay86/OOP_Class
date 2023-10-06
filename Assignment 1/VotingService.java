import java.util.*;


public class VotingService {
    
    private static List<Student> submissions = new ArrayList<>();

    //count for answers
    private int numA;
    private int numB;
    private int numC;
    private int numD;
    private int numE;



    public void output(Question q, int type){
        if(type == 0){
            System.out.println("This is a single choice question");
        }
        else{
            System.out.println("This is a multiple choice question");
        }
        System.out.println("Number of students submitted = " + submissions.size());
        for(int i = 0; i < submissions.size(); i++){
            for(String j : submissions.get(i).getAnswer().keySet()){
                if(submissions.get(i).getAnswer().get(j) == "Answer A"){
                    numA++;
                }
                else if(submissions.get(i).getAnswer().get(j) == "Answer B"){
                    numB++;
                }
                else if(submissions.get(i).getAnswer().get(j) == "Answer C"){
                    numC++;
                }
                else if(submissions.get(i).getAnswer().get(j) == "Answer D"){
                    numD++;
                }
                else if(submissions.get(i).getAnswer().get(j) == "Answer E"){
                    numE++;
                }

            }
            submissions.get(i).clear();
        }

        System.out.println("The number for each answers from students");
        System.out.println("A: " + numA);
        System.out.println("B: " + numB);
        System.out.println("C: " + numC);
        System.out.println("D: " + numD);
        System.out.println("E: " + numE);

        System.out.println("The correct answer[s] is: " + q.getAnswer());

        submissions.clear();
    }

    public void submit(Student s){
        boolean yes = true;
        if(submissions.size() != 0){
            for(int i = 0; i < submissions.size(); i++){
                if(s.getUniqueID() != submissions.get(i).getUniqueID()){
                    
                }
                else{
                    System.out.println("Repeated student");
                    yes = false;
                }
            }
            if(yes){
                submissions.add(s);
            }
        }  
        else{
            submissions.add(s);
        }
    }

    public void clear(){
        submissions.clear();
    }
}
