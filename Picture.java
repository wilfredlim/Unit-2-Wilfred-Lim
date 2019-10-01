import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Picture extends Application {

  public void start(Stage stage){
    Text hey = new Text(200, 150, "Hey!");
    Text command = new Text(220, 100, "Take the apple!");
    Rectangle grass = new Rectangle(0, 150, 400, 200);
    Rectangle trunk = new Rectangle(40, 50, 20, 100);
    Circle sun = new Circle( 350, 40, 25);
    Ellipse leafOne = new Ellipse (50, 35, 40, 35);
    Ellipse leafTwo = new Ellipse (30, 65, 40, 35);
    Ellipse leafThree = new Ellipse (65, 65, 40, 35);
    Circle apple = new Circle (60, 80, 5);
    Line stem = new Line (60, 70, 60, 80);

    trunk.setStroke(Color.SADDLEBROWN);
    trunk.setFill(Color.SADDLEBROWN);
    leafOne.setStroke(Color.FORESTGREEN);
    leafOne.setFill(Color.DARKSEAGREEN);
    leafTwo.setStroke(Color.FORESTGREEN);
    leafTwo.setFill(Color.DARKSEAGREEN);
    leafThree.setStroke(Color.FORESTGREEN);
    leafThree.setFill(Color.DARKSEAGREEN);
    sun.setStroke(Color.YELLOW);
    sun.setFill(Color.KHAKI);
    grass.setStroke(Color.MEDIUMSEAGREEN);
    grass.setFill(Color.MEDIUMSEAGREEN);
    apple.setStroke(Color.CRIMSON);
    apple.setFill(Color.CRIMSON);
    stem.setStroke(Color.DARKRED);

    Group root = new Group(hey, command, grass, sun, trunk, leafOne,
    leafTwo, leafThree, stem, apple);
    Scene scene = new Scene(root, 400, 200, Color.PALETURQUOISE);

    stage.setTitle("Picture");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
