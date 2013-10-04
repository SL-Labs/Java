package com.sl.labs.java.programs.enums;

enum Simple
{
	SIMPLE
}

enum OutterEnum 
{
	// no modifier is allowed for the EnumConstant 
	OUTTER, OUT{
		public String toString()
		{
			return "EnumConstant -->  OutterEnum.OUT Specific toString() Called";
		}
	};
	
	public String toString()
	{
		return "Enum --> OutterEnum Common toString() Called";
	}
	
	
	// here public, private, protected, default or static is allowed as modifiers for InnerEnum
	enum InnerEnum
	{
		INNER
		{
			public String toString()
			{
				return "EnumConstant -->  OutterEnum.InnerEnum.INNER Specific toString() Called";
			}
		}, IN;
		
		public String toString()
		{
			return "Enum -->  OutterEnum.InnerEnum Common toString() Called";
		}
	}
}

public class NestedEnum
{
	// this is how we do the declaration for OutterEnum
	private OutterEnum out = OutterEnum.OUT;
	
	// this is how we do the declaration for InnerEnum 
	private OutterEnum.InnerEnum inner = OutterEnum.InnerEnum.INNER;
	
	public static void main(String[] args) 
	{
		NestedEnum ne = new NestedEnum();
		
		// whenever we pass an EnumConstant as argument for sysout() it will call that particular EnumConstant specific toString()
		System.out.println(ne.out);
		System.out.println(ne.inner);
		
		// valueOf() is a default static method in all enum declaration and it will return the EnumConstant which is identified by that particular String
		// If that particular String is not identified as a valid EnumConstant in the enum declaration then it throws java.lang.IllegalArgumentException
		OutterEnum outter = OutterEnum.valueOf("OUTTER");
		OutterEnum.InnerEnum in = OutterEnum.InnerEnum.valueOf("IN");
		
		// normal enum declaration
		Simple simple = Simple.SIMPLE;
		
		// whenever we pass an EnumConstant as argument for sysout() it will call that particular EnumConstant specific toString()
		// if that particular EnumConstant specific toString() is not defined then it will call the common overridded implementation of enum's toString()
		// if that particular common overridded implementation of enum's toString() is not defined then it will call the EnumConstant.name()
		System.out.println(outter);
		System.out.println(in);
		System.out.println(simple);
		
		// values() is a default static method in all enum declaration and it will return all the EnumConstants present in that particular enum as array
		for (OutterEnum oe : OutterEnum.values()) 
		{
			// name() & ordinal() is a default instance method in all enum declaration
			// name() will return the exact face value of that particular EnumConstant which was specified during the enum declaration
			// ordinal() will return the position or index of that particular EnumConstant in the order how they were specified during the enum declaration
			System.out.println(oe.name()+"\t"+oe.ordinal());
		}
		
		// Note ::: Most programmers should use the toString() method in preference to this one, as the toString method may return a more user-friendly name
		
		for (OutterEnum.InnerEnum ie : OutterEnum.InnerEnum.values()) 
		{
			System.out.println(ie.name()+"\t"+ie.ordinal());
		}
	}
}
