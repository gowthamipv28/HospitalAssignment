package hospitalassignment;
import java.util.Date;
public class Patient {
    private String name;
    private String location;

    public Visit getVisitingInfo() {
        return visitingInfo;
    }

    public void setVisitingInfo(Visit visitingInfo) {
        this.visitingInfo = visitingInfo;
    }

    private Visit visitingInfo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
