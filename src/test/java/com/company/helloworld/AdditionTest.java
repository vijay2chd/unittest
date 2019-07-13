import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionTest {

  Addition myAddition = new Addition(10,16);

  @Test
  public void testGetSum() {
    assertEquals(26,myAddition.getSum());
  }

  @Test
  public void testNum1() {
    assertEquals(10, myAddition.num1);
  }

  @Test
  public void testNum2() {
    assertEquals(16, myAddition.num2);
  }

}
