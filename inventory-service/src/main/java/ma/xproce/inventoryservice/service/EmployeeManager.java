package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dtos.EmployeeDto;

public interface EmployeeManager {

    public EmployeeDto getEMployeeById(Long id);
    public EmployeeDto saveEmployee(EmployeeDto employeeDto);
}
