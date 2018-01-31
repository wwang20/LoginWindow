package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertWindow {

    public void inputAlertWindow(String title, String message){
        Stage popWinErrorInput = new Stage();
        popWinErrorInput.setTitle(title);
        popWinErrorInput.initModality(Modality.APPLICATION_MODAL);
        popWinErrorInput.setMinHeight(150);
        popWinErrorInput.setMinWidth(200);

        Button btnClosePopUpWindow = new Button("Close this window");
        btnClosePopUpWindow.setOnAction(e -> popWinErrorInput.close());

        Label errorMsg = new Label(message);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(errorMsg,btnClosePopUpWindow);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        popWinErrorInput.setScene(scene);
        popWinErrorInput.showAndWait();
    }
}
