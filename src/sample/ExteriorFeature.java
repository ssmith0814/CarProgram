package sample;

public class ExteriorFeature implements Feature {

  String exteriorFeature;

  public ExteriorFeature() {
    exteriorFeature = "Generic";
  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  public String toString() {
    return "Exterior [" + exteriorFeature + "]";
  }

  public static void main(String[] args) {
    ExteriorFeature featureOne = new ExteriorFeature();
    ExteriorFeature featureTwo = new ExteriorFeature("Fog Lamps");
    System.out.println(featureOne);
    System.out.println();
    System.out.println(featureTwo);
  }

  @Override
  public String getFeature() {
    return exteriorFeature;
  }

  @Override
  public void setFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }
}
