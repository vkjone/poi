package cn.lmf.pane;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();

        AnchorPane ap = new AnchorPane();
        ap.setStyle("-fx-background-color: #FF3E96");

        Button b1 = new Button();
//        b1.setLayoutX(100);
//        b1.setLayoutY(100);

        AnchorPane.setTopAnchor(b1,100.0);
        ap.getChildren().add(b1);

//        root.setStyle("-fx-background-color: #FF3E96");
//        root.setOnMouseClicked(event -> System.out.println("hello"));

        Scene scene = new Scene(ap);
        primaryStage.setScene(scene);
        primaryStage.setTitle("hello");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);


        primaryStage.show();
    }
}
