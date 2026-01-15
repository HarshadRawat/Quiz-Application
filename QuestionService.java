import java.util.Scanner;


public class QuestionService {
    
    Question []questions=new Question[5];
    String []selection=new String[5];

    String []ques={
        "What is Java?",
        "What is JVM?",
        "What is OOP?",
        "What is Inheritance?",
        "What is Polymorphism?"
    };

    String[] ans = {
        "Language",
        "Virtual Machine",
        "OOP",
        "Reuse",
        "Many forms"
    };


    String [][]options={
        {"Language", "OS", "Browser", "Database"},
        {"Compiler", "Interpreter", "Virtual Machine", "Hardware"},
        {"Logic", "OOP", "Data", "Program"},
        {"Reuse", "Memory", "File", "Thread"},
        {"Overloading", "Overriding", "Many forms", "Encapsulation"}
    };

    public QuestionService(){
        for (int i=0;i<questions.length;i++){
            questions[i]=new Question(i+1,ques[i],options[i],ans[i]);
        }
    } 

    public void quizplay(){
        int i=0;
        for(Question q: questions){
            System.out.println("Question No."+q.getId());
            System.out.println(q.getQuestion());
            String []optno=q.getOption();
            for(int j=0;j<optno.length;j++){
                System.out.println(j+1 + " )" + optno[j]+" ");
            }
            Scanner sc=new Scanner(System.in);
            System.out.println("Choose the correct option: ");
            selection[i]=sc.nextLine();
            i++;
        }
    }
    public void printScore(){
        int score=0;
        for(int i=0;i<selection.length;i++){
            String correctans=questions[i].getAnswer();
            String userans=options[i][(Integer.parseInt(selection[i])-1)];
            if(correctans.equals(userans)){
                score++;
            }
        }
        System.out.println("Your Score is " + score);
    }
}
