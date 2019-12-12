package sample;

public class InteriorFeature implements Feature {
  String interiorFeature;

  public InteriorFeature() {
    interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  @Override
  public String getFeature() {
    return interiorFeature;
  }

  @Override
  public void setFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String toString() {
    return "Interior [" + interiorFeature + "]";
  }

  public static void main(String[] args) {
    InteriorFeature featureOne = new InteriorFeature();
    InteriorFeature featureTwo = new InteriorFeature("Climate Control");
    System.out.println(featureOne);
    System.out.println();
    System.out.println(featureTwo);
  }
}
