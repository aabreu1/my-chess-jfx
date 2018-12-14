package chessapp;

import chessapp.controll.GameController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GameController game = new GameController();
        game.buildUpGame();
        primaryStage.setTitle("MyChess");
        primaryStage.setScene(new Scene(game.getBoard(),500,500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
