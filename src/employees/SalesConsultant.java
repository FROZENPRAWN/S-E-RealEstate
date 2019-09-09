package employees;

import java.util.HashMap;

public class SalesConsultant extends employee {
    public SalesConsultant(String employeeID, String employStatus, double hourlyRate, double hours, HashMap<String, String> assignedPropertyList) {
        super(employeeID, employStatus, hourlyRate, hours, assignedPropertyList);


    }

    @Override
    double calculateSalary() {
        return getHourlyRate()*getHours();
    }

}
