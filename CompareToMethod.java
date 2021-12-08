//compare method class
class CompareToMethod{

    //constructor
    public CompareToMethod(Integer lengthOfLine1, Integer lengthOfLine2) {

        System.out.println("Compare To Method Result:");
        int res = lengthOfLine1.compareTo(lengthOfLine2);

        //comparing line
        if(res < 0)
            System.out.println("Line 1 is smaller than Line 2.");
        else if(res > 0)
            System.out.println("Line 1 is greater than Line 2.");
        else
            System.out.println("Line 1 is equals to the Line 2.");

    }
}