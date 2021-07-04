public static String isBalanced(String s) {
    // Write your code here
    Stack<Character> stack=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch=='(' || ch=='{'||ch=='[')
        {
            stack.push(ch);
        }
        else if((ch==')'|| ch=='}' || ch==']') && !stack.isEmpty() )
        {
         if((ch==')' && stack.peek()!='(')|| (ch=='}' && stack.peek()!='{')  || (ch=='[' && stack.peek()!='['))
         {
             return "NO";
         }
         else{
             stack.pop();
         }    
        }
         else if((ch==')'|| ch=='}' || ch==']') && stack.isEmpty())
         {
             return "NO";
         }
        
    }
    if(!stack.isEmpty())
    {
        return "NO";
    }
    return "YES";

    }
}
