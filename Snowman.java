import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Snowman extends Application {

  public void start(Stage stage){

    int sceneX = (400);
    int sceneY = (200);

    Rectangle snow = new Rectangle(0,100,400,100);
    Circle head = new Circle(198,60,20);
    Circle middle = new Circle(199,100,25);
    Circle bottom = new Circle(200,150,30);
    Rectangle hat = new Rectangle(183,5,30,45);
    Rectangle hatBase = new Rectangle(170,40,60,10);
    Line mouth = new Line(185,70,210,70);
    Rectangle nose = new Rectangle(195,60,30,5);
    Circle eyeOne = new Circle(185,55,2);
    Circle eyeTwo = new Circle(215,55,2);
    Line armOne = new Line(180,100,120,110);
    Line armTwo = new Line(210,100,280,110);

    snow.setStroke(Color.WHITE);
    snow.setFill(Color.WHITE);
    head.setStroke(Color.BLACK);
    head.setFill(Color.WHITE);
    middle.setStroke(Color.BLACK);
    middle.setFill(Color.WHITE);
    bottom.setStroke(Color.BLACK);
    bottom.setFill(Color.WHITE);
    nose.setStroke(Color.ORANGE);
    nose.setFill(Color.ORANGE);
    armOne.setStroke(Color.SADDLEBROWN);
    armTwo.setStroke(Color.SADDLEBROWN);


    Group root = new Group(snow,bottom,middle,head,hat,hatBase,mouth,nose,
    eyeOne,eyeTwo,armOne,armTwo);
    Scene scene = new Scene(root, sceneX, sceneY, Color.PALETURQUOISE);

    stage.setTitle("Snowman");
    stage.setScene(scene);
    stage.show();
    }

    public static void main(String[] args){
    launch(args);
    }
    }
