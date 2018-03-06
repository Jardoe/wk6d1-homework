import java.util.ArrayList;
import java.util.Collections;

public class Magic8Ball {
    private ArrayList<String> answers;

    public Magic8Ball(ArrayList<String> answers){
        this.answers = answers;
    }

    public int getAnswerCount() {
       return this.answers.size();
    }

    public ArrayList<String> getAnswers() {
        ArrayList<String> copyOfAnswers = new ArrayList<>(this.answers);
        return copyOfAnswers;
    }

    public String getRandomAnswer() {
        Collections.shuffle(this.answers);
        return getAnswerAtIndex(0);
    }

    private String getAnswerAtIndex(int index) {
        return this.answers.get(index);
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void removeAnswer(String answer) {
        this.answers.remove(answer);
    }
}
