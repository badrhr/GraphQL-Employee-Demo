package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Employee;
import ma.xproce.inventoryservice.dao.repositories.EmployeeRepository;
import ma.xproce.inventoryservice.dtos.EmployeeDto;
import ma.xproce.inventoryservice.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManagerImplementation implements EmployeeManager {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto getEMployeeById(Long id) {
        return employeeMapper.fromEMployeeToEMployeeDto(employeeRepository.findById(id).get());
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        return employeeMapper.fromEMployeeToEMployeeDto(employeeRepository.save(
                employeeMapper.fromEMployeeDtoToEMployee(employeeDto)));
    }
}
