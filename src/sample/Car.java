package sample;

import java.util.Date;

public final class Car extends Vehicle {
  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    Feature[] feature = {
        new InteriorFeature("No Interior Features"), new ExteriorFeature("No Exterior Features")};
    this.feature = feature;
    this.carAxle = 2;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
             String vehicleModel, Chassis vehicleFrame, String vehicleType,
             String driveTrain, Engine vehicleEngine,
             Feature[] feature, int carAxle) {

    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() {

    StringBuilder features = new StringBuilder();
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof ExteriorFeature) {
        if (features.length() == 0) {
          features.append(this.feature[i]);
        } else {
          features.append("\n").append(this.feature[i]);
        }
      }
    }
    return features.toString();
  }

  public String getInteriorFeatures() {

    StringBuilder features = new StringBuilder();
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        if (features.length() == 0) {
          features.append(this.feature[i]);
        } else {
          features.append("\n").append(this.feature[i]);
        }
      }
    }
    return features.toString();
  }

  public String toString() {

    StringBuilder features = new StringBuilder();

    for (int i = 0; i < this.feature.length; i++) {
      if (features.length() == 0) {
        features.append(this.feature[i]);
      } else {
        features.append("\n").append(this.feature[i]);
      }
    }

    return super.toString() + "\n" + "Features : " + "\n" + features + "\n" + "Car Axle : "
        + carAxle;
  }

//  public static void main(String[] args) {
//    Car carOne = new Car();
//    System.out.println(carOne);
//    System.out.println();
//    Feature[] feat = {new InteriorFeature("AM/FM Radio"), new ExteriorFeature("Wood Panels"),
//        new InteriorFeature("Air Conditioning"), new ExteriorFeature("Moonroof")};
//    Car carTwo =
//        new Car(new Date(),"Honda", "Honda", "Prelude",
//            new VehicleChassis("Unibody"),"Coupe", null,
//            new ManufacturedEngine("Honda", new Date(), "H-Series",
//                "H23A1", "2WD: Two-Wheel Drive", 4,
//                "88 AKI"), feat, 2);
//    System.out.println(carTwo);
//    System.out.println(carTwo.getExteriorFeatures());
//    System.out.println();
//    System.out.println("Exterior Features : " + carTwo.getExteriorFeatures());
//    System.out.println("Interior Features : " + carTwo.getInteriorFeatures());
//  }
}