package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste 1: seller find by id ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Teste 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartment(dep);
		for(Seller s: sellers) {
			System.out.println(s);
		}
		
		System.out.println("\n=== Teste 3: seller findAll ===");
		sellers = sellerDao.findAll();
		for(Seller s: sellers) {
			System.out.println(s);
		}

	}

}
