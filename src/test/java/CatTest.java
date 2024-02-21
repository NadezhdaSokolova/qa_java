import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Animal animal;
   Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void checkSoundOfCat(){
        assertEquals ("Голосовой индикатор не совпадает", "Мяу", cat.getSound());
    }

   @Test
    public void checkGetFoodOfMeat() throws Exception{

      Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        try {
            assertEquals ("Не съел мясо", animal.getFood("Хищник"), cat.getFood());
        }
        catch (IOException e) {
            System.out.println("Вряд ли кот");
        }

    }

}

