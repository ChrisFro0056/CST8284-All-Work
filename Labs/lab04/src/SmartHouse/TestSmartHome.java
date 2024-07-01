package SmartHouse;

/**
 * This class is used to test the SmartHouse.SmartLight and SmartThermostat classes.
 * It creates a SmartHouse.SmartLight object and a SmartThermostat object.
 * It sets the brightness and color of the SmartHouse.SmartLight object.
 * It sets the current temperature and desired temperature of the SmartThermostat object.
 * It prints the SmartHouse.SmartLight object and the SmartThermostat object.
 */
public class TestSmartHome {
    /**
     * @param args
     * the command line arguments
     * This method creates a SmartHouse.SmartLight object and a SmartThermostat object.
     */
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Light", "Living Room", true);
        light.setBrightness(9);
        light.setColor("White");
        light.toString();

        SmartThermostat thermostat = new SmartThermostat("Thermostat", "Living Room", true, 70, 72);
        thermostat.toString();
    }
}
