package sample;

public class VehicleChassis implements Chassis {

  String chassisName;

  public VehicleChassis() {
    this.chassisName = chassis;
  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  @Override
  public Chassis getChassisType() {
    return new VehicleChassis();
  }

  @Override
  public void setChassisType(String chassis) {
  }

  @Override
  public String toString() {
    return "Chassis Name : " + chassisName;
  }

  public static void main(String[] args) {
    VehicleChassis vehicleChassisOne = new VehicleChassis();
    VehicleChassis vehicleChassisTwo = new VehicleChassis("Unibody");
    System.out.println(vehicleChassisOne);
    System.out.println();
    System.out.println(vehicleChassisTwo);
  }
}
