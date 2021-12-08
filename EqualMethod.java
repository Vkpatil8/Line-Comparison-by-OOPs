class EqualMethod{

    //constructor
    public EqualMethod(Integer lengthOfLine1, Integer lengthOfLine2) {
        System.out.println("Equals Method Result:");
        if(lengthOfLine1.equals(lengthOfLine2))
            System.out.println("Both line 1 nad 2 have same length of " + lengthOfLine1);
        else
            System.out.println("Both have different length");
    }
}