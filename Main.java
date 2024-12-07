import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MedicalFacility facility1 = new MedicalFacility();
        facility1.setFacilityId("FAC123");
        facility1.setName("City Hospital");
        facility1.setLocation("123 Main St");

        List<MedicalProcedure> procedures = new ArrayList<>();
        procedures.add(new MedicalProcedure("X-Ray", 100.0));
        procedures.add(new MedicalProcedure("MRI", 500.0));
        procedures.add(new MedicalProcedure("Blood Test", 50.0));
        facility1.setMedicalProcedures(procedures);

        System.out.println("Facility ID: " + facility1.getFacilityId());
        System.out.println("Facility Name: " + facility1.getName());
        System.out.println("Facility Location: " + facility1.getLocation());

        MedicalProcedure newProcedure = new MedicalProcedure("CT Scan", 300.0);
        facility1.addMedicalProcedure(newProcedure);
        System.out.println("Added new procedure: " + newProcedure.getName() + " - " + newProcedure.getCost());

        procedures = facility1.getMedicalProcedures();
        System.out.println("Updated Medical Procedures:");
        for (MedicalProcedure procedure : procedures) {
            System.out.println(procedure.getName() + " - " + procedure.getCost());
        }

        MedicalFacility facility2 = new MedicalFacility();
        facility2.setFacilityId("FAC456");
        facility2.setName("County Hospital");
        facility2.setLocation("456 Elm St");

        List<MedicalProcedure> procedures2 = new ArrayList<>();
        procedures2.add(new MedicalProcedure("X-Ray", 120.0));
        procedures2.add(new MedicalProcedure("MRI", 480.0));
        procedures2.add(new MedicalProcedure("Blood Test", 55.0));
        facility2.setMedicalProcedures(procedures2);

        System.out.println("Facility ID: " + facility2.getFacilityId());
        System.out.println("Facility Name: " + facility2.getName());
        System.out.println("Facility Location: " + facility2.getLocation());

        procedures2 = facility2.getMedicalProcedures();
        System.out.println("Medical Procedures at " + facility2.getName() + ":");
        for (MedicalProcedure procedure : procedures2) {
            System.out.println(procedure.getName() + " - " + procedure.getCost());
        }

        // Compare prices of similar procedures
        System.out.println("Comparing prices of similar procedures:");
        for (MedicalProcedure procedure1 : facility1.getMedicalProcedures()) {
            for (MedicalProcedure procedure2 : facility2.getMedicalProcedures()) {
                if (procedure1.getName().equals(procedure2.getName())) {
                    System.out.println(procedure1.getName() + ": " + facility1.getName() + " - " + procedure1.getCost() + ", " + facility2.getName() + " - " + procedure2.getCost());
                }
            }
        }
    }
}