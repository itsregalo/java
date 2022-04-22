


class Foo {
    int a;
    {
        System.out.println("This code runs before a constructor");
    }

    Foo(){
        System.out.println("Here is the constructor");
    }
}

Foo bar=new Foo();