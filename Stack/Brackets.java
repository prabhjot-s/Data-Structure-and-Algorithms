package Stack;

import java.util.Scanner;

class BracketChecker{

	private String input;
	BracketChecker(String in)
	{
		input=in;
	}
	public void check()
	{
		int stackSize=input.length();
		StackChar theStack=new StackChar(stackSize);
		for(int j=0;j<input.length();j++)
		{
			char ch=input.charAt(j);
			switch(ch)
			{
			case '{':
			case '(':
			case '[':
				theStack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!theStack.isEmpty())
				{	
					char chx=theStack.pop();
					if((ch=='}'&&chx!='{')||(ch==']'&&chx!='[')||(ch==')'&&chx!='('))
					{
						System.out.println("Error: "+ch+" at: "+j);
					}
				}
					else
						System.out.println("Premature Error: "+ch+" at: "+j); //stack prematurely empty test
					//test Case Example []}
					break;
			default: //no action needs to be done on other characters apart from the delimiters
				break;

			}
		}
			if(!theStack.isEmpty())
			{
				System.out.println("Error missing right delimiter");//test case:{[()]
			}

		}
	}
public class Brackets {
	public static void main(String[] args) {
		String input;
		Scanner scn=new Scanner(System.in);
		input=scn.next();
		BracketChecker theChecker=new BracketChecker(input);
		theChecker.check();

	}

}
