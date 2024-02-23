import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class ParameterizedLionTest {
    boolean hasMane;
    String sex;
    Predator feline;


    public ParameterizedLionTest (String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }


    @Parameterized.Parameters

    public static Object[][] checkDoesHaveMane() {
        return new Object [][] {
                {"Самец", true},
                {"Самка", false},

        };
    }

    @Test
    public void shouldBeDefinition() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals (hasMane, lion.doesHaveMane());
    }

}