package com.company;

class Base {
    public void Print()
    {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public void Print()
    {
        System.out.println("Derived");
    }
}

class PolymorphismExample {
    public static void DoPrint(Base a)
    {
        ((Derived) a).Print();
    }
    public static void main(String[] args)
    {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();

        // DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}
