import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Feline;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    int kittensCount = 4;
    @Spy
    Feline feline = new Feline();

    @Test
    public  void checkEatMeat() throws Exception {
        feline.getFood("Хищник");
        assertEquals("Мясо не ест", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());

    }

    @Test
    public void checkGetFamily() {

       assertEquals("Является представителем другого класса", "Кошачьи", feline.getFamily());
    }

    @Test
    public void checkGetKittensWithOutParam(){
        assertEquals("Кошачьи все же присутствуют",1,
                feline.getKittens());
    }

    @Test
    public void checkGetKittensWithParam(){
        assertEquals("Кошачьи все же присутствуют",kittensCount,
                feline.getKittens(kittensCount));
    }

}

