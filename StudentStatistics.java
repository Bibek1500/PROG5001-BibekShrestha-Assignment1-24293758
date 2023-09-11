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
    double [] marks = new double[3];
    for (int i = 0; i<marks.length;i++){
        double mark;
        do{
            System.out.println("enter the mark: ");
            mark = input.nextDouble();
            if (mark<0 || mark>30){
                System.out.print("Error: The mark should be between 0 and 30!");
            }
        }while(mark <0 || mark>30);
    marks[i] = mark;
    }
}} 
