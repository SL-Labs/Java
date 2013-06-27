package com.sl.labs.java.programs.enums;

import com.sl.labs.java.programs.enums.SomeClass.SomeEnum;

class SomeClass 
{
	// here public, private, protected, default or static is allowed as modifiers for InnerEnum
	enum SomeEnum
	{
		SOMEENUM
	}
	
	SomeEnum se;
}

public class EnumInsideClass
{
	public static void main(String[] args) 
	{
		SomeClass sc = new SomeClass();
		
		// this is how we define a enum which is inside a class
		sc.se = SomeClass.SomeEnum.SOMEENUM;
		
		// we can also define a enum like mentioned below which is inside a class since both the class SomeClass & SomeEnum are default  
		// and both the class and enum are in same package
		sc.se = SomeEnum.SOMEENUM;
	}
}
