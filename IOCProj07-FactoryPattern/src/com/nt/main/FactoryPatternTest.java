//Main Class
package com.nt.main;

import com.nt.comps.ICar;
import com.nt.factory.CarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		ICar  car=CarFactory.getInstance("standard");
		System.out.println(car.drive("raja"));

	}

}
