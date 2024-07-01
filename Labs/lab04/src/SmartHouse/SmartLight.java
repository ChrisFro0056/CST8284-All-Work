package SmartHouse;

/**
 * This class is used to set the brightness and color of a smart light.
 * It also has a method to print the brightness and color.
 * This class extends SmartHouse.SmartDevice.
 */
// Class to determine brightness and color of light
public class SmartLight extends SmartDevice {

    /**
     * @param deviceName
     * This parameter is used to set the device name.
     * once inputted it will be set to the deviceName variable.
     * @param roomLocation
     * This parameter is used to set the room location.
     * once inputted it will be set to the roomLocation variable.
     * @param status
     * This parameter is used to set the status.
     * once inputted it will be set to the status variable.
     */
    // Constructor
    public SmartLight(String deviceName, String roomLocation, boolean status) {
        super(deviceName, roomLocation, status);
    }

    /**
     * @return brightness
     */
    public int getBrightness() {
        return brightness;
    }

    /**
     * @param brightness
     * This parameter is used to set the brightness.
     */
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     * This parameter is used to set the color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    private int brightness;
    private String color;

    // Method to print brightness and color
    public String toString() {
        System.out.println("Brightness: " + brightness);
        System.out.println("Color: " + color);
        return null;
    }
}
