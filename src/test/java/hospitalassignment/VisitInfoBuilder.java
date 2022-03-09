package hospitalassignment;
import java.util.Date;

public class VisitInfoBuilder {
    Visit visit = new Visit();

    public VisitInfoBuilder withDate(Date date) {
        visit.setVisitDate(date);
        return this;
    }

    public VisitInfoBuilder withDoctorName(String name) {
        visit.setVisitingDoctorName(name);
        return this;
    }

    public Visit build() {
        return visit;
    }
}
