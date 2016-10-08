import org.apache.commons.codec.binary.Base64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decoder {

    public static void main(String[] args) throws IOException {
    	    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        String s = br.readLine();
        
    	byte[] valueDecoded= Base64.decodeBase64(s.getBytes() );
    	System.out.println(new String(valueDecoded));

    }
}