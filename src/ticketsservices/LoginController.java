package ticketsservices;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 */
public class LoginController implements Initializable {

    private Stage primaryStage; // Referencia al escenario principal

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void MenuControl(ActionEvent event) throws IOException {
    System.out.println("Botón presionado, cargando Menu.fxml...");

    FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
    Parent root = loader.load();

    // Obtener el stage actual desde el evento
    Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Crear una nueva escena y establecer tamaño
    Scene scene = new Scene(root, 1200, 800); // Ajusta el tamaño según sea necesario
    currentStage.setScene(scene);

    // Asegurar que la ventana se centra en la pantalla
    currentStage.centerOnScreen();

    // Mostrar la ventana
    currentStage.show();
}
    public void setStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.centerOnScreen(); 
    }
}
