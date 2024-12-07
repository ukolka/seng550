
public class MedicalProcedure {
    private String procedureId;

    public MedicalProcedure(String string, double d) {
        this.name = string;
        this.cost = (float) d;
    }

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
    }
    private String name;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private float cost;

    public float getPricing() {
        // Simulate getting pricing
        return cost;
    }

    public float getPredictedCost() {
        // Simulate getting predicted cost
        return cost * 1.1f; // Example prediction logic
    }

    public String getCost() {
        return "Cost: " + cost;
    }
}