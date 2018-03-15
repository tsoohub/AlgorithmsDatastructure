
import java.nio.charset.Charset;
import java.util.Base64;

public class TinyURL {

    public String encode(String longUrl) {
        byte[] encodedBytes = Base64.getEncoder().encode(longUrl.getBytes());
        System.out.println("Ecoded value is " + new String(encodedBytes, Charset.forName("UTF-8")));
        return new String(encodedBytes, Charset.forName("UTF-8"));
    }

    public String decode(String shortUrl) {
        byte[] valueDecoded = Base64.getDecoder().decode(shortUrl);
        System.out.println("Decoded value is " + new String(valueDecoded));
        return new String(valueDecoded);
    }
}
