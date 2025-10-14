import java.util.Scanner;

public class Lab03_Q1{
    //Grade calculator and letter grade finder
    //Oğuzhan Yılmaz
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        //user inputs
        System.out.print("Enter your midterm score:    ");
        double midTerm = scanner.nextDouble();

        System.out.print("Enter your final exam score: ");
        double Final = scanner.nextDouble();

        //final score calculation
        double avarage = (Final*0.6)+(midTerm*0.4);
        System.out.printf("Your avarage is:%17.1f\n", avarage );//avarage score
        
        //if statements to decide which letter grade
        if (Final>=50.0){
        if (avarage>50){
            if (avarage >= 90.0){
                System.out.printf("Your letter grade is:%10s\n", "AA");
            }
            else if (avarage < 90  && avarage >= 85){
                System.out.printf("Your letter grade is:%10s\n", "BA");
            }
            else if (avarage < 85  && avarage >= 80){
                System.out.printf("Your letter grade is:%10s\n", "BB");
            }
            else if (avarage < 80  && avarage >= 75){
                System.out.printf("Your letter grade is:%10s\n", "CB");
            }
            else if (avarage < 75  && avarage >= 70){
                System.out.printf("Your letter grade is:%10s\n", "CC");
            }
            else if (avarage < 70  && avarage >= 60){
                System.out.printf("Your letter grade is:%10s\n", "DC");
            }
            else if (avarage < 60  && avarage >= 50){
                System.out.printf("Your letter grade is:%10s\n", "DD");
            }
        }
        else{
            System.out.printf("Your letter grade is:%10s\nYou failed the course","FF");
        }
        }
        else{
            System.out.printf("Your letter grade is:%10s\nYou failed the course due to insufficient final score","FF");
        }




    }
}