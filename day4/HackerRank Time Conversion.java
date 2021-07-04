  public static String timeConversion(String s) {
    // Write your code here
    String str="";
    if(s.substring(8,10).equals("PM"))
    {
        if(Integer.parseInt(s.substring(0,2))<12)
        {
            int hour=Integer.parseInt(s.substring(0,2))+12;
            str=str+String.valueOf(hour);
            if(str.length()==1)
                str="0"+str;
            str=str+s.substring(2,8);
        }
        else
            str=str+s.substring(0,8);
    }
    else
    {
        if(Integer.parseInt(s.substring(0,2))==12)
            str="00"+s.substring(2,8);
        else
            str=str+s.substring(0,8);
    }
    return str;
    }
