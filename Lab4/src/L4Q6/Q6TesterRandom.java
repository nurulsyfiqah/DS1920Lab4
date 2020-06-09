package L4Q6;
import java.util.*;
public class Q6TesterRandom {

    public static void main(String[] args){
        Random r = new Random();
        Q6DoubleLinkedList a = new Q6DoubleLinkedList();
        Q6DoubleLinkedList b = new Q6DoubleLinkedList();

        System.out.print("The random numbers are : ");
        int i=0;
        while(i < 10){
            int randNum = r.nextInt(101);
            System.out.print(randNum+" ");
            a.addRight(randNum);
            b.addRight(randNum);
            i++;
        }
        System.out.println("");
        System.out.println("Insert the random number into the doubly linked list");
        a.showList();
        System.out.println("");
        System.out.println("Remove a number from the third position");
        a.deleteByPos(3);
        a.showList();
        System.out.println("");
        System.out.println("Replace the number in seventh position with 999");
        a.deleteByPos(7);
        a.addByPos(999,7);
        a.showList();
        System.out.println("");
        System.out.println("Remove all even number from the double linked list");
        a.removeEven();
        a.showList();
    }

}
