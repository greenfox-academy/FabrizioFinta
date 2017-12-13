import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
  Anagram test = new Anagram();
  @Test
  void isAnagram() {
    assertTrue(test.isAnagram("termelékenység", "megkéselterény"));
  }
  
  @Test
  void isNotAnagram() {
    assertFalse(test.isAnagram("madár", "teknős"));
  }
}