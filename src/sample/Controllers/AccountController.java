package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collection;

public class Account implements EventHandler<ActionEvent>{

    @FXML
    private JFXButton btn_SignUp;

    public static void display(String title){
        Stage accountWIndow = new Stage();
        accountWIndow.initModality(Modality.APPLICATION_MODAL);
        accountWIndow.setTitle(title);
        accountWIndow.setWidth(1000);
        accountWIndow.setHeight(800);

        AccountSummaryController accountSummaryController = new AccountSummaryController();
        AnchorPane layout = new AnchorPane();
        layout.getChildren().addAll((Collection<? extends Node>) accountSummaryController);


        Scene scene = new Scene(layout);
        accountWIndow.setScene(scene);
        accountWIndow.showAndWait();

    }

    @FXML
    private void pressLogoutOutBtn(ActionEvent event) throws IOException {
        Stage loginWindow = (Stage)btn_SignUp.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        loginWindow.setTitle("Login Window");
        loginWindow.setScene(new Scene(root, 1000, 800));
        loginWindow.show();
    }


    @Override
    public void handle(ActionEvent event) {

    }
}
