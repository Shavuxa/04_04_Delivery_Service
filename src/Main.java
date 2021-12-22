public class Main {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(1,2,3);
        Dimensions copyDimensions = new Dimensions(dimensions.getWidth(), dimensions.getHeight(), dimensions.getLength());
        copyDimensions = copyDimensions.setLength(2);
        copyDimensions = copyDimensions.setWidth(2);
        System.out.println(dimensions.calculatCargoVolume());
        System.out.println(copyDimensions.calculatCargoVolume());

        Cargo cargo = new Cargo(dimensions, 2, "ул. Спортивная, д. 2", false, "AV12D5", true);
        System.out.println("Объем: " + cargo.getDimensions().calculatCargoVolume() + " м3, вес: " + cargo.getWeight() + " кг, адрес: "
                + cargo.getDeliveryAddress() + ", можно переворачивать: " + cargo.getCanBeFlipped() + ", рег.номер: "
                + cargo.getRegNumber() + ", хрупкий: " + cargo.getFragile());

        cargo = cargo.setDeliveryAddress("ул. Ленина, д. 3");
        cargo = cargo.setWeight(5);
        cargo = cargo.setDimensions(copyDimensions);
        System.out.println("Объем: " + cargo.getDimensions().calculatCargoVolume() + " м3, вес: " + cargo.getWeight() + " кг, адрес: "
                + cargo.getDeliveryAddress() + ", можно переворачивать: " + cargo.getCanBeFlipped() + ", рег.номер: "
                + cargo.getRegNumber() + ", хрупкий: " + cargo.getFragile());
    }
}
