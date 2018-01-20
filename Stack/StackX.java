package Stack;

//Stack implementation using Array

public class StackX {
	private int maxSize;       //size of array stack
	private long[] stackArray; //actual array stack
	private int top;            //stores the index of the top of the array

	StackX(int s)               //Constructor
	{
		maxSize=s;                      //setting the max size
		stackArray = new long[maxSize]; //creating array
		top=-1;                         //no elements in the stack yet
	}
	public void push(long item)
	{
		stackArray[++top]=item;        //first incrementing top and then inserting item into the stack
	}
	public long pop()
	{
		return stackArray[top--];	      //first accessing the item and then decrementing the top
	}
	public long peek()                //return the item at the top of the stack
	{
		return stackArray[top];
	}
	public boolean isEmpty()         //true of stack is empty
	{
		return (top==-1);
	}
	public boolean isFull()          //true if stack is full
	{
		return (top==maxSize-1);
	}
}
