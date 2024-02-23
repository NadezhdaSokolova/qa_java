import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LionWithExceptionTest {

    String sex = "Пример";
    Predator feline;

    @Test()
    public void constructorThrowsExceptionOnIncorrectSex()  {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion(sex,feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test()
    public void ExceptionOnIncorrectSex()  {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion(sex,feline);
            lion.doesHaveMane();
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}