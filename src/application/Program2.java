package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("==== Teste 1: department insert ===");
		Department dep = new Department(null, "accounting");
		departmentDao.insert(dep);
		System.out.println("Data inserted successfuly!");

		System.out.println("==== Teste 2: department update ===");
		Department newDep = new Department(6, "engineering");
		departmentDao.update(newDep);
		System.out.println("Updated successfully!");

		System.out.println("==== Teste 4: department findAll ===");
		List<Department> departments = departmentDao.findAll();
		for (Department department : departments) {
			System.out.println(department);
		}

		System.out.println("==== Teste 4: department findById ===");
		int id = 3;
		Department department = departmentDao.findById(id);
		System.out.println(department);
	}

}
