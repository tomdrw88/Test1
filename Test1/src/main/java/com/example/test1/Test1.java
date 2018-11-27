/*
 *  Company: RS
 *  Project: Test1
 *  Created: 26 lis 2018  20:18:18
 *  Author:  RS
 */
package com.example.test1;

import com.example.test1.utils.Test1Utils;

/**
 *<p></p><br>26 lis 2018
 * @author RS
 *
 */
public class Test1 {

	
	public static void main(String[] args) {
		start();
		run1();
		runForest();
		Test1Utils.calculate(5);
		stop();
	}
	
	private static void start() {
		System.out.println("START");
	}
	
	private static void run1() {
		System.out.println("RUN 1");
	}
	
	
	private static void runForest() {
		System.out.println("RUN FOREST, RUN");
	}
	
	
	private static void stop() {
		System.out.println("STOP");
	}

}
