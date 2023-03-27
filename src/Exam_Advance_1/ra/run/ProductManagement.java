package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Catalog> catalogList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        while (true) {
            System.out.println("********************************{JAVA-HACKATHON-05-ADVANCE-2-MENU}********************************");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục");
            System.out.println("2. Nhập số sản phẩm và nhập thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("**************************************************************************************************");
            System.out.println("Lựa chọn menu: ");
            int choseMenu = Integer.parseInt(scanner.nextLine());
            switch (choseMenu) {
                case 1:
                    createCatalog(catalogList, scanner);
                    break;
                case 2:
                    createProduct(catalogList, scanner, productList);
                    showProduct(productList);
                    break;
                case 3:
                    sortByPriceDown(productList);
                    showProduct(productList);
                    break;
                case 4:
                    searchProductName(productList, scanner);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Không có lựa chọn");
                    break;
            }
        }
    }

    private static void searchProductName(List<Product> productList, Scanner scanner) {
        List<Product> listSearch = new ArrayList<>();
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm: ");
        String searchProName = scanner.nextLine();
        for (Product product : productList) {
            if (product.getProductName().contains(searchProName)) {
                listSearch.add(product);
            }
        }
        showProduct(listSearch);
    }

    private static void sortByPriceDown(List<Product> productList) {
        Collections.sort(productList);
    }

    private static void showProduct(List<Product> productList) {
        System.out.println("************************{Tất cả sản phẩm}************************");
        for (Product product : productList) {
            product.displayData();
        }
    }

    private static void createProduct(List<Catalog> catalogList, Scanner scanner, List<Product> productList) {
        System.out.println("Bạn muốn thêm bao nhiêu sản phẩm: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập sản phẩm thứ: " + (i + 1));
            Product newPro = new Product();
            newPro.inputData(scanner, catalogList);
            if (productList.size() == 0) {
                newPro.setProductId(1);
            } else {
                newPro.setProductId(productList.get(productList.size() - 1).getProductId() + 1);
            }
            productList.add(newPro);
        }
        System.out.println("thêm sản phẩm thành công");
    }

    private static void createCatalog(List<Catalog> catalogList, Scanner scanner) {
        System.out.println("Bạn muốn thêm bao nhiêu danh mục: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập danh mục thứ: " + (i + 1));
            Catalog newCatalog = new Catalog();
            newCatalog.inputData(scanner, catalogList);
            if (catalogList.size() == 0) {
                newCatalog.setCatalogId(1);
            } else {
                int newCatalogId = catalogList.get(catalogList.size() - 1).getCatalogId() + 1;
                newCatalog.setCatalogId(newCatalogId);
            }
            catalogList.add(newCatalog);
        }
        System.out.println("thêm danh mục thành công");

    }


}
