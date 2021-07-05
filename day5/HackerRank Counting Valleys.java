public static int countingValleys(int steps, String path) {
    int level=0;
    int count=0;
    int c=-1;
    for(int i=0;i<steps-1;i++)
    {
        if(path.charAt(i)=='U')
        level=level+1;
        else
        level=level-1;
        if(level==-1 && path.charAt(i+1)=='U')
            count=count+1;
    }
    return count;
    }
