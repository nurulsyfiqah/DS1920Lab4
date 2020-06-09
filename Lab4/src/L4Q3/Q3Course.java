package L4Q3;

public class Q3Course {

    public static void main(String[] args){

        String[] courseCode = {"WXX101","WXX201","WXX301"};
        String[] courseName = {"Programming","Networking","Operating System"};
        int[] creditHours = {5,4,3};
        char[] grade = {'B','C','A'};

        int[] point = {4,3,2,1,0};
        //char[] allGrade = {'A','B','C','D','F'};
        char allGrade = 0;
        int sum = 0, totalSum = 0;
        for(int i=0; i<grade.length; i++){
            switch(grade[i]){
                case 'A':
                    sum =+ point[0]*creditHours[i];
                    break;
                case 'B':
                    sum =+ point[1]*creditHours[i];
                    break;
                case 'C':
                    sum =+ point[2]*creditHours[i];
                    break;
                case 'D':
                    sum =+ point[3]*creditHours[i];
                    break;
                case 'F':
                    sum =+ point[4]*creditHours[i];
                    break;
            }
            totalSum+=sum;
        }


        Q3LinkedList a = new Q3LinkedList();
        Q3LinkedList b = new Q3LinkedList();

        System.out.println("The list consist of ");
        for(int i=0; i<courseCode.length; i++){
            a.addNode("Course : "+courseCode[i]+" ("+courseName[i]+") - "+creditHours[i]+" credit hours. Grade : "+grade[i]);
            b.addNode(creditHours[i]);
        }
        a.showList();
        double gpa = (double) totalSum/b.totalCredit();

        System.out.println("Total point is "+totalSum);
        System.out.println("Total credit is "+b.totalCredit());
        System.out.printf("Grade point average is %.2f",gpa);

    }

}
