package hospitalassignment;
import java.util.Date;
public class Visit {
    private Date visitDate;
    private String visitingDoctorName;

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitingDoctorName() {
        return visitingDoctorName;
    }

    public void setVisitingDoctorName(String visitingDoctorName) {
        this.visitingDoctorName = visitingDoctorName;
    }
}
