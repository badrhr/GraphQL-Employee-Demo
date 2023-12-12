package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Employee;
import ma.xproce.inventoryservice.dtos.EmployeeDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public EmployeeDto fromEMployeeToEMployeeDto(Employee employee){
       return  modelMapper.map(employee, EmployeeDto.class );
    }

    public Employee fromEMployeeDtoToEMployee(EmployeeDto employeeDto){
        return  modelMapper.map(employeeDto, Employee.class );
    }
}
