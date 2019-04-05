/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progutvsemester;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author alexanderbjorlo
 */
public class MainGUIController implements Initializable {

    @FXML
    private Color x2;
    @FXML
    private Font x1;
    @FXML
    private Color x4;
    @FXML
    private Font x3;
    @FXML
    private Button registrateButton;
    @FXML
    public AnchorPane kundeNavn;
    @FXML
    public TextField fornavn;
    public TextField etternavn;
    public TextField Fakturaadresse;
    public Label testLabel;
    @FXML
    public Button registrer;
    private String firstName;
    private String lastName;
    private String billingAdress;
    /**
     * Initializes the controller class.
     */
    
    private void handleRegistrerButtonAction(ActionEvent event){
        try{
            if(fornavn.getText() != null && !fornavn.getText().isEmpty()){
                firstName = fornavn.getText();
                
            } else {
                firstName = "jane doe";
            }
            
            if(etternavn.getText() != null && !etternavn.getText().isEmpty()){
                lastName = etternavn.getText();
                
            } else {
                lastName = "";
            }
            
            if(Fakturaadresse.getText() != null && !Fakturaadresse.getText().isEmpty()){
                billingAdress = Fakturaadresse.getText();
            } else {
                billingAdress = "";
            }
            
        } catch(NullPointerException e){
            System.out.println("Nullpeker");
        }
    }
    
    
    @FXML
    private void handleRegistrateButton(ActionEvent event){
        FXMLLoader fxmlLoader = new 
            FXMLLoader(getClass().getResource("registrering.fxml"));
        Parent root1;
            try {
                root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setTitle("Report Page");
                stage.setScene(new Scene(root1));
                stage.setResizable(false);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(MainGUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

            
    }    
    
}
