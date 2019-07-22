/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsapp.pkg1.pkg0;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author jose_
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private WebView webView;
    private String html = "<scripts src=\"/../.build/momentLocales/pt.bfad6c58becd7836cab2.js.map\"></scripts></scripts>";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        
        WebEngine engine = webView.getEngine();
        //engine.load("https://web.whatsapp.com/");
        engine.loadContent(html);
    }

}
