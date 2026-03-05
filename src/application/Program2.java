package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Teste 1: department dao insert ===");
		Department dep = new Department(null, "accounting");
		departmentDao.insert(dep);
		System.out.println("Data inserted successfuly!");
		
		System.out.println("==== Teste 1: department dao insert ===");
		Department newDep = new Department(6, "engineering");
		departmentDao.update(newDep);
		System.out.println("Updated successfully!");
	}

}
