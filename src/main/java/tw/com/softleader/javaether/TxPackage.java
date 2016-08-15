package tw.com.softleader.javaether;

import org.ethereum.core.CallTransaction;
import org.ethereum.crypto.ECKey;

public class TxPackage {
  
  private final String toAddress;
  
  private final ECKey ecKey;
  
  private final CallTransaction.Function function;
  
  private final long value;
  
  private final Object[] object;

  public TxPackage(String toAddress, ECKey ecKey, CallTransaction.Function function, long value, Object... object) {
    super();
    this.toAddress = toAddress;
    this.ecKey = ecKey;
    this.function = function;
    this.value = value;
    this.object = object;
  }

  public String getToAddress() {
    return toAddress;
  }

  public ECKey getEcKey() {
    return ecKey;
  }

  public CallTransaction.Function getFunction() {
    return function;
  }

  public long getValue() {
    return value;
  }

  public Object[] getArgs() {
    return object;
  }
  
}
