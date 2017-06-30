import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Event {
  private String mEventName;
  private int mNumberOfGuests;
  private String mFoodLevel;
  private ArrayList mBeverages = new ArrayList();
  private Boolean mEntertainment;

  public Event(String eventName, int numberofGuests, String foodLevel, String[] beverages, Boolean entertainment) {
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

  public ArrayList getBeverages() {
    return mBeverages;
  }

  public Boolean getEntertainment() {
    return mEntertainment;
  }

  public int calculateInitialCost(int numberofGuests, String foodLevel, ArrayList beverages) {
    int numberOfBeverages = beverages.size();
    return
  }
}
