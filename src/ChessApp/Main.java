package ChessApp;

import ChessApp.Controll.GameController;
import com.sun.javafx.runtime.SystemProperties;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.awt.AWTAccessor;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        GameController game = new GameController();
        game.BuildUpGame();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
