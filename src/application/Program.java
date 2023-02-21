package application;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1001, "Books");
		
		Seller seller = new Seller(1, "Antonio", "antonio@gmail.com", new Date(), 5000.0, dp);
		
		System.out.println(seller);
	}

}
