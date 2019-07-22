# WhatsappWEB_Desktop
1 - Please change 'String html' Variable to the site you want.
2 - -> engine.load ("https://web.whatsapp.com/");
(comment) //engine.loadContent(html);

that is, the code will be:

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
    private String html = ""; //Site that you want in quotation marks and do not forget the HTTPS: //

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        
        WebEngine engine = webView.getEngine();
        engine.load("html");
        //engine.loadContent(html);
    }

}
