package L4Q4;
import java.util.*;

public class Q4StarList {
    public static void main(String[] args){
        Random r = new Random();

        int player = r.nextInt(2)+1;
        System.out.println("Player "+player+" start first");

        Q4LinkedList firstRoll = new Q4LinkedList();
        Q4LinkedList secRoll = new Q4LinkedList();


        while(firstRoll.length()<=20||secRoll.length()<=20){
            int first = r.nextInt(6)+1;
            for(int i=0; i<first; i++){
                firstRoll.addNode('*');
            }
            int sec = r.nextInt(6)+1;
            for(int i=0; i<sec; i++){
                secRoll.addNode('*');
            }

            if(player==1){
                System.out.print("Player 1: ");
                firstRoll.showList();
                System.out.println("");
                System.out.print("Player 2: ");
                secRoll.showList();
                System.out.println("");
            }else{
                System.out.print("Player 2: ");
                secRoll.showList();
                System.out.println("");
                System.out.print("Player 1: ");
                firstRoll.showList();
                System.out.println("");
            }
        }
        if(firstRoll.length()>secRoll.length()){
            System.out.println("Player 1 wins the game");
        }else{
            System.out.println("Player 2 wins the game");
        }
    }
}
