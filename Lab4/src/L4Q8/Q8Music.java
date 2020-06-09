package L4Q8;
import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class Q8Music {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] music = {"Blue Bird.mp3","Crossing Field.mp3","Dive to World.mp3","Takkan Pisah.mp3"};
        System.out.println("My Music Playlist");
        JFXPanel panel = new JFXPanel();

        Q8CircularLinkedList a = new Q8CircularLinkedList();
        for(int i=0; i<music.length; i++){
            a.addCircularNode(music[i]);
        }

        int act;
        int i=1;

        do{
            a.showCircularList();
            System.out.print("\n1 Play Music | 2 Forward | 3 Back | 4 Stop | -1 Exit : ");
            act = s.nextInt();

            if(act==1){
                System.out.println("Play Music : "+a.getCircularItem(i));
                playSong((String) a.getCircularItem(i));
            }else if(act==2){
                System.out.println("Forward One Position - Play Music "+a.getCircularItem(i+1));
                playSong((String) a.getCircularItem(i+1));
                i++;
            }else if(act==3){
                System.out.println("Backward One Position - Play Music "+a.getCircularItem(i-1));
                playSong((String) a.getCircularItem(i-1));
                i--;
            }else if(act==4){
                System.out.println("Stop Playing");
            }else if(act==-1){
                System.out.println("Exit Music Player");
                System.exit(0);
            }else{
                System.out.println("Invalid key");
            }

        }while(act!=-1);

        
    }

    public static void playSong(String song){

        Media hit = new Media(Paths.get(song).toUri().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        try {
            Thread.sleep(15000);
        } catch (Exception e) {}
        mediaPlayer.stop();
    }

}
