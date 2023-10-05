import java.util.ArrayList;
import java.util.List;


public class VotingService {
    
    private static List<Student> submissions = new ArrayList<>();

    //count for answers
    private int numA;
    private int numB;
    private int numC;
    private int numD;
    private int numE;



    public void output(Question q){
        System.out.println("The number for each answers");
        System.out.println("A: " + numA);
        System.out.println("B: " + numB);
        System.out.println("C: " + numC);
        System.out.println("D: " + numD);
        System.out.println("E: " + numE);

        System.out.println("The correct answer[s] is: " + q.getAnswer());

    }

    public void submit(Student s){
        for(int i = 0; i < submissions.size(); i++){
            if(s.getUniqueID() != submissions.get(i).getUniqueID()){
                submissions.add(s);
            }
            else{
                System.out.println("Repeated student");
            }
        }
        
    }

}
