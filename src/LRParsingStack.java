// Java code for stack implementation
 
import java.io.*;
import java.util.*;
 
class LRParsingStack
{  
    // Pushing element on the top of the stack
    static void stack_push(Stack<String> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i + "");
        }
    }
     
    // Popping element from the top of the stack
    static void stack_pop(Stack<String> stack)
    {
        System.out.println("Pop Operation:");
 
        for(int i = 0; i < 5; i++)
        {
            String y = (String) stack.pop();
            System.out.println(y);
        }
    }
 
    // Displaying element on the top of the stack
    static void stack_peek(Stack<String> stack)
    {
        String element = (String) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
     
    // Searching element in the stack
    static void stack_search(Stack<String> stack, String element)
    {
        int pos = stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
 
 
    public static void main (String[] args)
    {
        Stack<String> stack = new Stack<String>();
 
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, "2");
        stack_search(stack, "6");
        System.out.println(stack);
        System.out.println("here");
    }
}