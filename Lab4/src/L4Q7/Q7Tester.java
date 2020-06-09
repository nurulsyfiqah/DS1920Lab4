package L4Q7;

import java.util.Scanner;

public class Q7Tester {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String str = s.nextLine();

        Q7CircularLinkedList<String> a=new Q7CircularLinkedList<>();
        String[] word;
        word=str.split(" ");
        for(int i=0; i<word.length; i++){
            a.addCircularNode(word[i]);
        }
        System.out.println("The words in the circular linked list");
        a.showCircularList();
        System.out.println("\nAfter delete a word");
        a.deleteCircularNode();
        a.showCircularList();
        System.out.println("\nThe second item in the list is "+a.getCircularItem(2));

    }
}
