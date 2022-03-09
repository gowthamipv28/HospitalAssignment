package hospitalassignment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class PatientData {
    public List<Patient> createPatients() {

        List<Patient> allPatients = new ArrayList();
        Visit visitInfo1 = new VisitInfoBuilder().withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 11).getTime())
                .withDoctorName("Gowthami")
                .build();
        Visit visitInfo2 = new VisitInfoBuilder().withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 12).getTime())
                .withDoctorName("Saranya")
                .build();
        Visit visitInfo3 = new VisitInfoBuilder().withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 13).getTime())
                .withDoctorName("Nandhini")
                .build();
        Visit visitInfo4 = new VisitInfoBuilder().withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 14).getTime())
                .withDoctorName("Selva")
                .build();

        allPatients.add(new PatientService().withName("abc").withLocation("Bangalore")
                .withVisitingInfo(visitInfo1).build());
        allPatients.add(new PatientService().withName("xyz").withLocation("Kolar")
                .withVisitingInfo(visitInfo2).build());
        allPatients.add(new PatientService().withName("qwe").withLocation("KGF")
                .withVisitingInfo(visitInfo3).build());
        allPatients.add(new PatientService().withName("qwe").withLocation("Bangarpet")
                .withVisitingInfo(visitInfo4).build());


        return allPatients;
    }
}
