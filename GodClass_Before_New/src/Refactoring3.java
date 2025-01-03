public class Refactoring3 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone("갤럭시","파란색",175,"173mm","3088 x 1440 (Quad HD+)"
                ,"Dynamic AMOLED 2X","120Hz", "16M",5000,25,
                25,26,false);
        System.out.println(cellphone.toString());
    }
}

class Cellphone{
    String name;
    String color;
    int price;
    // 디스플레이 관련 변수
    String displaySize;
    String  resolution;
    String displayType;
    String maxRefreshRate;
    String colorDepth;
    // 배터리 관련 변수
    int batteryCapacity;
    int internetUsageTime;
    int videoPlaybackTime;
    int audioPlaybackTime;
    boolean isReplaceable;

    public Cellphone(String name, String color, int price, String displaySize, String resolution, String displayType, String maxRefreshRate, String colorDepth, int batteryCapacity, int internetUsageTime, int videoPlaybackTime, int audioPlaybackTime, boolean isReplaceable) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.displayType = displayType;
        this.maxRefreshRate = maxRefreshRate;
        this.colorDepth = colorDepth;
        this.batteryCapacity = batteryCapacity;
        this.internetUsageTime = internetUsageTime;
        this.videoPlaybackTime = videoPlaybackTime;
        this.audioPlaybackTime = audioPlaybackTime;
        this.isReplaceable = isReplaceable;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", displaySize='" + displaySize + '\'' +
                ", resolution='" + resolution + '\'' +
                ", displayType='" + displayType + '\'' +
                ", maxRefreshRate='" + maxRefreshRate + '\'' +
                ", colorDepth='" + colorDepth + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", internetUsageTime=" + internetUsageTime +
                ", videoPlaybackTime=" + videoPlaybackTime +
                ", audioPlaybackTime=" + audioPlaybackTime +
                ", isReplaceable=" + isReplaceable +
                '}';
    }
}
