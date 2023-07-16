package cc.robotdreams.automation;

import java.util.ArrayList;
import java.util.List;

public class ClassExample
{
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // STATIC - Class level / context
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static public String changeableVariable = "Temporary Value";
    static final public String MY_CONSTANT = "Constant Value";
    static final protected  String MY_PROTECTED_CONST = "Protected Constant Value";

    static final private String STATIC_PRIVATE_CONST;

    // Static initializer block
    static {
        STATIC_PRIVATE_CONST = "Set config value";

        System.out.println("Static Initializer Block");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // OBJECT - variable level / context
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String publicStringNotDefined; // = null

    protected String protectedStringNotDefined; // = null

    String defaultLevelString = "Visible on package level";

    private String privateString;

    //          // 0                // 0                 // 10
    private int ordersCounter, processedOrderCounter, pendingOrdersCounter = 0;
    // Not initialized default values for types:
    // int, float, double, char, short = 0
    // boolean = false
    // Objects like String, Integer and etc. = null

    final public String finalPublicString = "Final string that we can't change";
    final private List<String> finalPrivateList = new ArrayList<>();

    final private String name;

    {
        System.out.println("Object Initialization block");
    }
    // constructor
    public  ClassExample(String name) {
        this.name = name;
        System.out.println("Objecy Constructor block");
    }
    // below how to return private variable <final private String name;>:
    public String getModifiedName() {
        String localVariable = name;
        localVariable += " + added text";
        return localVariable;
    }


}
