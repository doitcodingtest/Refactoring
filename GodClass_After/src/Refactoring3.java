public class Refactoring3 {
    public static void main(String[] args) {
        DisplaySpec displaySpec = new DisplaySpec("173mm","3088 x 1440 (Quad HD+)","Dynamic AMOLED 2X","120Hz", "16M");
        BatterySpec batterySpec = new BatterySpec(5000,25, 25,26,false);
        CellphoneSpec cellphoneSpec = new CellphoneSpec(displaySpec, batterySpec);
        Cellphone cellphone = new Cellphone("갤럭시","파란색",175,cellphoneSpec);
        System.out.println(cellphone.toString());
    }
}

class Cellphone{
    String name;
    String color;
    int price;
    CellphoneSpec cellphoneSpec;

    public Cellphone(String name, String color, int price, CellphoneSpec cellphoneSpec) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.cellphoneSpec = cellphoneSpec;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", cellphoneSpec=" + cellphoneSpec.toString() +
                '}';
    }
}

class CellphoneSpec{
    DisplaySpec displaySpec;
    BatterySpec batterySpec;

    public CellphoneSpec(DisplaySpec displaySpec, BatterySpec batterySpec) {
        this.displaySpec = displaySpec;
        this.batterySpec = batterySpec;
    }

    @Override
    public String toString() {
        return "CellphoneSpec{" +
                "displaySpec=" + displaySpec.toString() +
                ", batterySpec=" + batterySpec.toString() +
                '}';
    }
}

class DisplaySpec{
    String displaySize;
    String  resolution;
    String displayType;
    String maxRefreshRate;
    String colorDepth;

    public DisplaySpec(String displaySize, String resolution, String displayType, String maxRefreshRate, String colorDepth) {
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.displayType = displayType;
        this.maxRefreshRate = maxRefreshRate;
        this.colorDepth = colorDepth;
    }

    @Override
    public String toString() {
        return "DisplaySpec{" +
                "displaySize='" + displaySize + '\'' +
                ", resolution='" + resolution + '\'' +
                ", displayType='" + displayType + '\'' +
                ", maxRefreshRate='" + maxRefreshRate + '\'' +
                ", colorDepth='" + colorDepth + '\'' +
                '}';
    }
}

class BatterySpec{
    int batteryCapacity;
    int internetUsageTime;
    int videoPlaybackTime;
    int audioPlaybackTime;
    boolean isReplaceable;

    public BatterySpec(int batteryCapacity, int internetUsageTime, int videoPlaybackTime, int audioPlaybackTime, boolean isReplaceable) {
        this.batteryCapacity = batteryCapacity;
        this.internetUsageTime = internetUsageTime;
        this.videoPlaybackTime = videoPlaybackTime;
        this.audioPlaybackTime = audioPlaybackTime;
        this.isReplaceable = isReplaceable;
    }

    @Override
    public String toString() {
        return "BatterySpec{" +
                "batteryCapacity=" + batteryCapacity +
                ", internetUsageTime=" + internetUsageTime +
                ", videoPlaybackTime=" + videoPlaybackTime +
                ", audioPlaybackTime=" + audioPlaybackTime +
                ", isReplaceable=" + isReplaceable +
                '}';
    }
}
