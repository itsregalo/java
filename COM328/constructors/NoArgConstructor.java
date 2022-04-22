import java.io.*;

public class NoArgConstructor {
    int Age;
    String Name;
    double FeePaid;

    // contructor
    NoArgConstructor(){
        System.out.println("Constructor called");
    }
}

class Example{
    public static void main(String[] args){
        NoArgConstructor Obj1 = new NoArgConstructor();
        System.out.println(Obj1.Name);
        System.out.println(Obj1.Age);
        System.out.println(Obj1.FeePaid);
    }
}
