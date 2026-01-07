package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    static void main() {

    SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TESTE Nº01: seller findByID =====");
    Seller seller = sellerDao.findById(7);

        System.out.println(seller);


    }

}
