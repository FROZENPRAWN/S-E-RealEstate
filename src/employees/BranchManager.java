package employees;

public class BranchManager extends employee {

    public BranchManager(String employeeID, String employStatus, double hourlyRate, double hours, HashMap<String, String> assignedPropertyList) {
        super ( employeeID, employStatus, hourlyRate, hours, assignedPropertyList );
    }

    @Override
    double calculateSalary() {
        return getHourlyRate () * getHours ();
    }
    public void assignEmployee(SalesConsultant sc){
        this.getAssignedPropertyList().put(sc.getEmployeeID(), "Aura 6 leicester st");
    }

}
