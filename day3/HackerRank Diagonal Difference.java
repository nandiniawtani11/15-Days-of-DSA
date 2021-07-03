public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int first=0;
    int second=0;
    int i=0;
    System.out.println(arr.size());
    while(i<arr.size())
    {
        first=first+(arr.get(i).get(i));
        second=second+(arr.get(i).get(arr.size()-i-1));
        i++;
    }
    return Math.abs(first-second);

    }
