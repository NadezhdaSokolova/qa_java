import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Lion;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline = new Feline();

    Lion lion = new Lion("Самец", feline);

    public LionTest() throws Exception {
    }


    @Test
    public void checkGetKittens(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals ("Количество не совпадает", feline.getKittens(), lion.getKittens());
    }


    @Test
    public void checkGetFood() throws Exception {

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals ("Не хищник]", feline.getFood("Хищник"), lion.getFood());

    }
}