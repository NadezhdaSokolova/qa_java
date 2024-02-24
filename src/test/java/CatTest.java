import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Feline feline = new Feline();

    Cat cat = new Cat(feline);

    @Test
    public void checkSoundOfCat(){
        assertEquals ("Голосовой индикатор не совпадает", "Мяу", cat.getSound());
    }

    @Test
    public void checkGetFoodOfMeat() throws Exception {

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals ("Не хищник", feline.getFood("Хищник"), cat.getFood());

    }

}