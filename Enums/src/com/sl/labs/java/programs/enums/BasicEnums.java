package com.sl.labs.java.programs.enums;

//only public or default is allowed as modifiers for Outter enum
enum Days 
{
	// here ; is needed if we have more code in enum after the enum constant SUNDAY
	// also here in the enum constant SATURDAY(0) & SUNDAY(1) we are calling the overloaded constructor of the Days enum
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(0), SUNDAY(1); 
	
	// only private and default constructors are allowed in enum
	private Days()
	{} 
	
	// this is an overloaded constructor for the Days enum
	Days(int code)
	{
		this.code = code;
	}
	
	// instance variable for the enum
	private int code;

	public int getCode() 
	{
		return code;
	}

	public void setCode(int code) 
	{
		this.code = code;
	}

}; // here ; is optional  

/* 
 * All java enum E implicitly extends java.lang.Enum<E>. Since java doesn't 
   allow multiple inheritance, enum types can't have superclass. They can't even extend 
   from java.lang.Enum, nor java.lang.Object. It also means enum A can't inherit or 
   extend enum B
*/

//In enum we can implement another interface but we can't extend a class
enum Months 
{
	// here ; is not needed since there is no more code in the enum after the enum constant DEC
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC 
	
} // here we didn't mention ; since its optional

class SimpleClass
{
	public static void main(String[] args) 
	{
		Days day1 = Days.MONDAY;
		Days day2 = Days.TUESDAY;
		
		// we can use == and != operator to check whether two enums are equal or not 
		System.out.println(day1==day1);
		System.out.println(day1==day2);
		System.out.println(day1!=day2);

		// we can also use equals() to check whether two enums are equal or not 
		System.out.println(day1.equals(day1));
		System.out.println(day1.equals(day2));

		
	}
}

