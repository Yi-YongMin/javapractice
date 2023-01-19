
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavagoinput {
    public static void main(String[] args) {
        String id = args[0];// JOptionPane.showInputDialog("Enter a ID");
        String bright = args[1];// JOptionPane.showInputDialog("Enter a Bright Level");

        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        Security mySecurity = new Security(id);
        mySecurity.off();

        Lighting hallamp = new Lighting(id + "/ hall lamp");
        hallamp.on();
        Lighting floorlamp = new Lighting(id + "/ floor lamp");
        floorlamp.on();
        DimmingLights moodlamp = new DimmingLights(id + " moodlamp");
        moodlamp.setBright(Double.parseDouble(bright));
        moodlamp.on();
    }
}
