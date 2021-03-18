package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		System.out.println("========== TEST 1 findById ============");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n========== TEST 2 findByDepartment ============");
		List<Department> list = depDao.findAll();
		for (Department obj	 : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n========== TEST 3 insert ============");
		Department obj = new Department(null, "Musics");
		depDao.insert(obj);
		System.out.println("Department insert completed");
		
		System.out.println("\n========== TEST 4 update ============");
		obj = depDao.findById(6);
		System.out.println("Before: " + obj);
		obj.setName("construction ");
		depDao.update(obj);
		System.out.println("Later : " + obj);
		

		System.out.println("\n========== TEST 5 deleteById ============");
		System.out.println("Enter Id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("delete completed");
		
		
	}

}
