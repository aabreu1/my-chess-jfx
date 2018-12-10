package ChessApp;

import ChessApp.Controll.GameController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        GameController game = new GameController();
        game.BuildUpGame();
        primaryStage.setTitle("MyChess");
        primaryStage.setScene(new Scene(game.getBoard(),500,500));
        primaryStage.show();
    }

    /*   Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
*/
    public static void main(String[] args) {
        launch(args);
    }
}
