package com.company;

class IntegerExample {
    public static void integerExample() {
        Integer num4a = 127;
        Integer num4b = 126;

        Integer num1a = 100;
        Integer num1b = 100;

        Integer num2a = 200;
        Integer num2b = 200;


        Integer num3a = 300;
        Integer num3b = 300;


        if(num1a == num1b){
            System.out.println("num1a == num1b " + num1a);
        }
        else{
            System.out.println("num1a != num1b " + num1a + " " + num1b);
        }

        if(num2a == num2b){
            System.out.println("num2a == num2b " + num2a);
        } else{
            System.out.println("num2a != num2b " + num2a + " " + num2b);
        }

        if(num3a == num3b){
            System.out.println("num3a == num3b " + num3a);
        }
        else{
            System.out.println("num3a != num3b " + num3a + " " + num3b);

        }

        num4b = new Integer(127);
        if(num4a == num4b){
            System.out.println("num4a == num4b " + num4a + " " + num4b);

        }
        else{
            System.out.println("num4a != num4b " + num4a + " " + num4b);
        }
    }

    public static void main(String[] args) {
        integerExample();
    }
}