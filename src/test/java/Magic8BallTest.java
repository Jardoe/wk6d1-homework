import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Magic8BallTest {

    private Magic8Ball myAnswers;

    @Before
    public void before(){
        ArrayList<String> testAnswers = new ArrayList<>();
        testAnswers.add("Yes!");
        testAnswers.add("Maybe...");
        testAnswers.add("Hells no!");
        this.myAnswers = new Magic8Ball(testAnswers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(3, myAnswers.getAnswerCount());
    }

    @Test
    public void canGetAnswers(){
        ArrayList<String> copy = myAnswers.getAnswers();
        String randomAnswer = myAnswers.getRandomAnswer();
        assertTrue(copy.contains(randomAnswer));
    }

    @Test
    public void canAddAnswer(){
        myAnswers.addAnswer("Not today.");
        assertEquals(4, myAnswers.getAnswerCount());

    }

    @Test
    public void canDeleteAnswers(){
        myAnswers.removeAnswer("Yes!");
        assertEquals(2, myAnswers.getAnswerCount());
    }
}
