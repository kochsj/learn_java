import models.GenericClass;
import models.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // same primitives as in C#
        byte b = 0;
        short s = 1;
        int i = 2;
        long l = 3;
        double d = 4.44;
        char c = 'c';
        boolean h = true; // boolean not bool

        // casting (float)4.5 OR 4.5f
        float flt = 4.5f;

        // Strings not-primitive but can use operands with other strings and primitives
        String str = new String("String made using string class constructor");
        String strAlso = "String constructed and initialized using double-quotes";
        String concat = str + " " + d + " " + strAlso;

        System.out.println(concat);

        // conditionals must evaluate to boolean true or false
        boolean v = false;
        h = v || !v; //still true 
        if(h){
            System.out.println(v);
        }

        // Java uses 'standard' boolean operators
        // also 'standard' turneary
        int z = i != 2 ? 4 : 100;
            // because i equals 2, i != 2 evaluates to false, z is assigned to 100
        System.out.println(z);

        // Array declaration and initialization same as C#
        int[] arr = new int[5];
        int[] arr2 = {0,1,2,3,4};

        for (int p=0; p < arr2.length; p++) {
            System.out.println(arr2[p]);
        }

        // 'standard' for and while loops
        // Java has 'do' keyword for a do-while loop - does the 'thing' always at least once
        do {
            System.out.println(i != 2);
            // although i != 2 evaluates to false. this line still runs. once.
        } while(i != 2);

        // foreach syntax uses colon
        for (int element : arr2){
            System.out.println(element);
        }


        // keyword new always required to create instance of object
        Person stephen = new Person("Stephen", "Koch");
        // stephen.setName("Stephen", "Koch");
        System.out.println(stephen.getName());


        // generics for class instances
        GenericClass<String, Integer> example = new GenericClass<>("Stephen", 99);
        System.out.println(example.getD1());
        System.out.println(example.getD2());

        GenericClass<Long, Character> example2 = new GenericClass<>((long)404, (char)'c');
        System.out.println(example2.getD1());
        System.out.println(example2.getD2());


    }
}