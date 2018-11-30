package com.osb.jax.ws.services.interfaces;

import com.osb.jax.ws.services.types.Employee;
import java.util.*;
import javax.jws.*;

@WebService(
        serviceName = "EmployeeService", 
        targetNamespace = "http://localhost:8080/jax-ws-server/services/v1/EmployeeService")
public class EmployeeServiceImpl {

    private static final List<Employee> EMPLOYEES = new ArrayList<>();

    @WebMethod
    @WebResult(name = "employee")
    public List<Employee> getEmployeeList() {
        return EMPLOYEES;
    }

    @WebMethod
    public boolean createEmployee(@WebParam(name = "employee") Employee employee) {
        EMPLOYEES.add(employee);
        return true;
    }
}
