package Exam_Advance_1.ra.bussiness;

import Exam_Advance_1.ra.bussinessImp.Catalog;

import java.util.List;
import java.util.Scanner;

public interface IShop {
   float RATE= 1.3F;
   public void inputData(Scanner scanner, List<Catalog> list);
   public void displayData();

}
