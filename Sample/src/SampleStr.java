import java.util.*;
public class SampleStr {
	
	//compares two strings using equals()
	public boolean StringComparison(String InputA, String InputB)
	{
		if (InputA.equals(InputB))
			return true;
		else
			return false;
	}
	
	//compares two strings using == (shallow comparison)
	public boolean ShallowCompare(String InputA, String InputB)
	{
		if (InputA == InputB)
			return true;
		else
			return false;
	}
	
	//demonstrates functions charAt and string.length()
	public char CharacterAtIndex(String InputA)
	{
		char Result = '-';
		if(InputA.length()>=4)
		Result = InputA.charAt(4);		
		return Result;
	}
	
	//demonstrates built-in functions toLowerCase(), toUpperCase() and concat() 
	public String CaseConcat(String InputA, String InputB)
	{
		String Res = InputA.toLowerCase().concat(InputB.toUpperCase());
		return Res;
	}
	
	//demonstrates substring(), trim() and contains() functions
	public String Sub(String InputA)
	{
		String Res;
		String Change = "he";
		if(InputA.trim().length()>=4)
		Res = InputA.substring(0,4);
		else if (InputA.contains(Change))
			Res = InputA;
		else
			Res = "good";
		return Res;
	}
	
	// demonstrates String Builder - insert(),delete(),replace(),append(),reverse(),toString() 
	//and character Array function for string
	public String SBldr(String InputA)
	{
		StringBuilder sb = new StringBuilder("testing functions");
		char[] cArr = InputA.toCharArray();
		
		for(int i=0;i<cArr.length;i++)
		{
			sb.append(cArr[i]);
		}
		
		sb.insert(1,"Java");
		sb.replace(1, 3, "Bye");
		sb.delete(0,2);
		return sb.reverse().toString();
	}
	
	//demonstrates string builder capacity()
	public int CapaCt(String InputA)
	{
		StringBuilder sb = new StringBuilder("testing capacity");
		sb.append(InputA.trim());		
		int cap=sb.capacity();
		return cap;
	}

	public static void main(String[] args) {
		
		SampleStr str = new SampleStr();
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a string: ");
		String user_inputA = reader.nextLine();
		String user_inputB = reader.nextLine();
		reader.close();
		System.out.println(str.ShallowCompare(user_inputA, user_inputB));
		System.out.println(str.StringComparison(user_inputA, user_inputB));
		System.out.println(str.Sub(user_inputA));
		System.out.println(str.CaseConcat(user_inputA, user_inputB));
		System.out.println(str.CharacterAtIndex(user_inputA));
		System.out.println(str.SBldr(user_inputA));
		System.out.println(str.CapaCt(user_inputA));
	}

}
