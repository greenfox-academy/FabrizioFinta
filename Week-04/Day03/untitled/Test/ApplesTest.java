import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
  Apples apple = new Apples();
  @Test
  void getApple() {
    assertEquals("pear", apple.getApple());
  }
  
}