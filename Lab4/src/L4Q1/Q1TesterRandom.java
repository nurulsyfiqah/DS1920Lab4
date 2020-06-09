package L4Q1;
import java.util.LinkedList;
import java.util.Random;

public class Q1TesterRandom {
    public static void main(String[] args) {
        Random r = new Random();
        Q1LinkedList<Integer> a = new Q1LinkedList<>();
        Q1LinkedList<Integer> b = new Q1LinkedList<>();
        System.out.print("The random numbers are : ");
        for(int i=0; i<10;i++){
            int num = r.nextInt(100);
            System.out.print(num+" ");
            a.addNode(num);
            b.addFront(num);
        }

        System.out.println("\nInsert the random numbers at the back of the linked list");
        a.showList();
        System.out.println("\nInsert the random numbers in front of the linked list");
        b.showList();
        System.out.println("\nInsert the random numbers in a sorted linked list");
        b.addSort();
        b.showList();
    }

}
