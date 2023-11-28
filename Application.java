package calculator;

import javax.swing.JPanel;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application {
    public static void main(String[] args) {
        // Initialize JavaFX Toolkit
        new JPanel();

        // Create instances of Client and Server
        Client client = new Client();
        Server server = new Server();

        // Start the JavaFX application for the Client
        Platform.runLater(() -> {
            Stage clientStage = new Stage();
            client.start(clientStage);
        });

        // Start the JavaFX application for the Server
        Platform.runLater(() -> {
            Stage serverStage = new Stage();
            server.start(serverStage);
        });
    }
}
