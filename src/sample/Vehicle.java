package sample;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;

  public Vehicle() {
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleFrame = null;
    vehicleType = "Generic";
    driveTrain = "2WD: Two Wheel Drives";
    vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
                  String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
                  Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.driveTrain = driveTrain;
    this.vehicleType = vehicleType;
    this.vehicleEngine = vehicleEngine;
  }

  public String toString() {
    return "Manufacturer Name : " + vehicleManufacturer + "\n"
        + "Manufactured Date : " + vehicleManufacturedDate + "\n"
        + "Vehicle Make : " + vehicleMake + "\n"
        + "Vehicle Model : " + vehicleModel + "\n"
        + "Vehicle Type : " + vehicleType + "\n" + vehicleEngine;
  }

//  public static void main(String[] args) {
//    Vehicle vehicleOne = new Vehicle();
//    Vehicle vehicleTwo = new Vehicle(new Date(), "Honda", "Honda", "Prelude",null, null, "None",
//        new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1",
//            "88 AKI", 4, "2WS: Two-Wheel Drive"));
//    System.out.println(vehicleOne);
//    System.out.println();
//    System.out.println(vehicleTwo);
//  }

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String chassis) {

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
  public void setEngineType(String fuel) {

  }

  public Date getVehicleManufacturedDate() {
    return vehicleManufacturedDate;
  }

  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  public String getVehicleManufacturer() {
    return vehicleManufacturer;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public String getVehicleMake() {
    return vehicleMake;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public String getVehicleModel() {
    return vehicleModel;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public Chassis getVehicleFrame() {
    return vehicleFrame;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public Engine getVehicleEngine() {
    return new ManufacturedEngine();
  }

  public void setVehicleEngine(Engine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }
}
