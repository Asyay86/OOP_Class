import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


 class SimulationDriver {
    
    //printing the results of answer choices
    public static void main(String argsp[]){

        //declaring variables
        List<Student> totalStudents = new ArrayList<>();
        VotingService control = new VotingService();
        Question q = new Question();

        //creating questionType and configuring answer
        Random rand = new Random();
        int questionType = rand.nextInt(2);
        q.setRightAnswer(questionType);

        //Simulating group of student and setting their answers.
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        Student d = new Student();
        Student e = new Student();
        Student f = new Student();
        Student g = new Student();
        Student h = new Student();
  
        totalStudents.add(a);
        totalStudents.add(b);
        totalStudents.add(c);
        totalStudents.add(d);
        totalStudents.add(e);
        totalStudents.add(f);
        totalStudents.add(g);
        totalStudents.add(h);

        for(int i = 0; i < totalStudents.size(); i++){
            totalStudents.get(i).setUniqueID(UUID.randomUUID().toString());
            System.out.println(totalStudents.get(i).getUniqueID());
            
            totalStudents.get(i).setAnswer(questionType);
            control.submit(totalStudents.get(i));
        }

        //testing repeat answers
        control.submit(totalStudents.get(1));


        //Submitting answers


        //Outputting results
        control.output(q);

    }

}
