import java.util.Scanner;
public class Lab03_Q2 {
    //credit card approving program
    //Oğuzhan Yılmaz
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //user inputs
        System.out.print("Enter the applicant's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter applicant's annual income: ");
        int annualIncome = scanner.nextInt();

        System.out.print("Enter applicant's credit score: ");
        int creditScore = scanner.nextInt();

        System.out.print("Enter the number of existing credit cards: ");
        int cardNumber = scanner.nextInt();

        System.out.print("Enter the monthly rent/mortgage payment: ");
        double mortgage = scanner.nextDouble();

        //veriables for eligibility score
        int agePoint = 0;
        int annualPoint = 0;
        int creditPoint = 0;
        double mortgagePoint = 0.0;
        
        
        //point from age
        if (18<=age && age<=25){
            agePoint = 10;
        } 
        else if (26<=age && age<=35){
            agePoint = 20;
        }
        else if (36<=age && age<=50){
            agePoint = 25;
        }
        else if (51<=age && age<=65){
            agePoint = 15;
        }
        System.out.println("age score:" + agePoint);
        
        //point from annual income
        if (((annualIncome*5)/10000)<200){
            Math.floor(annualPoint = ((annualIncome*5)/10000));
        }
        else{
            annualPoint = 200;
        }
        System.out.println("annual score:" + annualPoint);
        //point from credit score
        if (300<=creditScore && creditScore<=579){
            creditPoint = 0;
        }
        else if (580<=creditScore && creditScore<=669){
            creditPoint = 50;
        }
        else if (670<=creditScore && creditScore<=739){
            creditPoint = 100;
        }
        else if (740<=creditScore && creditScore<=799){
            creditPoint = 150;
        }
        else if (800<=creditScore && creditScore<=850){
            creditPoint = 200;
        }
        System.out.println("credit score:" + creditPoint);
        //deduction from mortgage
        mortgagePoint = Math.floor(((mortgage/500)*5));
        System.out.println("mortgage deduction:" + mortgagePoint);
        //eligibility score
        int eligibility = (int)(100+agePoint+annualPoint+creditPoint-(10*cardNumber)-mortgagePoint);

        System.out.println("Total eligibility score: " + eligibility);

        //value control

        boolean ageLegit;
        boolean annualLegit;
        boolean creditLegit;
        boolean creditCardLegit;
        boolean eligibilityLegit;
        
        //age
        if (age>=18){
            ageLegit = true;
        }
        else{
            ageLegit = false;
        }

        //annual income
        if (annualIncome>=15000){
            annualLegit = true;
        }
        else{
            annualLegit = false;
        }

        //credit score
        if (creditScore>=580){
            creditLegit = true;
        }
        else{
            creditLegit = false;
        }
        
        //credit cart
        if (cardNumber<=5){
            creditCardLegit = true;
        }
        else{
            creditCardLegit = false;
        }

        //eligibility score
        if (eligibility>=250){
            eligibilityLegit = true;
        }
        else{
            eligibilityLegit = false;
        }

        if ( ageLegit==true && annualLegit==true && creditLegit==true && creditCardLegit==true && eligibilityLegit==true){
            System.out.println("The applicant is approved for the credit card");
        }

        //in case of decline
        else{
            System.out.print("The applicant is not approved for the credit card. Reason: ");
            if (ageLegit == false){
                System.out.print("age below 18 ");
            }
            if (annualLegit == false){
                System.out.print("annual income is below $15000 ");
            }
            if (creditLegit == false){
                System.out.print("credit score is below 580 ");
            }
            if (creditCardLegit == false){
                System.out.print("number of existing credit cards exceeds 5 ");
            }
            if (eligibilityLegit == false){
                System.out.print("total eligibility score is below 250 points");
            }
        }



    }
    
}
