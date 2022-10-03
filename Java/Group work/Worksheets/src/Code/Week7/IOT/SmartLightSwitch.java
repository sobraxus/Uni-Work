package Code.Week7.IOT;

public class SmartLightSwitch {
    private boolean status; //Used to get the status of the light (ON(I) OFF(O))
    private double location; //Used for the location 1.02 (Room 1, light 2)
    private int ID;
    public SmartLightSwitch(boolean status, double location, int ID) {
        this.status = status;
        this.location = location;
        this.ID = ID;
    } //Constructor to initialise the smartLightSwitch

    public boolean isStatus() {
        return status;
    }//Get method to get the current status

    public void setStatus(boolean status) { this.status = status; }//Set method to set a new status

    public void setOppositeStatus(){ setStatus(!isStatus()); }

    public double getLocation() {
        return location;
    }//Get method to get the current location

    public void setLocation(double location) {
        this.location = location;
    }//Set method to set a new location

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return  "| ID | " + " | LOCATION | " + "| STATUS | \r\n"+
          "    "+ID+"        "+ location+"         "+    status+"\n";



    }
}
