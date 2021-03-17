package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		System.out.println("========== TEST 1 findById ============");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n========== TEST 1 findById ============");
		List<Department> list = depDao.findAll();
		for (Department obj	 : list) {
			System.out.println(obj);
		}
		
	}

}
