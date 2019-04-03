import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("JavaFX");
        primaryStage.getIcons().add(new Image("/icon/11.png"));
       // primaryStage.setIconified(true); 设置最小化
        // primaryStage.setMaximized(true); 设置最大化
        //primaryStage.close();关闭窗口
      primaryStage.setWidth(500);
        primaryStage.setHeight(500);
       /* primaryStage.setMaxHeight(1000);
        primaryStage.setMaxWidth(1000);
        primaryStage.setMinHeight(200);
        primaryStage.setMinWidth(200);*/

       // primaryStage.setResizable(false);设置不可改变窗口大小

        /*System.out.println(primaryStage.getWidth());
        System.out.println(primaryStage.getHeight());*/
       /* primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println(t1.doubleValue());
            }
        });
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println(t1.doubleValue());
            }
        });*/
       //获取当前高度和宽度
        primaryStage.setFullScreen(true);
        primaryStage.setScene(new Scene(new Group()));
        primaryStage.show();

    }
}
