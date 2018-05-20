import br.com.douglasramiro.imac.util.Regex;
import static org.junit.Assert.*;
import org.junit.Test;

public class RegexTest {


    @Test
    public void testContainsName(){
        boolean result = Regex.getInstance().containsAValidName("Douglas Ramiro");
        assertTrue(result);
    }

    @Test
    public void testNotContainsName(){
        boolean result = Regex.getInstance().containsAValidName("Letters 4nd Numb3rs ");
        assertFalse(result);
    }

    @Test
    public void testContainsNullName(){
        boolean result = Regex.getInstance().containsAValidName(null);
        assertFalse(result);
    }

    @Test
    public void testContainsEmail(){
        boolean result = Regex.getInstance().containsEmail("contato@douglasramiro.com.br");
        assertTrue(result);
    }

    @Test
    public void testNotContainsEmail(){
        boolean result = Regex.getInstance().containsEmail("contato2douglasramiro.com.br");
        assertFalse(result);
    }

    @Test
    public void testContainsEmailNull(){
        boolean result = Regex.getInstance().containsEmail(null);
        assertFalse(result);
    }

    @Test
    public void testContainsOnlyNumbers(){
        boolean result = Regex.getInstance().containsOnlyNumbers("0123456789");
        assertTrue(result);
    }

    @Test
    public void testNotContainsOnlyNumbers(){
        boolean result = Regex.getInstance().containsOnlyNumbers("123ABN");
        assertFalse(result);
    }

    @Test
    public void testContainsOnlyNumbersNull(){
        boolean result = Regex.getInstance().containsOnlyNumbers(null);
        assertFalse(result);
    }



}
