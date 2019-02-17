
package netowrktablesdesktopclient;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class netowrkTableWriter {

    NetworkTable table;

    public void robotInit(){
        table = NetworkTable.getTable("datatable");//clarifies what table it is written to
    }
    public void VisionThread(){//what does this do?

    }

    public void operatorCOntrol() {//each of the following should write to the network tables
        double area = String (area);//(area) is the variable, area being the area of the thing that it detects
        double centerX = string (centerX);//as above applies to every line but for the variable that it has
        double centerY = string (centerY);
        double width = string (width);
        double height = string (height);
        double solidity = string (solidity);

    }
    }
}
// this is a code that is not complete, it is written based on an example as that can be found on 
//https://wpilib.screenstepslive.com/s/3120/m/7912/l/80205-writing-a-simple-networktables-program-in-c-and-java-with-a-java-client-pc-side