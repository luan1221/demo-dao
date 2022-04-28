package app;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDAO sellerDao = DaoFactory.createSellerDao();
        //Seller seller = sellerDao.findById(3);
        //System.out.println(seller);
        List<Seller> list = sellerDao.findAll();
        for (Seller seller : list) {
            System.out.println(seller);
        }
    }
}
