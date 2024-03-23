import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    private Feline feline;

    @Test
    public void lionGetKittensTest() {
        Lion lion = new Lion(feline);
        Assert.assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void lionGetFood() throws Exception {
        Lion lion = new Lion(feline);
        Animal animal = new Animal();
        Assert.assertEquals(lion.getFood(), animal.getFood("Хищник"));
    }

    @Test
    public void lionDoesHaveManeException() {
        String expectedString = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("Средний пол"));
        Assert.assertEquals(expectedString, exception.getMessage());
    }

}
