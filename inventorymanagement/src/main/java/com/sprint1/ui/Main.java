package com.sprint1.ui;

import java.util.Scanner;
import com.sprint1.util.ProductOrderNotFoundException;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;
import com.sprint1.service.DisplayDetailsServiceImpl;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DisplayDetailsServiceImpl trackOrderServiceImplObj = new DisplayDetailsServiceImpl();

		while (true) {
			System.out.println("Please Enter Your Required Option");
			System.out.println("1.RawMaterial Tracking");
			System.out.println("2.Product Tracking");
			System.out.println("3.Exit");
			int option = in.nextInt();
			switch (option) {
			case 1:

				System.out.println("You Have Choosen Raw Material Tracking");
				System.out.println("Enter RawMaterial Order Id");
				String OrderId = in.next();
				try {
					RawMaterialDetails a = trackOrderServiceImplObj.trackOrder(OrderId);
					System.out.println(a);
				} catch (RawMaterialOrderNotFoundException e) {
					System.err.println(e.getMessage());
				}

				break;
			case 2:

				System.out.println("You Have Choosen Product Tracking");
				System.out.println("Enter Product Order Id");
				String OrderId1 = in.next();
				try {
					ProductDetails b = trackOrderServiceImplObj.ProductOrder(OrderId1);
					System.out.println(b);
				} catch (ProductOrderNotFoundException f) {
					System.err.println(f.getMessage());
				}

				break;
			case 3:
			default:
				System.out.println("THANK YOU");
			}
		}
	}
}
