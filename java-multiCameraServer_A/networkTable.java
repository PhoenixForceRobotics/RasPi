//Author--Andrew Baruck

package networktabledesktopclient;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class networkTable{
    public static void main(String[] args){
        new networkTable().run();
    }

    public void run(){
        NetworkTableInstance inst = NetworkTableInstance.getDefault();
        NetworkTable table = inst.getTable("datatable");
        NetworkTableEntry areaEntry = table.getEntry ("area"); //This and the following five get variables and prep them to be sent to the network tables.
        NetworkTableEntry centerXEntry = table.getEntry ("centerX");
        NetworkTableEntry centerYEntry = table.getEntry ("centerY");
        NetworkTableEntry widthEntry = table.getEntry ("width");
        NetworkTableEntry heightEntry = table.getEntry ("height");
        NetworkTableEntry solidityEntry = table.getEntry ("solidity");
        inst.startClientTeam(TEAM); //this is where the code will get the team number
        //inst.startDSClient(); //this is reccomended for a DS (data server) computer
        while (true) {
            try{
                Thread.sleep(250);//repeats every 250 milliseconds
            } catch (InterruptedException ex) {
                System.out.println("Interrupted");//prints out the fact that the code has stopped working, where, nobody knows!
                return;
            }
            System.out.println("Area" + area);
            System.out.println("centerX" + centerX);
            System.out.println("CenterY" + centerY);
            System.out.println("width" + width);
            System.out.println("height" + height);
            System.out.printlnt("solidity" + solidity);
                //The above six line print the value out to the view window*IN THE IDE        


                
        }
    }
    }
