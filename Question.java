import java.util.Arrays;

public class Question {
    private int Id;
    private String question;
    private String []option=new String[4];
    private String answer;

    public Question(int Id,String question,String []option,String answer){
        this.Id=Id;
        this.question=question;
        this.option=option;
        this.answer=answer;
    }
    public void setId(int id) {
        Id = id;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setOption(String[] option) {
        this.option = option;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public int getId() {
        return Id;
    }
    public String getQuestion() {
        return question;
    }
    public String[] getOption() {
        return option;
    }
    public String getAnswer() {
        return answer;
    }
    
    @Override
    public String toString() {
        return "Question [Id=" + Id + ", question=" + question + ", option=" + Arrays.toString(option) + ", answer="
                + answer + "]";
    }

    
    
}
