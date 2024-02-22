import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Lion;
import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    Feline feline = new Feline();

    Lion lion = new Lion("Самец", feline);


    @Mock
    Animal animal;

    public LionTest() throws Exception {
    }


    @Test
    public void checkGetKittens(){
        assertEquals ("Количество не совпадает", feline.getKittens(), lion.getKittens());
    }


    @Test
    public void checkGetFood() throws Exception {

        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        try {
            assertEquals ("Не съел мясо", animal.getFood("Хищник"), lion.getFood());

        }
        catch(IOException e) {
            System.out.println("Вряд ли лев");

        }
    }
}
