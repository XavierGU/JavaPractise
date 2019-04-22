import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class jfx2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{


        //primaryStage.setOpacity(1);
        //primaryStage.setAlwaysOnTop(true);

    /*    primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.xProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println("x的坐标"+number);
            }
        });
        primaryStage.yProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println("y的坐标="+ number);
            }
        });*/
 /*  Stage s1 = new Stage();
    s1.setTitle("s1");
    s1.initStyle(StageStyle.DECORATED);
    s1.show();*/
/*
        Stage s2 = new Stage();
        s2.setTitle("s2");
        s2.initStyle(StageStyle.TRANSPARENT);
        s2.show();
*/
     /*   Stage s3 = new Stage();
        s3.setTitle("s3");
        s3.initStyle(StageStyle.UNDECORATED);
        s3.show();*/

        Stage s4 = new Stage();
        s4.setTitle("s4");
        s4.initStyle(StageStyle.UNIFIED);
        s4.show();

        Stage s5 = new Stage();
        s5.setTitle("s5");
        s5.initStyle(StageStyle.UTILITY);
        s5.show();
        Platform.exit();

    }

}
