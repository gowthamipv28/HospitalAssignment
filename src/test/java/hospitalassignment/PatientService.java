package hospitalassignment;

import org.assertj.core.internal.bytebuddy.utility.JavaConstant;

public class PatientService {
    Patient patient = new Patient();

    public Patient build() {
        return patient;
    }

    public PatientService withName(String name) {
        patient.setName(name);
        return this;
    }

    public PatientService withLocation(String location) {
        patient.setLocation(location);
        return this;
    }


    public PatientService withVisitingInfo(Visit visitingInfo) {
        patient.setVisitingInfo(visitingInfo);
        return this;
    }
}
