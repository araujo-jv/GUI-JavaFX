import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        var pane = new StackPane();
        var text = new Text("Hello World");
        var scene = new Scene(pane, 500, 500);

        text.setFont(Font.font(26));
        pane.getChildren().add(text);
        primaryStage.setTitle("Hello World App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
