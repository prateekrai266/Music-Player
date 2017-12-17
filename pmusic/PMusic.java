/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmusic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author PowerUser   
 */
public class PMusic extends Application {
     
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
       Media media = new Media("file:///C:/Users/PowerUser/Music/faded.mp3");
       MediaPlayer player = new MediaPlayer(media);
       player.setAutoPlay(true);
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("pMusic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
}
