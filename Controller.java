import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea areaResultados;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblDatospersona;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblNombre;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    
    private Persona persona; 
    
    @FXML
    void guardarDatos(ActionEvent event) {
        
        areaResultados.setText(txtCodigo.getText());

    }

    @FXML
    void limpiarDatos(ActionEvent event) {

    }
    
    public void startOut(){
    String nombre = persona.getNombre();
     String codigo = persona.getCodigo();
      String email =  persona.getEmail();
      
      txtCodigo.setText(codigo);
      txtNombre.setText(nombre); 
      txtEmail.setText(email);
      
    }
    

    @FXML
    void initialize() {
        assert areaResultados != null : "fx:id=\"areaResultados\" was not injected: check your FXML file 'Untitled'.";
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'Untitled'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'Untitled'.";
        assert lblCodigo != null : "fx:id=\"lblCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert lblDatospersona != null : "fx:id=\"lblDatospersona\" was not injected: check your FXML file 'Untitled'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Untitled'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'Untitled'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'Untitled'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'Untitled'.";

    }

}
