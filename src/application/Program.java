package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    static void main() {

    SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TESTE Nº01: seller findByID =====");
        Seller seller = sellerDao.findById(7);
        System.out.println(seller);

        System.out.println("\n"+" ==== TESTE Nº02: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }

    }

}
