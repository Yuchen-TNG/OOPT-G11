import java.util.Scanner;

public class P5Q4 {

    public static void main(String [] args){
        Scanner Code = new Scanner(System.in);
        boolean invalid = false;

        System.out.print("Enter a product code: ");
        String Productcode = Code.next();

        if(Productcode.length() !=8)
        invalid = true;

        for (int i = 0; i< Productcode.length(); i++){
            char ch = Productcode.charAt(i);

            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                invalid = true;
                break;
            }else if (i<2){
                if(Character.isLetter(ch) == false || Character.isUpperCase(ch) == false){
                    invalid = true;
                    break;
                }
            }else if (Character.isDigit(ch) == false || Character.isUpperCase(ch) == false){
                invalid = true;
                break;
            }else if (Character.isDigit(ch) == false){
                invalid=true;
                break;
            }
        }

        if (invalid)
        System.out.println("Invalid Product Code");
        else
            System.out.println("Valid Product Code");



    }
    
}
