package networktablesdesktopclient;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class NetworkTablesDesktopClient {
  public static void main(String[] args) {
    new NetworkTablesDesktopClient().run();
  }

  public void run() {
    NetworkTableInstance inst = NetworkTableInstance.getDefault();
    NetworkTable table = inst.getTable("VisionThread");
    NetworkTableEntry area = table.getEntry("area");
    NetworkTableEntry centerX = table.getEntry("centerX");
    NetworkTableEntry centerY = table.getEntry("centerY");
    NetworkTableEntry width = table.getEntry("width");
    NetworkTableEntry height = table.getEntry("height");
    NetworkTableEntry solidity = table.getEntry("solidity");
    inst.startClientTeam(TEAM);  // where TEAM=190, 294, etc, or use inst.startClient("hostname") or similar
    inst.startDSClient();  // recommended if running on DS computer; this gets the robot IP from the DS
    while (true) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        System.out.println("interrupted");
        return;
      }
      double area;
      area = .getDouble(0.0);
      double centerX = centerX.getDouble(0.0);
      System.out.println("X: " + x + " Y: " + y);
    }
  }
}