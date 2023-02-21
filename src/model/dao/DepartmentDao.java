package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department dp);
	void update(Department dp);
	void deleteById(Integer id);
	void findById(Integer id);
	List<Department> findAll();
}
