package sample;

import java.util.Date;

public class ManufacturedEngine implements Engine {

  String engineManufacturer;
  Date engineManufacturedDate;
  String engineMake;
  String engineModel;
  int engineCylinders;
  String engineType;
  String driveTrain;

  public ManufacturedEngine() {
    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineType = "85 AKI";
    engineCylinders = 0;
    driveTrain = "2WD: Two Wheel Drives";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
                            String engineMake, String engineModel, int engineCylinders,
                            String engineType, String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  public String toString() {
    return "Engine Manufacturer  : " + engineManufacturer + "\n"
        + "Engine Manufactured  : " + engineManufacturedDate + "\n"
        + "Engine Make  : " + engineMake + "\n"
        + "Engine Model  : " + engineModel + "\n"
        + "Engine Type  : " + engineType + "\n"
        + "Engine Cylinders  : " + engineCylinders + "\n"
        + "Drive Train  : " + driveTrain;
  }

  public static void main(String[] args) {
    ManufacturedEngine engineOne = new ManufacturedEngine();
    ManufacturedEngine engineTwo = new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1",
        4, "88 AKI", "2WS: Two-Wheel Drive");
    System.out.println(engineOne);
    System.out.println();
    System.out.println(engineTwo);
  }

  public String getEngineManufacturer() {
    return engineManufacturer;
  }

  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  public String getEngineMake() {
    return engineMake;
  }

  public String getEngineModel() {
    return engineModel;
  }

  public int getEngineCylinders() {
    return engineCylinders;
  }

  public String getEngineType() {
    return engineType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }

}
