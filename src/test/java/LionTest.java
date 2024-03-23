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
        Assert.assertEquals(lion.getKittens(),1);
    }

    @Test
    public void lionDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionGetFood() throws Exception {
        Lion lion = new Lion(feline);
        Animal animal = new Animal();
        Assert.assertEquals(lion.getFood(),animal.getFood("Хищник"));
    }
}
