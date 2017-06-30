import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Emilie's Event Planning Service!");
    System.out.println("**(Coupon code = 'JAVA', and you get a 20% discount if your event name includes the word 'birthday')**");
    System.out.println("What is the name of your event:");
    String eventName = myConsole.readLine();
    System.out.println("Great! How many guests are attending?");
    int numberofGuests = Integer.parseInt(myConsole.readLine());
    System.out.println("Type A for light snacks, B for a buffet, or C for individualized meals.");
    String foodLevel = myConsole.readLine();
    System.out.println("How many beverages would you like available? (Carbonated drinks can all be grouped into 1, same for all hard alcohol. If you want beer, wine and sodas, type 3).");
    int numberofBeverages = Integer.parseInt(myConsole.readLine());

    Boolean entertainment = false;
    System.out.println("Would you like live entertainment at this party? DJ Em won't dissapoint! Type yes or no.");
    String entertainmentYOrN = myConsole.readLine();
    if (entertainmentYOrN.equals("yes")) {
      entertainment = true;
    }
    System.out.println("Enter a coupon code here:");
    String couponCode = myConsole.readLine();

    Event customerEvent = new Event(eventName, numberofGuests, foodLevel, numberofBeverages, entertainment);
    int initialCost = customerEvent.calculateInitialCost(numberofGuests, foodLevel, numberofBeverages, entertainment);
    System.out.println("Your initial cost was $" + initialCost + ". After coupons...");
    int couponDiscount = customerEvent.discountForCoupon(initialCost, couponCode);
    int birthdayDiscount = customerEvent.discountedBirthdays(eventName, couponDiscount);

    System.out.println("Your total will be $" + birthdayDiscount);
  }
}
