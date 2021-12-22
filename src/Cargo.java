public class Cargo {

    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final Boolean canBeFlipped;
    private final String regNumber;
    private final Boolean fragile;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress, Boolean canBeFlipped, String regNumber, Boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canBeFlipped = canBeFlipped;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeFlipped, regNumber, fragile);
    }

    public double getWeight() {
        return weight;
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeFlipped, regNumber, fragile);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeFlipped, regNumber, fragile);
    }

    public Boolean getCanBeFlipped() {
        return canBeFlipped;
    }

    public Cargo setCanBeFlipped(Boolean canBeFlipped) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeFlipped, regNumber, fragile);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Cargo setRegNumber(String regNumber) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeFlipped, regNumber, fragile);
    }

    public Boolean getFragile() {
        return fragile;
    }

    public Cargo setFragile(Boolean fragile) {
        return new Cargo(dimensions, weight, deliveryAddress, canBeFlipped, regNumber, fragile);
    }
}
