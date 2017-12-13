import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
  
  Sum test = new Sum();
  
  @Test
  void autoFillTheList() {
    test.autoFillTheList(3);
    assertFalse(test.getAutoListOfInts().isEmpty());
    assertEquals(3, test.getAutoListOfInts().size());
  }
  
  @Test
  void autoFillTheListNullException() {
    test.autoFillTheList(null);
  }
  
  @Test
  void autoFillTheListIntZero() {
    test.autoFillTheList(0);
    assertTrue(test.getAutoListOfInts().isEmpty());
  }
  
  @Test
  void customAddInts() {
  test.addCustomInts(1);
  test.addCustomInts(2);
  test.addCustomInts(3);
  assertFalse(test.getCustomListOfInts().isEmpty());
  assertEquals(3, test.getCustomListOfInts().size());
  //assertEquals(1, test.getCustomListOfInts().get(0)); TODO ask how to compare Integer;
  assertTrue(test.getCustomListOfInts().contains(1));
  assertEquals(1, test.getCustomListOfInts().indexOf(2));
  }
  
  @Test
  void removeCustomInts() {
    test.addCustomInts(1);
    test.removeCustomInts(1);
    assertTrue(test.getCustomListOfInts().isEmpty());
  }
  
  @Test
  void removeCustomIntsNotInTheList() {
    test.addCustomInts(1);
    test.addCustomInts(2);
    test.removeCustomInts(5);
  } @Test
  void removeCustomIntsNull() {
    test.removeCustomInts(null);
  }
  
  @Test
  void sumTheElementsInputsAreEmpty() {
    assertEquals(0, test.sumTheElements());
  } @Test
  void sumTheElementsCustomListIsNull() {
    test.addCustomInts(null);
    assertNotNull(test.sumTheElements());
  } @Test
  void sumTheElementsCustomList() {
   test.addCustomInts(3);
   test.addCustomInts(2);
   assertEquals(3+2,test.sumTheElements());
  }
  
  @Test
  void sumTheElementsAutoList(){
    test.autoFillTheList(5);
    assertEquals(1+2+3+4+5, test.sumTheElements());
  } @Test
  void sumTheElementsAutoListNull() throws NullPointerException {
    test.addCustomInts(null);
    test.sumTheElements();
  }
  
  @Test
  void sumTheElementsBothInputIsOn() {
    test.addCustomInts(2);
    test.addCustomInts(3);
    test.autoFillTheList(5);
    assertEquals(1+2+3+4+5+2+3,test.sumTheElements());
  } @Test
  void sumTheElementsOneInputIsNull() throws NullPointerException{
    test.addCustomInts(2);
    test.addCustomInts(7);
    test.autoFillTheList(null);
  } @Test
  void sumTheElementsOtherInputIsNull() throws NullPointerException{
    test.autoFillTheList(5);
    test.addCustomInts(null);
  }
}