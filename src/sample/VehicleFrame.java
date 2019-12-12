package sample;

public class VehicleFrame implements Chassis {

  String vehicleFrameType;

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return new VehicleChassis();
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString() {
    return "Chassis : " + chassis + "\n" + "Vehicle Frame : " + vehicleFrameType;
  }

  public static void main(String[] args) {
    VehicleFrame vehicleFrameOne = new VehicleFrame();
    VehicleFrame vehicleFrameTwo = new VehicleFrame("Ladder Frame");
    System.out.println(vehicleFrameOne);
    System.out.println();
    System.out.println(vehicleFrameTwo);
  }

}
