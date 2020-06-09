package L4Q3;


public class Q3LinkedList<T extends Comparable<T>> {

    private Q3ListNode head;

    public void showList(){
        Q3ListNode current = head;
        while(current != null){
            System.out.println(current.toString());
            current = current.getLink();
        }
    }

    public void addNode(T a){
        Q3ListNode newNode = new Q3ListNode(a, null);
        Q3ListNode current = head;

        if(head == null){
            head = newNode;
        }else{
            while(current.getLink() != null){
                current = current.getLink();
            }
            current.setLink(newNode);
        }
    }

    public int totalCredit(){
        Q3ListNode current = head;
        int sum = 0;
        if(head == null){
            return 0;
        }else{
            while(current != null){
                sum += Integer.parseInt(current.print());
                current = current.getLink();
            }
        }
        return sum;
    }


}
