import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;
    @Test
    public void felineEatMeatTest() throws Exception{
        Animal animal = new Animal();
        Assert.assertEquals(feline.eatMeat(),animal.getFood("Хищник"));
        }

    @Test
    public void felineGetFamilyTest(){
        Assert.assertEquals(feline.getFamily(),"Кошачьи");
    }
    @Test
    public void felineGetKittensTest(){
        Assert.assertEquals(feline.getKittens(),1);
    }
    @Test
    public void felineKittensCountTest(){
        Assert.assertEquals(feline.getKittens(5),5);
    }
}
