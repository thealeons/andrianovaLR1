package ui;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import logic.Decoder;
import logic.Encoder;
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
    public Pane mainPanel;
    public TextArea input;
    public TextArea output;
    public Button startBtn;
    public ChoiceBox typeShfr;

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
            generateKey.setVisible(false);
            mainPanel.setVisible(true);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void startShfr(MouseEvent mouseEvent) {
        if (typeShfr.getValue().equals("Шифратор")){
            output.setText(new Encoder().encryption(input.getText(),key.getText()));

        }
        else if (typeShfr.getValue().equals("Дешифратор")){
            output.setText(new Decoder().decryption(input.getText(),key.getText()));
        }
    }

}
