import java.util.Stack;
class Lab5Ex3 {
  public static boolean isValid(String s, int n) {
   Stack<Character> str = new Stack<>();
   for (int i = 0; i < n; i++) {
     char c = s.charAt(i);
   // If the character is an opening bracket, push it onto the stack
     if (c == '[' || c == '{' || c == '(') {
          str.push(c);
         } 
// If the character is a closing bracket, check for a matching opening bracket
   else if (c == ']' || c == '}' || c == ')') {
          if (str.isEmpty()) {
             return false;
           }
     char top = str.peek();
      if ((top == '[' && c == ']') || 
        (top == '{' && c == '}') || 
      (top == '(' && c == ')')) {
         str.pop();
       } else {
         return false;
        }           }        }
        // If the stack is empty, all brackets are matched
        return str.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({[a+b]+c}-1)";
        System.out.println(isValid(s, s.length()));
    }
}