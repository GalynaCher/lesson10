package cc.robotdreams.automation;                         // packages - small letters only

import cc.robotdreams.automation.sub.Floor;

public class Main                               // CamelCase
{
    int intVariable = 0;                        // field / parameter name - camelCase from small letter
    public static void main(String[] args) {    // method name - camelCase from small letter
        System.out.println(ClassExample.changeableVariable);
        ClassExample.changeableVariable = "New value";
        System.out.println(ClassExample.changeableVariable);
        System.out.println(ClassExample.MY_CONSTANT);

        //ClassExample.finalPublicString;   //not accessible because this is private final var

        // try to print private final var in other way:
        ClassExample object = new ClassExample("Some name");
        System.out.println("Try to print private final var when assigning \"Some name\":");
        System.out.println(object.finalPublicString);
        System.out.println(object.getModifiedName());

        ClassExample object2 = new ClassExample("Some name2");
        System.out.println(object2.getModifiedName());

        // for sub classes
        System.out.println("Vars in sub-class Floor: ");
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);

        floor1.books.add("Java Tutorial");
        floor2.books.add("Pyton Tutorial");

        System.out.println(floor1.books);
        System.out.println(floor2.books);

    }
}