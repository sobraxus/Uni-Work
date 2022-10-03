package Code.Week7.IOT;

public class SmartBuilding {
    private SmartLightSwitch[] smartLights; //Creates a new boolean array
    private int currentIndex; //Creates variable currentIndex
    private String message;

    public SmartBuilding(int size) {
        smartLights = new SmartLightSwitch[size]; //Gives smartLights
        currentIndex = 0; //Gives currentIndex value 0
        message = "";
    }

    public String getMsg() {
        return message;
    }

    public int size() {
        return smartLights.length; //Gives size the value of the length of the array
    }

    public boolean isLocationUnique(double location) {
        for (int i = 0; i < currentIndex; i++) {
            if (smartLights[i].getLocation() == location) {
                return false;
            }
        }
        return true;
    }

    public boolean append(double location, boolean status, int ID) {
        if (currentIndex >= size()) {
            return false;
        } //If the Index is greater or equal returns value


        if (!isLocationUnique(location)) {
            message = "Location is already taken";
            return false;
        }

        SmartLightSwitch light = new SmartLightSwitch(status, location, ID); //Sets the value of the array to equal boolean value
        //Question: Why is status and location switched?

        smartLights[currentIndex] = light;
        currentIndex++; //Adds 1 to the Index Value
        return true;
    }


//    private String booleanString(int value) {
//        if (value == 1) {
//            return "on";
//        }
//        return "off"; //Returns either on or off
//    }

    public String display() {
        String IO = " "; //Sets the value of IO as a blank string
        for (SmartLightSwitch light : smartLights) {
            IO += light.toString() + " ";
        }
        return IO;
    }
    //MENU OPTIONS

    //BEGINNING CHANGING STATUS OF LIGHT SWITCHES
    public void updateStatus(double lightID, boolean newStatus) {
        for (SmartLightSwitch light : smartLights) {
            if (light.getID() == lightID) {
                light.setStatus(newStatus);
            }
        }
    }
    //END CHANGING STATUS OF LIGHT SWITCHES

    //BEGINNING CHANGING LOCATION OF LIGHT SWITCHES
    public void updateLocation(int lightID, double newLocation) {
        for (SmartLightSwitch light : smartLights) {
            if (light.getID() == lightID) {
                light.setLocation(newLocation);
            }
        }
    }
    //END CHANGING LOCATION OF LIGHT SWITCHES

    //BEGINNING CHANGING STATUS OF ALL LIGHT SWITCHES
    public void changeLightStatus() {
        for (SmartLightSwitch light : smartLights) {
            light.isStatus();
            light.setOppositeStatus();
        }
    }

    public void listLocations() {
        for (SmartLightSwitch light : smartLights) {
            System.out.println("ID " + light.getID() + ": " + light.getLocation());
        }
    }

    public void sort() {
        boolean sorted = false;
        int[] smartLights = new int[] {};
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < smartLights.length - 1; i++) {
                if (smartLights[i] > smartLights[i + 1]) {
                    temp = smartLights[i];
                    smartLights[i] = smartLights[i + 1];
                    smartLights[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}




