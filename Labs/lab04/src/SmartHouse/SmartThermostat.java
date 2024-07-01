package SmartHouse;

// Interface to implement current temperature
interface currentTemperature {
    public int getTemperature();
    public void setTemperature(int temperature);
}

// Interface to implement desired temperature
interface desiredTemperature {
    public int getTemperature();
    public void setTemperature(int temperature);
}


/**
 * This class is used to set the current temperature and desired temperature of a smart thermostat.
 * It also has a method to print the current temperature and desired temperature.
 * This class extends SmartHouse.SmartDevice and implements currentTemperature and desiredTemperature.
 * currentTemperature and desiredTemperature are interfaces.
 */
public class SmartThermostat extends SmartDevice implements currentTemperature, desiredTemperature {

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
     * @param currentTemperature
     * This parameter is used to set the current temperature.
     * once inputted it will be set to the currentTemperature variable.
     * @param desiredTemperature
     * This parameter is used to set the desired temperature.
     * once inputted it will be set to the desiredTemperature variable.
     */
    // Constructor
    public SmartThermostat(String deviceName, String roomLocation, boolean status, int currentTemperature, int desiredTemperature) {
        super(deviceName, roomLocation, status);
        this.currentTemperature = currentTemperature;
        this.desiredTemperature = desiredTemperature;
    }

    private int currentTemperature;
    private int desiredTemperature;

    /**
     * @return currentTemperature
     */
    public int getCurrentTemperature() {
        return currentTemperature;
    }

    /**
     * @param currentTemperature
     * This parameter is used to set the current temperature.
     */
    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    /**
     * @return desiredTemperature
     */
    public int getDesiredTemperature() {
        return desiredTemperature;
    }

    /**
     * @param desiredTemperature
     * This parameter is used to set the desired temperature.
     */
    public void setDesiredTemperature(int desiredTemperature) {
        this.desiredTemperature = desiredTemperature;
    }

    // Method to print current temperature and desired temperature
    public String toString() {
        System.out.println("Current Temperature: " + currentTemperature);
        System.out.println("Desired Temperature: " + desiredTemperature);
        return null;
    }


    /**
     * @return 0
     * This method returns 0.
     */
    // Method to get current temperature
    @Override
    public int getTemperature() {
        return 0;
    }

    /**
     * @param temperature
     * This parameter is used to set the desired temperature.
     * once inputted it will be set to the temperature variable.
     */
    // Method to set desired temperature
    @Override
    public void setTemperature(int temperature) {

    }
}
