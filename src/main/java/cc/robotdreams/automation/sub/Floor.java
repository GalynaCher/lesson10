package cc.robotdreams.automation.sub;

import java.util.ArrayList;
import java.util.List;

public class Floor   // SubClass
{
    protected String protectedField = "Protected value";

    final public int floorNum;
    final public List<String> books = new ArrayList<>();

    public Floor(int floorNum) {            // constructor
        this.floorNum = floorNum;
    }


}
