public static List<Integer> getMax(List<String> operations) {
    // Write your code here
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> max=new Stack<>();
    List<Integer> list=new ArrayList<>();
   // System.out.println(operations.size());
    for(int i=0;i<operations.size();i++)
    {
        String type[]=(operations.get(i)).split(" ");
        switch(type[0])
        {
            case "1":
            int k=Integer.parseInt(type[1]);
            stack.push(k);
            if(max.isEmpty() || k>=max.peek())
            {
                max.push(k);
            }
            break;
            case "2":
            k=stack.pop();
            
            if(k==max.peek())
            {
                max.pop();
            }
            
            break;
            case "3":
            list.add(max.peek());
            break;          
         
        }
    }
    return list;   
    }
