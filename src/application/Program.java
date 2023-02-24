package application;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Teste 1: Seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Teste 2: Seller findById ====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 3: Seller findAll ====");
		List<Seller> Allsellers = sellerDao.findAll();
		for(Seller s: Allsellers) {
			System.out.println(s);
		}
		
		System.out.println("\n=== Teste 4: Seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("inserted! new id = " + newSeller.getId());
		
		System.out.println("\n=== Teste 5: Seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=== Teste 6: Seller deleteById ====");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deletion completed");
		
		sc.close();
	}

}
