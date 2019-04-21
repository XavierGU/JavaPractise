import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class jfxHELLOWORLD extends Application {
    public void start(Stage primaryStage){
        primaryStage.setTitle("Hello world!");
        Group roon = new Group();
        Scene scene = new Scene(roon,300,300);
        primaryStage.setScene(scene);
        Text hi = new Text("HELLO WORLD");
    }


}
