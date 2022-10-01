package ReviewClasses.Review06;

public class StringMethod {
    public static void main(String[] args) {

        String str="hello";
        //toUpperCase or toLowerCase changes to upper or lower case
        str.toUpperCase(); // unused method bc String is unmutable
        System.out.println(str); //hello
        System.out.println("========================");
        str=str.toUpperCase();
        System.out.println(str); //HELLO

        //length()-->Returns the length of this String
        int size=str.length();
        System.out.println(size);

        //charAt()--> Returns a char value at the specified index it always starts at 0
        char letter=str.charAt(0);
        System.out.println(letter);//H

        //how to get the last Character
        char lastCharacter=str.charAt(str.length()-1); //.length-1 is bc length is 5 letters NOT by index so 5-1=4th index
        System.out.println(lastCharacter);//0

        //indexOf Returns the index within this string of the first occurrence of the specified character.
        int index=str.indexOf(lastCharacter);
        System.out.println(index);//4

        System.out.println(str.indexOf('a'));//-1

        System.out.println(str.indexOf('e'));//-1
        System.out.println(str);

        //isEmpty()-returns true if length is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);




    }
}
