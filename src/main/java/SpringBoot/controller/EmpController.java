package SpringBoot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.Service.EmployeeService;
import SpringBoot.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/post")
	public Employee postDetails(@RequestBody Employee employee){
		return employeeService.postDetails(employee);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getDetails(@PathVariable int id){
		return employeeService.getDetails(id);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll(Employee employee){
		return employeeService.getAll(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDetails(@PathVariable int id){
		employeeService.deleteDetails(id);
	}
}
																								
