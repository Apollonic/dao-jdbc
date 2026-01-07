package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    static void main() {

        Department obg = new Department(1,"Books");
        System.out.println(obg);

    Seller seller = new Seller(1,"Bob","sla@gmail.com",new Date(),900.0,obg);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        

    }

}
