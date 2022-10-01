package ReviewClasses.Review06;

public class StringMethod2 {
    public static void main(String[] args) {

        String textFromApplictaion=" Enroll today ";
        String textFromUserStory="Enroll today";

        if(textFromApplictaion.trim().equals(textFromUserStory)) { //trim has to go before .equals
            System.out.println("Text is matched. Test Pass");
        }else {
            System.out.println("Text is NOT matched.Test Failed");
        }
        System.out.println(textFromApplictaion.trim()); // "Enroll today"
        System.out.println(textFromApplictaion);//-->you have to add trim " Enroll today "

        //substring cuts your sentence you give it the star point
        String str="Hello Class";
        String part2=str.substring(6);//Class
        System.out.println(part2);

        String part1=str.substring(0,5);//Hello
        System.out.println(part1);

        //concat is like at +
        String newString=part1.concat(" ").concat(part2);//the way to use concat
        System.out.println("newString");
        System.out.println("newString");

        System.out.println(part1+part2); //Concatanates

        //some Examples

        char single=newString.substring(6).charAt(0); // Printing Class but only asking to print 1st letter C
        System.out.println(single);

        //newString.charAt(0).substring(6); you would get compiler error string cant go with a string

        //replace();
        //Replaces each substring of this that matches target
        //Sequence with the specified replacement sequence
        String myString="Today is September"; //must re-assign value to use method
        myString=myString.replace("September","October");//Replaces if find

        System.out.println(myString);

        myString=myString.replace('A','w');//does not replace if not found
        System.out.println(myString);

        //myString.equalsIgnoreCase("Today is october").replace('a','i'); this will not work its string and boolean

        System.out.println("===SPLIT=====");
        //split(); cuts our string gives you an array of string

        String myStr="Today is a review class";
        String[] array=myStr.split(" ");
        System.out.println(array.length);// print-out 5
        System.out.println(array[3]);//print-out "review"
        for(int i=0; i<array.length;i++) { // To access All elements
            System.out.println(array[i]);
        }
        //other way
        for(String arr:array) {  //this is an advanced for loop arr: is a temporary string name
            System.out.println(arr);
        }

    }
}
