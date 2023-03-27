package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.List;
import java.util.Scanner;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;//do uu tien
    private String descriptions;//mo ta danh muc
    private boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData(Scanner scanner, List<Catalog> list) {
        System.out.println("Nhập tên danh mục: ");
        this.catalogName = scanner.nextLine();
        System.out.println("Nhập độ ưu tiên của danh mục: ");
        this.priority = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả danh mục: ");
        this.descriptions = scanner.nextLine();
        System.out.println("Nhập trạng thái danh mục: ");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("---------------------{Danh mục}---------------------");
        System.out.printf("Mã danh mục: %d\n", catalogId);
        System.out.printf("Tên danh mục: %s\n", catalogName);
        System.out.printf("Độ ưu tiên danh mục: %d\n", priority);
        System.out.printf("Mô tả danh mục: %s\n", descriptions);
        System.out.printf("Trạng thái danh mục: %s\n", (catalogStatus ? "OK" : "NO"));
        System.out.println("----------------------------------------------------");
    }
}
