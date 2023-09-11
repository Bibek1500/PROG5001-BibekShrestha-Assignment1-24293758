import java.util.Scanner;
/**
 * Write a description of class StudentStatistics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentStatistics
{
      public static void main(String[] args){
    //f1\
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Assessment name: ");
    String assessmentName = input.nextLine();
    
     //f2 and f3
    int [] marks = new int[3];
    
    for (int i = 0; i<marks.length;i++){
        int mark;
        do{
            System.out.println("enter the mark: ");
            mark = input.nextInt();
            if (mark<0 || mark>30){
                System.out.println("Error: The mark should be between 0 and 30!");
            }
        }while(mark <0 || mark>30);
    marks[i] = mark;
    }
    
    //f4
    System.out.println("Assessment name: "+ assessmentName);
    for (int i=0; i<marks.length;i++){
        System.out.println(marks[i]);
    }
    
    //f5
    double hMark = marks[0];
    double lMark = marks[0];
    int totalStudents = 30;
    
    for(int i = 0; i<3; i++) {
        if(marks[i] > hMark) {
            hMark = marks[i];
        }
        if(marks[i] < lMark) {
            lMark = marks[i];
        }       
    }
    System.out.println("The highest marks: " + hMark);
    System.out.println("The Lowest marks: " + lMark);
    
    
    
    
    
    
}
   
    
    
} 
