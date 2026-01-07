package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main() {

    SellerDao sellerDao = DaoFactory.createSellerDao();
    Scanner sc = new Scanner(System.in);

        System.out.println("==== TESTE Nº01: seller findByID =====");
        Seller seller = sellerDao.findById(7);
        System.out.println(seller);

        System.out.println("\n"+" ==== TESTE Nº02: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n"+" ==== TESTE Nº03: seller findAll =====");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n"+" ==== TESTE Nº04: seller insert =====");
        Seller newSeller = new Seller(null, "Greg","Greg@gmail.com",new Date(), 4000.0, department);
        //sellerDao.insert(newSeller);
        System.out.println("Inserido! Novo Id: "+ newSeller.getId());

        System.out.println("\n"+" ==== TESTE Nº05: seller update =====");
        seller = sellerDao.findById(1);
        seller.setName("Marta Wayne");
        sellerDao.update(seller);
        System.out.println("Update feito");

        System.out.println("\n"+" ==== TESTE Nº06: seller update =====");
        System.out.print("digite um id para o teste de deleção: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deletado!");

        sc.close();
    }

}
