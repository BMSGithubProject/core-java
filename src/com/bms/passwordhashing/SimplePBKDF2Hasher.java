package com.bms.passwordhashing;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class SimplePBKDF2Hasher {

  public static String hashSimple(String password, byte[] salt) throws Exception{
    KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
    SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
    byte[] hash = f.generateSecret(spec).getEncoded();
    return String.valueOf(hash);
  }
}
