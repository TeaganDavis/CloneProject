public class Data {
    private final double amount;
    private final String unit;
    private final int speed;


    //    Constructor
    Data(double amountIn, String unitIn, int speedIn) {
        this.amount = amountIn;
        this.unit = unitIn;
        this.speed = speedIn;
    }


    //    Class methods
    public double convertToMegabytes() {
        double toMegabytes;
        switch (unit) {
            case "bytes" -> toMegabytes = (amount / 1024) / 1024;
            case "kilobytes" -> toMegabytes = amount / 1024;
            case "megabytes" -> toMegabytes = amount;
            case "gigabytes" -> toMegabytes = (1024 * amount);
            default -> throw new IllegalArgumentException();
        }
        return toMegabytes;
    }

    public double calculateDownloadTime() {
        return convertToMegabytes() / (speed / 8.0);
    }

    public String getFormattedDownloadTime() {
        long downloadMinutes, remainingSeconds;

        downloadMinutes = (long) Math.floor(calculateDownloadTime() / 60);
        remainingSeconds = Math.round(calculateDownloadTime() % 60);

        return downloadMinutes + " minutes " + remainingSeconds + " seconds";
    }


    //    toString using Class methods
    @Override
    public String toString() {
        return "Data: " + amount + " " + unit +
                "\nDownload Time: " + getFormattedDownloadTime();
    }
}