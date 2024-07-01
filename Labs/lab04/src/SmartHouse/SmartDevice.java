package SmartHouse;

/**
 * This class is used to set the device name, room location, and status of a smart device.
 * It also has a method to print the device name, room location, and status.
 * This is the parent class for SmartHouse.SmartLight and SmartThermostat.
 */
// Class to determine device name, room location, and status
public class SmartDevice {

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName
     * This parameter is used to set the device name.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * @return roomLocation
     */
    public String getRoomLocation() {
        return roomLocation;
    }

    /**
     * @param roomLocation
     * This parameter is used to set the room location.
     */
    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }

    /**
     * @return status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status
     * This parameter is used to set the status.
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    private String deviceName;
    private String roomLocation;
    private boolean status;

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
    public SmartDevice(String deviceName, String roomLocation, boolean status) {
        this.deviceName = deviceName;
        this.roomLocation = roomLocation;
        this.status = status;
    }

    // Method to print device name, room location, and status
    public String toString() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Room Location: " + roomLocation);
        System.out.println("Status: " + status);
        return null;
    }
}