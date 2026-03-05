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
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Teste 1: seller find by id ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== Teste 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartment(dep);
		for (Seller s : sellers) {
			System.out.println(s);
		}

		System.out.println("\n=== Teste 3: seller findAll ===");
		sellers = sellerDao.findAll();
		for (Seller s : sellers) {
			System.out.println(s);
		}

		System.out.println("\n=== Teste 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted id = " + newSeller.getId());

		System.out.println("\n=== Teste 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update successful.");
		
		System.out.println("\n=== Teste 6: seller delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed.");
		
		sc.close();
	}

}
