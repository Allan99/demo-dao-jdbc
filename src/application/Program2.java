package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Teste 1: Department findById ====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== Teste 2: Department findAll ====");
		List<Department> departments = new ArrayList<>();
		departments = departmentDao.findAll();
		for(Department d: departments) {
			System.out.println(d);
		}
		
		System.out.println("\n=== Teste 4: Department insert ====");
		dep = new Department(null, "Human Resources");
		departmentDao.insert(dep);
		System.out.println("New department inserted: " + dep.getId());
		
		System.out.println("\n=== Teste 5: Department update ====");
		dep = departmentDao.findById(6);
		dep.setName("Accounting and finance");
		departmentDao.update(dep);
		System.out.println("Update completed!");
	}

}
