package L4Q5;

import java.util.Iterator;

public class Q5Remove {
    public static void main(String[] args){
        Q5LinkedList<String> a = new Q5LinkedList<>();
        a.addNote("ARS");
        a.addNote("LEI");
        a.addNote("GAF");
        a.addNote("MAN");
        a.addNote("LIV");
        a.addNote("TAT");


        System.out.print("The list contains of ");
        a.showList();
        System.out.println("\nRemove all the word that consist of the A character using iterator.");

        Iterator<String> itr = a.listIterator();
        while(itr.hasNext()){
            String str = itr.next();
            if(str.contains("A")){
                itr.remove();
            }
        }

        /*while(itr.hasNext()){
            String str = itr.next();
            for(int i=0; i<3; i++){
                if(str.charAt(i)=='A'){
                    itr.remove();
                    break;
                }
            }
        }*/

        System.out.print("The updated list consist of ");
        a.showList();




    }
}
