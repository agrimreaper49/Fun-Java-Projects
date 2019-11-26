public class SentenceDriver {
    public static void main(String[] args)  {

        System.out.println("PALINDROME TESTER");
        Sentence s = new Sentence( "\"Hello there!\" she said." );
        System.out.println( s.getSentence() );
        System.out.println( s.getNumWords() );
        System.out.println( s.isPalindrome() );
        System.out.println();

        s = new Sentence( "A Santa lived as a devil at NASA." );
        System.out.println( s.getSentence() );
        System.out.println( s.getNumWords() );
        System.out.println( s.isPalindrome() );
        System.out.println();


        s = new Sentence( "Flo, gin is a sin! I golf." );
        System.out.println( s.getSentence() );
        System.out.println( s.getNumWords() );
        System.out.println( s.isPalindrome() );
        System.out.println();


        s = new Sentence( "Eva, can I stab bats in a cave?" );
        System.out.println( s.getSentence() );
        System.out.println( s.getNumWords() );
        System.out.println( s.isPalindrome() );
        System.out.println();

        s = new Sentence( "Madam, I'm Adam." );
        System.out.println( s.getSentence() );
        System.out.println( s.getNumWords() );
        System.out.println( s.isPalindrome() );
        System.out.println();

        s = new Sentence( "Lots! Of! Changes!?)]}" );
        System.out.println( s.removePunctuation(s.getSentence()));



        // Lots more test cases.  Test every line of code.  Test
        // the extremes, test the boundaries.  How many test cases do you need?


    }

}
class Sentence {
    private String mySentence;
    private int myNumWords;

    //Constructor.  Creates sentence from String str.
    //						Finds the number of words in sentence.
    //Precondition:  Words in str separated by exactly one blank.
    public Sentence( String str ) 
    {
    	mySentence = str;
    	String [] str1 = str.split(" ");
    	myNumWords = str1.length;

    }

    public int getNumWords() {
        return myNumWords;
    }

    public String getSentence()  {
        return mySentence;
    }

    //Returns true if mySentence is a palindrome, false otherwise.
    public boolean isPalindrome() {
        String test = removeBlanks(lowerCase(removePunctuation(mySentence)));
        String new1 = "";
        for  (  int  i = test.length()  - 1;  i >= 0; i-- )
        {
        	new1+=test.charAt(i);
        }
        if (  new1.equals(test) == true )
        {
        	return true;
        }
        return false;
    
    }

    //Returns copy of String s with all blanks removed.
    //Postcondition:  Returned string contains just one word.
    public static String removeBlanks( String s )  
    {
    	return s.replace(" " , "");
    }

    //Returns copy of String s with all letters in lowercase.
    //Postcondition:  Number of words in returned string equals
    //						number of words in s.
    public static String lowerCase( String s ) {
    	return s.toLowerCase();

    }

    //Returns copy of String s with all punctuation removed.
    //Postcondition:  Number of words in returned string equals
    //						number of words in s.
    public static String removePunctuation( String s ) {
    	return s.replace(  "\\W" , "" );

    }
}
