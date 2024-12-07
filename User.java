
import java.util.List;

public class User {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
        System.out.println("User ID: " + getUserId());
    }
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void submitBill(MedicalBill bill) {
        // Simulate submitting a medical bill
    }

    public List<MedicalProcedure> searchMedicalPrices(SearchCriteria criteria) {
        // Simulate searching for medical procedures based on criteria
        return null;
    }

    public void comparePrices(List<MedicalProcedure> prices) {
        // Simulate comparing prices
    }

    public float makeCostPrediction(MedicalProcedure service, float cost) {
        // Simulate making a cost prediction
        return 0.0f;
    }
}