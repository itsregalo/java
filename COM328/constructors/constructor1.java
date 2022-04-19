public class constructor1 {
    int x;
    // Create a class constructor
    public constructor1(){
        x = 5; // // Set the initial value for the class attribute x
    }

    public static void main(String[] args){
        constructor1 myObj= new constructor1();
        System.out.println(myObj.x);
    }
}
