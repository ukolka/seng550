
import java.util.List;

public class MedicalBill {
    private String billId;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    private List<MedicalProcedure> procedures;

    public List<MedicalProcedure> getProcedures() {
        return procedures;
    }
}