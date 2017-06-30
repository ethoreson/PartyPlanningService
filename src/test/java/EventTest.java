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
}
