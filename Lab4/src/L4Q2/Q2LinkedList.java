package L4Q2;

public class Q2LinkedList<T extends Comparable<T>> {

    private Q2ListNode head;
    private Q2ListNode listA;
    private Q2ListNode listB;
    private Q2ListNode A;
    private Q2ListNode B;

    public Q2LinkedList() {
        this.head = null;
        this.listA = null;
        this.listB = null;
    }

    public void showList() {
        Q2ListNode current = head;
        while (current != null) {
            System.out.print(current.toString());
            current = current.getLink();
        }
    }

    public Q2ListNode getList() {
        return head;
    }

    public int length() {
        int count = 0;
        Q2ListNode current = head;
        while (current != null) {
            current = current.getLink();
            count++;
        }
        return count;
    }

    public void addNote(T a) {
        Q2ListNode newNode = new Q2ListNode(a, null);
        Q2ListNode current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (current.getLink() != null) {
                current = current.getLink();
            }
            current.setLink(newNode);
        }
    }

    public void splitList() {
        Q2ListNode current = head;
        if (head == null) {
            return;
        } else {
            if (length() % 2 == 0) {
                System.out.print("First List : ");
                for (int i = 0; i < length() / 2; i++) {
                    System.out.print(current.toString());
                    current = current.getLink();
                }
                System.out.print("\nSecond List List : ");
                for (int i = length() / 2; i < length(); i++) {
                    System.out.print(current.toString());
                    current = current.getLink();
                }
            } else {
                System.out.print("First List : ");
                for (int i = 0; i < length() / 2 + 1; i++) {
                    System.out.print(current.toString());
                    current = current.getLink();
                }
                System.out.print("\nSecond List: ");
                for (int i = length() / 2 + 1; i < length(); i++) {
                    System.out.print(current.toString());
                    current = current.getLink();
                }
            }
        }
    }
    //first idea :|
    //not so clever aren't me :')
    //print alternately
    /*public void alternateList() {
        Q2ListNode current = head;
        String listA = "";
        String listB = "";

        int count = 0;
        if (current == null || current.getLink() == null) {
            return;
        } else {
            while (current != null) {
                if (count % 2 == 0) {
                    listA += current.toString();
                } else {
                    listB += current.toString();
                }
                current = current.getLink();
                count++;
            }
            System.out.println("First List : " + listA);
            System.out.println("Second list :" + listB);
        }
    }*/


    public void alternateList2() {
        Q2ListNode current = head;
        if (current == null || current.getLink() == null) {
            return;
        } else {
            Q2ListNode ATemp;
            Q2ListNode BTemp;

            listA = ATemp = current; //b
            listB = BTemp = current.getLink(); //a
            current = current.getLink().getLink(); //n

            while(current != null && current.getLink() != null) {
                ATemp.setLink(current); //link the current to the ATemp - b,n
                BTemp.setLink(current.getLink()); //link the current to the ATemp - a,k

                ATemp = ATemp.getLink(); // n,i
                BTemp = BTemp.getLink(); // k,n

                current = current.getLink().getLink(); //i,g
            }
            A = listA;
            B = listB;

            if(current != null) {
                ATemp.setLink(current);
                ATemp = ATemp.getLink();
            }

            ATemp.setLink(null);
            BTemp.setLink(null);
            //mergeList(listA,listB);

            System.out.print("First List : ");
            while (listA != null) {
                System.out.print(listA);
                listA = listA.getLink();
            }
            System.out.print("\nSecond List : ");
            while (listB != null) {
                System.out.print(listB);
                listB = listB.getLink();
            }

        }
    }

    public void mergeList() {
        Q2ListNode a = A;
        Q2ListNode b = B;

        Q2ListNode temp = a;
        while(a != null && b!= null){
            Q2ListNode Atemp = a.getLink();
            Q2ListNode Btemp = b.getLink();
            a.setLink(b);
            b.setLink(Atemp);
            a = Atemp;
            b = Btemp;
        }
        while(temp != null){
            System.out.print(temp.toString());
            temp = temp.getLink();
        }
    }

    public Q2ListNode reverse(Q2ListNode head){
        Q2ListNode newNode;

        if(head.getLink() == null){
            return head;
        }
        newNode = reverse(head.getLink());
        head.getLink().setLink(head);
        head.setLink(null);
        return newNode;

        //iterative method
        /*Q2ListNode prev = null;
        Q2ListNode current = head;
        Q2ListNode next = null;

        while (current != null) {
            next = current.getLink();
            current.setLink(prev);
            prev = current;
            current = next;
        }
        current = prev;
        while(current!=null){
            System.out.print(current.toString());
            current = current.getLink();
        }*/
    }

    public void reverse(){
        head = reverse(head);
    }
}

