import java.util.HashMap;
import java.util.UUID;

public class EncodeandDecodeTinyURL {
    private HashMap<String,String>  map;
    private String baseUrl;


    public EncodeandDecodeTinyURL(){
        map = new HashMap<String,String>();
        baseUrl = "http://tinyurl.com/";
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        String s = UUID.randomUUID().toString().substring(0,6);
        map.put(s,longUrl);
        return sb.append(baseUrl).append(s).toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String k = shortUrl.substring(shortUrl.length() - 6);
        return map.get(k);
    }
}
