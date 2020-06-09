package L4Q4;

public class Q4LinkedList<T extends Comparable<T>> {
    private Q4ListNode head;

    public void showList(){
        Q4ListNode current = head;
        while(current != null){
            System.out.print(current.toString());
            current = current.getLink();
        }
    }

    public void addNode(T a){
        Q4ListNode newNode = new Q4ListNode(a,null);
        Q4ListNode current = head;
        if(head == null){
            head = newNode;
        }else{
            while(current.getLink() != null){
                current = current.getLink();
            }
            current.setLink(newNode);
        }
    }

    public int length(){
        Q4ListNode current = head;
        int count = 0;
        while(current != null){
            current = current.getLink();
            count++;
        }
        return count;
    }
}
