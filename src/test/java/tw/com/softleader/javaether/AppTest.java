package tw.com.softleader.javaether;

import org.ethereum.util.RLP;

public class AppTest {

  public static void main(String[] args) {
    
    String data = "000000000000000000000000cd2a3d9f938e13cd947ec05abc7fe734df8dd82668656c6c6f20776f726c640000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000de0b6b3a7640000";
    System.out.println(new String(RLP.encodeElement(data.getBytes())));
    
  }
  
}
