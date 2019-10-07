package Methods;




import java.util.Scanner;

/** 
 * Class 8-2 Problem 2
 * Student Major and Status is determined by the two characters inputted by the user
 * Thanh Tran
 * October 29, 2019
 */

public class StudentMajorClass {

    public static void majorStatus (char major) {
        
        if (major == 'M' ) {
           System.out.println ("Major: Mathematics");
        } else if (major == 'C') {
            System.out.println("Major: Computer Science");
        } else if (major == 'I') {
            System.out.println("Major: Information Technology");
        } else {
            System.out.println("Not a valid input");          
        }
        }
    
    public static void yearStatus (char year) {
    
       if (year == '1' ) {
           System.out.println ("Status: Freshman");
        } else if (year == '2') {
            System.out.println("Status: Sophomore");
        } else if (year == '3') {
            System.out.println("Status: Junior");
        } else if (year == '4'){
            System.out.println("Status: Senior");           
        } else {
            System.out.println("Not a valid input");
        } 
    }

    public static void main (String[] args){
        
        System.out.println("Enter two characters");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        char code1 = userInput.charAt(0);
        char code2 = userInput.charAt(1);
        majorStatus(code1);
        yearStatus(code2);
       
        
        
        
    }
}
