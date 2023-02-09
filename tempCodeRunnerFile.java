import java.io.*;
import java.util.*;

class Main 
{
 Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<Character>();
	void pushCharacter(char ch)
	{
        stack.push(ch);
	}
     void enqueueCharacter(char ch)
{
        queue.add(ch);
     }
	char popCharacter() 
{
        return stack.pop();
	}
	char dequeueCharacter()
   {
        return queue.remove();
	}
    public static void main(String[] args) 
{	
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	scan.close();
	char[] s = input.toCharArray();
	Main p = new Main();
	for (char c : s) 
{
            p.pushCharacter(c);
            p.enqueueCharacter(c);
	}
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) 
{
            if (p.popCharacter() != p.dequeueCharacter()) 
{
                isPalindrome = false;                
                break;
            }
        }
        System.out.println( "The word, " + input + ", is " 
 + ( (!isPalindrome) ? "not apalindrome." : "a palindrome." ) );
    }
}
