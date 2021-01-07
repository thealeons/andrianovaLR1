import logic.Decoder;
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

    @Test
    public void checkDecryption(){
        String  inputText = "0 116 116 0 ";
        String key = "тсет";
        String  result = "тест";
        assertEquals(result,new Decoder().decryption(inputText,key));
    }

}
