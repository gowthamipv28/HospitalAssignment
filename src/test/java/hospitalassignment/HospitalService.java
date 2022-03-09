package hospitalassignment;

public class HospitalService {
    Hospital hospital = new Hospital();

    public HospitalService withName(String name){
        hospital.setName(name);
        return this;
    }


    public HospitalService withLocation(String location){
        hospital.setLocation(location);
        return this;
    }

    public Hospital build() {
        return hospital;
    }
}
