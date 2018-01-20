package Stack;

public class StackApp {

	public static void main(String[] args) {
		StackX theStack=new StackX(10);  //make the new stack of size 10
		theStack.push(1);                //pushing an item on the stack
		theStack.push(2);
		theStack.push(3);
		theStack.push(4);
		theStack.push(5);
		while(!theStack.isEmpty())      //till the stack is not empty
		{
			long value=theStack.pop();
			System.out.print(value+" ");
		}
		System.out.println();
	}

}
