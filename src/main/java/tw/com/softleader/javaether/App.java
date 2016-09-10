package tw.com.softleader.javaether;

import org.ethereum.core.CallTransaction;
import org.ethereum.crypto.ECKey;
import org.ethereum.crypto.HashUtil;
import org.ethereum.facade.EthereumFactory;

import tw.com.softleader.javaether.adapter.HelloWorldAdapter;

/**
 * Hello world!
 *
 */
public class App {
  private static final byte[] senderPrivateKey = HashUtil.sha3("cow".getBytes()); // cd2a3d9f938e13cd947ec05abc7fe734df8dd826
  private static final ECKey ecKey = ECKey.fromPrivate(senderPrivateKey);
  
  public static void main(String[] args) throws Exception {
    
    EthereumFactory.createEthereum(HelloWorldAdapter.Config.class);

    String toAddress = "3B584F3d1E4F4462B684bEE0f7Fb96D03b807C0F";
    CallTransaction.Function function = CallTransaction.Function.fromSignature("deposit", "bytes32");
    TxPackage tx = new TxPackage(toAddress, ecKey, function, 1_000_000_000_000_000_000L, "hello world");

//    CallTransaction.Function function = CallTransaction.Function.fromSignature("post", "bytes32");
//    TxPackage tx = new TxPackage(toAddress, ecKey, function, 1_000_000_000_000_000_000L, "test123");
    
    HelloWorldAdapter.txs.add(tx);
    
    //000000000000000000000000ba0f98d0e54c2e574f4beb2b2e745e10fd74a116000000000000000000000000ba0f98d0e54c2e574f4beb2b2e745e10fd74a116000000000000000000000000c1a3221eb1ae675eaa1cc3d186076db14f77e5410000000000000000000000000000000000000000000000000000000000003b06000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000012000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
  }
  
}
