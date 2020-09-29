/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author root
 */
public class KalkulagailuaController implements Initializable {
    
    @FXML
    private Label emaitza;
    
    @FXML
    private TextField batugai1,batugai2;
    
    @FXML
    private void gehiketa(ActionEvent event) {
        System.out.println("Batuketa egin dugu.");
        emaitza.setText(""+(Double.parseDouble(batugai1.getText())+Double.parseDouble(batugai2.getText())));
    }

    @FXML
    private void kenketa(ActionEvent event) {
        System.out.println("Kenketa egin dugu.");
        emaitza.setText(""+(Double.parseDouble(batugai1.getText()) - Double.parseDouble(batugai2.getText())));
    }
     @FXML
    private void biderketa(ActionEvent event) {
        System.out.println("Biderketa egin dugu.");
        emaitza.setText(""+(Double.parseDouble(batugai1.getText()) * Double.parseDouble(batugai2.getText())));
    }
    
     @FXML
    private void zatiketa(ActionEvent event) {
        System.out.println("Zatiketa egin dugu.");
        emaitza.setText(""+(Double.parseDouble(batugai1.getText()) / Double.parseDouble(batugai2.getText())));
    }
    
    @FXML
    private void berreketa(ActionEvent event) {
        double berreketaEmaitza=Double.parseDouble(batugai1.getText());
        System.out.println("Berreketa egin dugu.");
        for(int i=0; i< Double.parseDouble(batugai2.getText())-1;i++){
        berreketaEmaitza=berreketaEmaitza* Double.parseDouble(batugai1.getText());  
    }
        emaitza.setText(""+berreketaEmaitza);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
