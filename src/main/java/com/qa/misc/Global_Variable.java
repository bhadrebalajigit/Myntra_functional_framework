package com.qa.misc;

public class Global_Variable {
	
	private static String title;
	
	public static String setter_title(String title_page)
	{
		title=title_page;
		return title;
	}

	public static String getter_title()
	{
		return title;
	}
	
}
