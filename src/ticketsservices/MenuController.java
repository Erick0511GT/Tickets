/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ticketsservices;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author steve
 */
public class MenuController implements Initializable {

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
     private String username;
    private Stage stage;
    private LoginController loginController;

   
    public void init(String username, Stage stage, LoginController loginController) {
        this.username = username;
        this.stage = stage;
        this.loginController = loginController;
        System.out.println("Logged in as: " + username);
        
        // Do any other initialization here (e.g., update UI with username)
    }
        public void UsuariosController(ActionEvent event) {

        System.out.println("Botón de Usuarios presionado");
        // Cargar el FXML de los usuarios
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Usuarios.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para el manejo de usuarios
            Scene scene = new Scene(root);
            Stage userStage = new Stage();
            userStage.setScene(scene);

            // Inicializar el controlador de la nueva vista
            UsuariosController usuariosController = loader.getController();

            // Mostrar la nueva ventana
            userStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
       
    }
       public void RolesController(ActionEvent event) {
        System.out.println("Botón de Roles presionado");

        // Intentar cargar el archivo FXML de Roles
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Roles.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Roles
            Scene scene = new Scene(root);
            Stage rolesStage = new Stage();
            rolesStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (RolesController)
            RolesController rolesController = loader.getController();

            // Mostrar la nueva ventana
            rolesStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }
       
    public void soporteController(ActionEvent event) {
        System.out.println("Botón de Soporte presionado");

        // Intentar cargar el archivo FXML de Soporte
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Soporte.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Soporte
            Scene scene = new Scene(root);
            Stage soporteStage = new Stage();
            soporteStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (soporteController)
            SoporteController soporteController = loader.getController();

            // Mostrar la nueva ventana
            soporteStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }
        public void ColaController(ActionEvent event) {
        System.out.println("Botón de Cola presionado");

        // Intentar cargar el archivo FXML de Cola
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cola.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Cola
            Scene scene = new Scene(root);
            Stage colaStage = new Stage();
            colaStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (ColaController)
            ColaController colaController = loader.getController();

            // Mostrar la nueva ventana
            colaStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }
    
    public void DepartamentosController(ActionEvent event) {
        System.out.println("Botón de Departamentos presionado");

        // Intentar cargar el archivo FXML de Departamentos
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Departamentos.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Departamentos
            Scene scene = new Scene(root);
            Stage departamentoStage = new Stage();
            departamentoStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (DepartamentosController)
            DepartamentosController deptoController = loader.getController();

            // Mostrar la nueva ventana
            departamentoStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }

    public void NotaController(ActionEvent event) {
        System.out.println("Botón de Notas presionado");

        // Intentar cargar el archivo FXML de Notas
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("NotasAdicionales.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Notas
            Scene scene = new Scene(root);
            Stage notaStage = new Stage();
            notaStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (NotasController)
            NotasAdicionalesController notasController = loader.getController();
            
            // Mostrar la nueva ventana
            notaStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }
    public void HistorialController(ActionEvent event) {
        System.out.println("Botón de Historial presionado");

        // Intentar cargar el archivo FXML de Historial
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Historial.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Historial
            Scene scene = new Scene(root);
            Stage historialStage = new Stage();
            historialStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (HistorialController)
            HistorialController histController = loader.getController();

            // Mostrar la nueva ventana
            historialStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }
    public void EstadoTicketsController(ActionEvent event) {
        System.out.println("Botón de EstadoTickets presionado");

        // Intentar cargar el archivo FXML de EstadosTicket
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EstadoTickets.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Estados de Ticket
            Scene scene = new Scene(root);
            Stage estadoTicketsStage = new Stage();
            estadoTicketsStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (EstadoticketController)
            EstadoTicketsController estadoTicketsController = loader.getController();

            // Mostrar la nueva ventana
            estadoTicketsStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }
    
   public void ParametrosController(ActionEvent event) {
        System.out.println("Botón de Parametros presionado");

        // Intentar cargar el archivo FXML de Parametros
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Parametros.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Parametros
            Scene scene = new Scene(root);
            Stage paramStage = new Stage();
            paramStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (Parametros)
            ParametrosController paramController = loader.getController();

            // Mostrar la nueva ventana
            paramStage.show();

    
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }  

   
   public void LoginController(ActionEvent event) {
        System.out.println("Botón de Salir presionado");

        // Intentar cargar el archivo FXML de Login
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena para la ventana de Login
            Scene scene = new Scene(root);
            Stage loginStage = new Stage();
            loginStage.setScene(scene);

            // Inicializar el controlador de la nueva vista (Login)
            LoginController paramController = loader.getController();


            // Mostrar la nueva ventana
            loginStage.show();
            //cerrar
             Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error al cargar el FXML
        }
    }
   
    
        
}
