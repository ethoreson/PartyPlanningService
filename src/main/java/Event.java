import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Event {
  private String mEventName;
  private int mNumberOfGuests;
  private String mFoodLevel;
  private int mBeverages;
  private Boolean mEntertainment;

  public Event(String eventName, int numberofGuests, String foodLevel, int beverages, Boolean entertainment) {
    mEventName = eventName;
    mNumberOfGuests = numberofGuests;
    mFoodLevel = foodLevel;
    mBeverages = beverages;
    mEntertainment = entertainment;
  }

  public String getEventName() {
    return mEventName;
  }

  public int getNumberOfGuests() {
    return mNumberOfGuests;
  }

  public String getFoodLevel() {
    return mFoodLevel;
  }

  public int getBeverages() {
    return mBeverages;
  }

  public Boolean getEntertainment() {
    return mEntertainment;
  }

  public int calculateInitialCost(int numberofGuests, String foodLevel, int beverages, Boolean entertainment) {
    int finalOutput = 0;
    int guests = numberofGuests;
    int costOfBeverages = (beverages * 10);
    int foodLevelInt = 0;
    if (foodLevel == "A") {
      foodLevelInt += 2;
    } else if (foodLevel == "B") {
      foodLevelInt += 4;
    } else {
      foodLevelInt += 6;
    }
    finalOutput = (guests * foodLevelInt + costOfBeverages);
    if (entertainment) {
      finalOutput += 100;
    }
    return finalOutput;
  }

  public int discountedBirthdays(String eventName, int totalCost) {
    String eventNameLowered = eventName.toLowerCase();
    int newCost = totalCost;
    if (eventNameLowered.contains("birthday")) {
      int reducedPrice = (int)(totalCost*(20.0f/100.0f));
      newCost = (totalCost - reducedPrice);
    }
    return newCost;
  }

  public int discountForCoupon(int totalCost, String couponCode) {
    if (couponCode != "JAVA") {
    } else {
      totalCost -= 40;
    }
    return totalCost;
  }
}
