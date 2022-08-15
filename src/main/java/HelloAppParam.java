import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloAppParam extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        var text = new Text();
        var textField = new TextField();
        var button = new Button("Say It");
        var layout = new VBox();
        var scene = new Scene(layout, 600, 600);

        primaryStage.setTitle("Hello app with custom message"); 
        textField.setPromptText("What is your name?");
        layout.getChildren().addAll(textField, button, text);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(30));
        layout.setSpacing(10);
        button.setOnMouseClicked(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                var name = textField.getText();
                
                if (name.trim().isEmpty()) {
                    text.setFill(Color.RED);
                    text.setText("Please type your name, then try again");
                } else {
                    text.setFill(Color.GREEN);
                    text.setText(String.format("Hello, %s", name));
                }
            } 
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
