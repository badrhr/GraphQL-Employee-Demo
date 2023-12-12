package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dtos.EmployeeDto;
import ma.xproce.inventoryservice.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeyController {


    @Autowired
    private EmployeeManager employeeManager;
    //getEmployeeById(id: Float) : EmployeeDto

    @QueryMapping
    public EmployeeDto getEmployeeById( @Argument Long id){
        return employeeManager.getEMployeeById(id);
    }

    @MutationMapping
    public EmployeeDto saveEmployee( @Argument EmployeeDto employeeDto){
        return employeeManager.saveEmployee(employeeDto);
    }
}