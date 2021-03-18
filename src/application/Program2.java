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
		
		System.out.println("\n========== TEST 2 findById ============");
		List<Department> list = depDao.findAll();
		for (Department obj	 : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n========== TEST 3 findById ============");
		Department obj = new Department(null, "Musics");
		depDao.insert(obj);
		System.out.println("Department insert completed");
		
		System.out.println("\n========== TEST 4 findById ============");
		obj = depDao.findById(6);
		System.out.println("Before: " + obj);
		obj.setName("construction ");
		depDao.update(obj);
		System.out.println("Later : " + obj);
		
	}

}
