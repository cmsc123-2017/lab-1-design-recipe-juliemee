import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testItemCreated() {
    Item t = new Item("Bag",1000.0);
    
    assertEquals("Bag", t.item);
    assertEquals(1000.0,t.price);
    
  }
  
  public void testNotReduced() {
    Item t = new Item("USB",1000.0);
    
    assertEquals(1000.0, t.reducedPrice());
  }
  
  public void testReducedPrice() {
    Item t = new Item("USB",1500.0);
    
    assertEquals(1275.0, t.reducedPrice());
  }
  
 
}
