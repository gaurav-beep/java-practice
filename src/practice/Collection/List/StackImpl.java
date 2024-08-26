package practice.Collection.List;

import java.util.Stack;

public class StackImpl {
public static void main(String[] args) {
	// sutable for LIFO and FILO 
	Stack<String> stack  = new Stack<>();
	stack.push("India");
	stack.push("USA");
	stack.push("UK");
	stack.push("Australia");
	stack.pop();
	System.out.println("stack : "+stack);
	
	// all iterating operation support by vector is also used by stack
}
}
