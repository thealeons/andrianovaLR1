package ui;

import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import logic.KeyGenerator;

public class Start {

    public Button createKey;
    public Label key;
    public Button randomKey;
    public DialogPane addKey;
    public DialogPane generateKey;
    public GridPane startButtonsPanel;
    public Button saveGenerateKey;
    public TextField generateKeyValue;

    public void addKey(MouseEvent mouseEvent) {
        addKey.setVisible(true);
    }

    public void generateKey(MouseEvent mouseEvent) {
        startButtonsPanel.setVisible(false);
        generateKey.setVisible(true);
    }

    public void saveGenerateKey(MouseEvent mouseEvent) {
        try {
            key.setText(new KeyGenerator().getKey(Integer.parseInt(generateKeyValue.getText())));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
