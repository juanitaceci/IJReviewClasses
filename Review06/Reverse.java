package ReviewClasses.Review06;

public class Reverse {
    public static void main(String[] args) {

        //How would you reverse a String without using reverse function

        /*
         1. Use StringBuilder and reverse method
         2. Use charAt();
         3. Use toCharArray(); Method
         */

        //Using CharAt(); Method
        String str="hello";
        String newString="";

        for(int i=str.length()-1; i>=0; i--){
             newString=newString+str.charAt(i);
        }
        System.out.println(newString);

        //Using StringBuilder Class

     // String s="Class is almost over"; Another way to initialize String
        StringBuilder sb=new StringBuilder("Class is almost over");
        sb.reverse();
        System.out.println(sb);

        //Using toCharArray(); Method

    }
}
