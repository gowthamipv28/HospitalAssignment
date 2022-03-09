package hospitalassignment;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
    private String name;
    private String location;

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

    public List<Patient> patientsWithinTheDateRange(Date fromDate, Date toDate) {
        List<Patient> allPatients = allPatients();

        return allPatients.stream().filter(patient -> patient.getVisitingInfo().getVisitDate().after(fromDate) &&
                patient.getVisitingInfo().getVisitDate().before(toDate)).collect(Collectors.toList());
    }

    private List<Patient> allPatients() {
        return new PatientData().createPatients();
    }
}
