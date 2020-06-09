package L4Q2;
import java.util.*;

public class Q2Tester {
    static Q2LinkedList a = new Q2LinkedList();
    static Q2ListNode head;

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = s.nextLine();
        String[] splitWord = word.split("");

        for(int i=0; i<splitWord.length; i++){
            a.addNote(splitWord[i]);
        }
        System.out.print("The original list : ");
        a.showList();
        System.out.println("\nSplit the list into two");
        a.splitList();
        System.out.println("\nSplit the list by alternating the nodes ");
        a.alternateList2();
        System.out.println("\nMerge First List and Second List by alternating the nodes");
        a.mergeList();
        System.out.println("\nReverse the list. Recursive method in the LinkedList");
        a.reverse();
        a.showList();
        System.out.println("\nReverse the List. Recursive method in tester class");
        reverse();

    }

    public static Q2ListNode reverse(Q2ListNode head){
        Q2ListNode newNode;
        if(head.getLink() == null){
            return head;
        }
        newNode = reverse(head.getLink());
        head.getLink().setLink(head);
        head.setLink(null);
        return newNode;
    }

   public static void reverse(){
        head = a.getList();
        head = reverse(head);
        while(head != null){
            System.out.print(head.toString());
            head = head.getLink();
        }
    }
}
