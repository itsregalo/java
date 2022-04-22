import java.io.*;

public class NoArgConstructor {
    short id;
    int Age;
    String Name;
    double FeePaid;
    long Salary;
    char gender;
    float temp;
    byte byte1;

    // contructor
    NoArgConstructor(){
        System.out.println("Constructor called");
    }
}

class Example{
    public static void main(String[] args){
        NoArgConstructor Obj1 = new NoArgConstructor();
        System.out.println("string "+Obj1.Name);
        System.out.println("Integer "+Obj1.Age);
        System.out.println("Double: "+Obj1.FeePaid);
        System.out.println("Short: "+Obj1.id);
        System.out.println("long: "+Obj1.Salary);
        System.out.println("char: "+Obj1.gender);
        System.out.println("Float: "+Obj1.temp);
        System.out.println("Byte: "+Obj1.byte1);
    }
}
