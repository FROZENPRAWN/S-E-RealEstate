package employees;

import java.util.HashMap;
public abstract class  employee {
    private String employeeID;
    private String employStatus;
    private double hourlyRate;
    private double hours;
    HashMap<String,String> assignedPropertyList;

    public employee(String employeeID, String employStatus, double hourlyRate, double hours, HashMap<String, String> assignedPropertyList)
    {   this.employeeID = employeeID;
        this.employStatus = employStatus;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        this.assignedPropertyList = assignedPropertyList;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployStatus() {
        return employStatus;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public HashMap<String, String> getAssignedPropertyList() {
        return assignedPropertyList;
    }

    abstract double calculateSalary();
}


