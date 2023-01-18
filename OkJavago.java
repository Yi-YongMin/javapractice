import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkJavago {
    public static void main(String[] args) {
        String id = "JAVA APT";

        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
        // 엘베 콜
        Security mySecurity = new Security(id);
        mySecurity.off();
        // 보안 끄기
        Lighting hallamp = new Lighting(id + "/ hall lamp");
        hallamp.on();
        Lighting floorlamp = new Lighting(id + "/ floor lamp");
        floorlamp.on();
    }
}
