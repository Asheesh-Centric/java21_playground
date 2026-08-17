package day5_build;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmployeeRepo implements Repository<Employee> {
    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee save(Employee object) {
        employees.add(object);
        return object;
    }

    @Override
    public void saveAll(Collection<? extends Employee> collections) {
        employees.addAll(collections);
    }

    @Override
    public void copyTo(Collection<? super Employee> collection) {
        //employees.addAll(collection);
        collection.addAll(employees);
    }

    @Override
    public Employee findById(Employee obj) {
        return employees.stream().filter(employee -> employee.getId().equals(obj.getId())).findFirst().orElse(null);
    }
}
