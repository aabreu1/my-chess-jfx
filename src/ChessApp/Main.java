package ChessApp;

import com.sun.javafx.runtime.SystemProperties;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

 /*   public static final ResourceBundle BUNDLE_IMG = ResourceBundle.getBundle("", Locale.getDefault());
    public static final ResourceBundle BUNDLE_PATTERN = ResourceBundle.getBundle("", Locale.getDefault());
    public static final ResourceBundle BUNDLE_SCORE = ResourceBundle.getBundle("", Locale.getDefault());
*/
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
