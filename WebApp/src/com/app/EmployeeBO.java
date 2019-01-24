package com.app;

import com.db.EmployeeDBO;
import com.model.EmployeeEntity;

import java.util.List;

public class EmployeeBO {
    
    public List<EmployeeEntity> getEmployees() {
        EmployeeDBO edbo = new EmployeeDBO();
        
        return edbo.getEmployees();
    }
}
