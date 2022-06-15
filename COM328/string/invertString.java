public class invertString{
    public static void main(String[] args){
        // java program that reads a non-empty string and prints the string obtained by inverting the first and last characters of the string.
        String str = "Hello World";


        // invert the first and last characters of the string
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        String invert = last + str.substring(1,str.length()-1) + first;
        
        // print the string
        System.out.println(invert);

    }
}