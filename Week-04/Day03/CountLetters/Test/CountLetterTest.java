import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLetterTest {
  
  CountLetter test = new CountLetter();
  
  @Test
  void letterCounter() {
    assertEquals(3,test.letterCounter("aaa").size());
    assertEquals(5, test.letterCounter("abaabbcdaac").get('a'));
    assertEquals(1, test.letterCounter("abaabbcdaace").get('e'));
    assertTrue(test.letterCounter("abaabbcdaac").containsValue(3));
    assertFalse(test.letterCounter("abaabbcdaac").containsValue(0));
    assertTrue(test.letterCounter("abaabbcdaac").containsKey('b'));
    assertFalse(test.letterCounter("abaabbcdaac").containsKey('e'));
  }
  
}