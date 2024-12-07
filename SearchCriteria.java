
public class SearchCriteria {
    private String location;

    public String getLocation() {
        return location;
    }
    private String procedureName;
    
    public String getProcedureName() {
        return procedureName;
    }

    private String insuranceProvider;

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setCriteria(String location, String procedureName, String insuranceProvider) {
        this.location = location;
        this.procedureName = procedureName;
        this.insuranceProvider = insuranceProvider;
    }
}