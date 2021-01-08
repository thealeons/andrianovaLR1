import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ui/start.fxml"));
        stage.setTitle("ШИФР ВЕРНАМА (ОДНОРАЗОВЫЙ БЛОКНОТ)");
        stage.setScene(new Scene(root, 800,600));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
