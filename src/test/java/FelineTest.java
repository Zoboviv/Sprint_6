import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void felineEatMeatTest() throws Exception{
        Feline feline = new Feline();
        Animal animal = new Animal();
        Assert.assertEquals(feline.eatMeat(), animal.getFood("Хищник"));
        }

    @Test
    public void felineGetFamilyTest(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void felineGetKittensTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void felineKittensCountTest(){
        Feline feline = new Feline();
        Assert.assertEquals(5,feline.getKittens(5));
    }
}
