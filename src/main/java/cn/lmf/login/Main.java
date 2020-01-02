package cn.lmf.login;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("hello");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);

        TextField textField = new TextField();
//        textField.setText("文本文本");

        textField.setLayoutX(100);
        textField.setLayoutY(100);

        Tooltip tip = new Tooltip("这是提示");
        tip.setFont(Font.font(40));
        textField.setTooltip(tip);

        textField.setPromptText("SB");
        textField.setFocusTraversable(false);

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
        });

        root.getChildren().add(textField);
        primaryStage.show();
    }
}
