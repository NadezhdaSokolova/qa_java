import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Feline;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    int kittensCount = 4;

    @Mock
    Animal animal;
    Feline feline = new Feline();

    @Test
    public  void checkEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        try {
        assertEquals("Мясо не ест", animal.getFood("Хищник"), feline.eatMeat());

    }
        catch (IOException e) {
            System.out.println("Вряд ли хищник");
        }
    }

    @Test
    public void checkGetFamily() {

        Mockito.when(animal.getFamily()).thenReturn("Кошачьи");

        assertEquals("Является представителем другого класса", animal.getFamily(),
                feline.getFamily());
    }

    @Test
    public void checkGetKittensWithOutParam(){

        //Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals("Кошачьи все же присутствуют",1,
                feline.getKittens());

    }

    @Test
    public void checkGetKittensWithParam(){
        //feline.getKittens(kittensCount);
        //Mockito.when(feline.getKittens(kittensCount)).thenReturn(kittensCount);
        assertEquals("Кошачьи все же присутствуют",kittensCount,
                feline.getKittens(kittensCount));

    }

}
