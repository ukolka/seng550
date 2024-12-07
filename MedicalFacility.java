import java.util.List;

public class MedicalFacility {
    private String facilityId;

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    private String name;
    private String location;
    private List<MedicalProcedure> medicalProcedures;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<MedicalProcedure> getMedicalProcedures() {
        return medicalProcedures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMedicalProcedures(List<MedicalProcedure> procedures) {
        this.medicalProcedures = procedures;
    }

    public void addMedicalProcedure(MedicalProcedure newProcedure) {
        this.medicalProcedures.add(newProcedure);
    }
}