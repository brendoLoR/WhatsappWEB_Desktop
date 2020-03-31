/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsapp.pkg1.pkg0;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author jose_
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private WebView browser = new WebView();

//    private String html = "<scripts src=\"/../.build/momentLocales/pt.bfad6c58becd7836cab2.js.map\"></scripts></scripts>";
    private static String html = "https://web.whatsapp.com/";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        final WebEngine engine = browser.getEngine();

        engine.setJavaScriptEnabled(true);
        engine.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36");
        
        engine.load(html);
    }

}
