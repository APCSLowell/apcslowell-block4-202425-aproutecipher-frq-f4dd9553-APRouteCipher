

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void surpriseTest () {
      String result;
      RouteCipher cipher = new RouteCipher(2,4);
      result = cipher.encryptMessage("Surprise");
      assertEquals("Sruirspe", result);
   }
   @Test
   public void midnightTest(){
      String result;
      RouteCipher cipher = new RouteCipher(2,3);
      result = cipher.encryptMessage("Meet at midnight");
      assertEquals("Mte eati dmnitgAhA");
   }

   @Test
   public void tooShort(){
      String result;
      RouteCipher cipher = new RouteCipher(2,4);
      result = cipher.encryptMessage("dAoAgAAA");
   }






}
