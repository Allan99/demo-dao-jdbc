package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Teste 1: Department findById ====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== Teste 2: Department findAll ====");
		List<Department> departments = new ArrayList<>();
		departments = departmentDao.findAll();
		for(Department d: departments) {
			System.out.println(d);
		}
	}

}
