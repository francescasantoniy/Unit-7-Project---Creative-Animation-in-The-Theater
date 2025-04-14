import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {
    
    DrinkScene scene = new DrinkScene();

    scene.drawScene();

    Theater.playScenes(scene);
 
  }
}