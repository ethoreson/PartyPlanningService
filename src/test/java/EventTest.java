import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class EventTest {

  @Test
  public void newEvent_calculatesCostCorrectly() {
    Event testEvent = new Event("50th Birthday Bash", 20, "B", 3, false);
    int totalCost = testEvent.calculateInitialCost(20, "B", 3);
    int shouldEqual = 110;
    assertEquals(shouldEqual, totalCost);
  }

  @Test
  public void newEvent_calculatesAdditionalCostCorrectly() {
    Event testEvent = new Event("Golden Anniversary", 100, "A", 5, true);
    int initialCost = testEvent.calculateInitialCost(100, "A", 5);
    int totalCost = testEvent.addEntertainment(initialCost);
    int shouldEqual = 350;
    assertEquals(shouldEqual, totalCost);
  }

  @Test
  public void newEvent_calculatesBirthdayDiscount() {
    Event testEvent = new Event("Xav's birthday", 50, "C", 2, false);
    int initialCost = testEvent.calculateInitialCost(50, "C", 2);
    int atFirstShouldEqual = 320;
    int finalOutput = testEvent.discountedBirthdays("Xav's birthday", atFirstShouldEqual);
    int shouldEqual = 256;
    assertEquals(shouldEqual, finalOutput);
  }

  @Test
  public void newEvent_calculatesCouponDiscount() {
    Event testEvent = new Event("Mariel's Baby Shower", 10, "B", 4, false);
    int initialCost = testEvent.calculateInitialCost(10, "B", 4);
    int atFirstShouldEqual = 80;
    int finalOutput = testEvent.discountForCoupon(atFirstShouldEqual, "JAVA");
    int shouldEqual = 40;
    assertEquals(shouldEqual, finalOutput);
  }
}
