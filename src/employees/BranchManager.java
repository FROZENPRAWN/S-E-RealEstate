package employees;

public class BranchManager {
  public BranchManager(String employeeID, String employStatus, double hourlyRate, double hours, HashMap<Integer, String> assignedPropertyList) {
        super ( employeeID, employStatus, hourlyRate, hours, assignedPropertyList );
    }

    @Override
    double calculateSalary() {
        return getHourlyRate () * getHours ();
    }
    public void assignEmployee(SalesConsultant sc){
        this.getAssignedPropertyList.put(sc.getEmployeeID(), propertyInformation);
    }
  
}
