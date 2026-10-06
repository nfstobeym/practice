package practiceJava;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    //no comment test

    private TextField input1;
    private TextField input2;
    private TextField input3;
    private TextField input4;




    @Override
    public void start(Stage stage) {

        // ==========================
        // TITLE
        // ==========================

        Label title = new Label("PROGRAM TITLE");


        // ==========================
        // INPUTS
        // ==========================

        input1 = new TextField();
        input1.setPromptText("Enter value");

        input2 = new TextField();
        input2.setPromptText("Enter value");

        input3 = new TextField();
        input3.setPromptText("Enter value");


        // ==========================
        // BUTTONS
        // ==========================

        Button calculateButton = new Button("Calculate");
        Button clearButton = new Button("Clear");


        // ==========================
        // RESULT
        // ==========================

        resultLabel = new Label("Result: ");


        // ==========================
        // CALCULATE
        // ==========================

        calculateButton.setOnAction(e -> calculate());


        // ==========================
        // CLEAR
        // ==========================

        clearButton.setOnAction(e -> {

            input1.clear();
            input2.clear();
            input3.clear();

            resultLabel.setText("Result: ");

        });


        // ==========================
        // LAYOUT
        // ==========================

        VBox root = new VBox(10);

        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(

                title,

                new Label("Input 1"),
                input1,

                new Label("Input 2"),
                input2,

                new Label("Input 3"),
                input3,

                calculateButton,
                clearButton,

                resultLabel
        );


        // ==========================
        // SCENE
        // ==========================

        Scene scene = new Scene(root, 400, 500);

        stage.setTitle("JavaFX Program");
        stage.setScene(scene);
        stage.show();
    }


    // ==========================
    // MAIN LOGIC
    // ==========================

    private void calculate() {

        try {

            double value1 =
                    Double.parseDouble(input1.getText());

            double value2 =
                    Double.parseDouble(input2.getText());

            double value3 =
                    Double.parseDouble(input3.getText());


            // ==================================
            // WRITE YOUR SOLUTION HERE
            // ==================================

            double result = value1 + value2 + value3;


            // ==================================
            // DISPLAY RESULT
            // ==================================

            resultLabel.setText("Result: " + result);

        }

        catch (NumberFormatException e) {

            resultLabel.setText("Invalid input.");

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
