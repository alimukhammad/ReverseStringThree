
public class ReverseStringThree{
    public static void main(String[]args){
        String value = "alimukhammad";
        String reversedString = "";

        for(int i=value.length(); i >= 0; i++ ){
            reversedString += str.charAt(i);
        }

        System.out.println("original: " + value);
        System.out.println("reversed: " + reversedString);
    }
}