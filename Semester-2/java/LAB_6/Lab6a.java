package LAB_6;
import java.util.Scanner;
class Student{
    long id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student(long id_no, int no_of_subjects_registered ){
        this.id_no=id_no;
        this.no_of_subjects_registered=no_of_subjects_registered;
        subject_code = new String[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_obtained = new String[no_of_subjects_registered];
        input();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a subjects: ");
        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.print("Enter a subjects code : ");
            subject_code[i]=sc.nextLine();
            System.out.print("Enter a subjects credits : ");
            subject_credits[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter a subjects grad : ");
            grade_obtained[i]=sc.nextLine();
        }
       
    }
    double sum=0;
    public void calculateSpi(){
        for (int i = 0; i < no_of_subjects_registered; i++) {
            if( grade_obtained[i].equals("A++")){
                
                sum+=10*subject_credits[i];
            }
            else if( grade_obtained[i].equals("A+")){
                
                sum+=9*subject_credits[i];
            }
            else if( grade_obtained[i].equals("A")){
                
                sum+=8*subject_credits[i];
            }
            else if( grade_obtained[i].equals("B+")){
                
                sum+=7*subject_credits[i];
            }
            else if( grade_obtained[i].equals("B")){
                
                sum+=6*subject_credits[i];
            }
            else if( grade_obtained[i].equals("C+")){
                
                sum+=5*subject_credits[i];
            }
            else if( grade_obtained[i].equals("C")){
                
                sum+=4*subject_credits[i];
            }
        }
        double creditsSum=0;
        for (int i = 0; i < subject_credits.length; i++) {
            creditsSum += subject_credits[i];
        }
        this.spi= sum/creditsSum;
        System.out.println(this.spi);

    }

}

public class Lab6a {
    public static void main(String[] args){
        Student stu =  new Student(230101010,2);
        stu.calculateSpi();
    }
}
