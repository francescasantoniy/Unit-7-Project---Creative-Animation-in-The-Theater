import org.code.theater.*;
import org.code.media.*;
import java.util.ArrayList;


public class DrinkScene extends Scene {

  // Instance Variables
  private DrinkObject firstCafe;
  private DrinkObject secondCafe;
  private DrinkObject thirdCafe;
  private DrinkObject fourthCafe;
  private DrinkObject fifthCafe;
  private DrinkObject sixthCafe;
  private DrinkObject seventhCafe;

  // Constructor
  public DrinkScene() {
    firstCafe = new DrinkObject("cartoon-of-brick-coffee-shop-with-striped-awning-outdoor-seating-greenery-and-setting-sun-in-the-background-free-vector.jpg", 0, 0);
    secondCafe = new DrinkObject("Screenshot-2025-04-04-9.06.39-AM.png", 0, 0);
    thirdCafe = new DrinkObject("Screenshot-2025-04-04-9.25.29-AM.png", 0, 0);
    fourthCafe = new DrinkObject("Screenshot-2025-04-04-8.37.28-AM.png", 0, 0);
    fifthCafe = new DrinkObject("Screenshot-2025-04-04-10.09.39-AM.png", 0, 0);
    sixthCafe = new DrinkObject("Screenshot-2025-04-04-10.22.02-AM.png", 0, 0);
    seventhCafe = new DrinkObject("Ratatouille-remy2-(1).png", 64, 158);
  }

  // first scene front of cafe
  public void drawScene() {
    setTextStyle(Font.SANS, FontStyle.BOLD);
    drawImage(firstCafe.getFileName(), firstCafe.getX(), firstCafe.getY(), 610);
    drawText("Welcome to Chessas Cafe!", 10, 20);
    pause(1.0);
    drawText("Let's go inside!", 251, 65);
    pause(1.7);

    // inside cafe
    drawImage(secondCafe.getFileName(), secondCafe.getX(), secondCafe.getY(), 400);
    setTextColor("white");
    drawText("Let's make a drink!", 31, 228);
    pause(1.0);

 // each part of matcha being made images in order
    ArrayList<DrinkObject> cafeSteps = new ArrayList<>();
    cafeSteps.add(thirdCafe);
    cafeSteps.add(fourthCafe);
    cafeSteps.add(fifthCafe);
    cafeSteps.add(sixthCafe);

    drawSteps(cafeSteps); // loops through list of each image
    
// remmy showing finished matcha
    setTextColor("white");
    setTextHeight(15);
    drawText("Matcha with strawberry cold foam", 157, 242);
    drawImage(seventhCafe.getFileName(), seventhCafe.getX(), seventhCafe.getY(), 100);
  }

  // Draws each image of matcha in a list with a pause
  private void drawSteps(ArrayList<DrinkObject> drinks) {
    for (DrinkObject d : drinks) {
      drawImage(d.getFileName(), d.getX(), d.getY(), 400);
      pause(0.5);
    }
  }
}

