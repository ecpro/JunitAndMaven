package com.piyush.admin.util;

public final class IDGenerator {
	
	private static int i;
	
	public static int generateID() {
		return ++i;
	}
	
}
