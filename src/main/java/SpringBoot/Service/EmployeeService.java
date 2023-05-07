package SpringBoot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import SpringBoot.entity.Employee;
import SpringBoot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	 
	public Employee postDetails(Employee employee) {
		return employeeRepository.save(employee);
	}
	@Cacheable(value="emp") 
	public Optional<Employee> getDetails(int id) {
		return employeeRepository.findById(id);
	}

	public List<Employee> getAll(Employee employee) {
		return employeeRepository.findAll();
	}

	public void deleteDetails(int id) {
		employeeRepository.deleteById(id);
	}

}
