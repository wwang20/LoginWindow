package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller implements EventHandler<ActionEvent>{
        @FXML
        private JFXTextField text_UserNameInput;
        @FXML
        private JFXPasswordField pass_PasswordInput;
        @FXML
        private JFXButton btn_SignIn;
        @FXML
        private JFXButton btn_SignUp;

    @FXML
    protected void pressSignIn(ActionEvent event) throws IOException {
       String singninData = text_UserNameInput.getText() + "@" + pass_PasswordInput.getText();
       System.out.println(singninData);

        Stage accountStage = (Stage) btn_SignIn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("account.fxml"));
        accountStage.setTitle("Account");
        accountStage.setScene(new Scene(root, 1000, 800));
        accountStage.show();

    }

    @FXML
    protected void pressSignUp(ActionEvent event) throws IOException {
        Stage signupDormStage = (Stage)btn_SignUp.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("signup_form.fxml"));
        signupDormStage.setTitle("Signup form");
        signupDormStage.setScene(new Scene(root, 1000, 800));
        signupDormStage.show();
    }

    @FXML
    protected String inputUserName(ActionEvent event){

        String nameString = null;
        nameString = text_UserNameInput.getText();
        return nameString;
    }

    @FXML
    protected String inputPassword(ActionEvent event){

        String passString = null;

        passString = pass_PasswordInput.getText();

        return passString;

    }

    @FXML
    protected void resetPassword(ActionEvent event){
        System.out.println("Reset Password!");

    }

    @FXML
    public void handleClose(ActionEvent event){
        System.exit(0);
    }



    protected boolean isUserNameInputValid(String userNameInput){
        boolean isInputValid = false;
        String regex = "^[a-zA-Z0-9]";

        if(!userNameInput.isEmpty() && userNameInput.matches(regex)){
            isInputValid = true;
        }
        return isInputValid;
    }


    @Override
    public void handle(ActionEvent event) {

    }
}
