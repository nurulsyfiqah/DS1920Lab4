package L4Q1;

public class Q1LinkedList<T extends Comparable<T>> {

    private static final Object T = null;
    private Q1ListNode head;

    public Q1LinkedList() {
        this.head = null;
    }

    public void showList() {
        Q1ListNode current = head;
        while (current != null) {
            System.out.print(current.toString());
            current = current.getLink();
        }
    }

    public int length(){
        int count = 0;
        Q1ListNode current = head;
        while(current!=null){
            current = current.getLink();
            count++;
        }
        return count;
    }

    public void addNode(T a) {
        Q1ListNode newNode = new Q1ListNode(a, null);
        Q1ListNode current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (current.getLink() != null) {
                current = current.getLink();
            }
            current.setLink(newNode);
        }
    }

    public void addFront(T a) {
        head = new Q1ListNode(a, head);
    }

    public void addSort() {
        Q1ListNode current = head;
        Q1ListNode index = null;

            while(current!=null){
                index = current.getLink();
                while(index!=null){
                    if((int)current.getData()>(int)index.getData()){
                        int temp;
                        temp = (int)current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }
                    index=index.getLink();
                }
                current=current.getLink();
        }
    }
}

