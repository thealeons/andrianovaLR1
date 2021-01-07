import logic.Encoder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void checkEncryption(){
        String  inputText = "тест";
        String key = "тсет";
        String  result = "0 116 116 0 ";
        assertEquals(result,new Encoder().encryption(inputText,key));
    }

}
