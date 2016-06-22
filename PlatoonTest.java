package platoontest;

public class PlatoonTest {
       
    public static class EvaluateIntiger
    {
        public static boolean IsEven(int even)
        {
            boolean isValid = false;
                       
            if(even % 2 == 0)
            {
                isValid = true;
            }
            
            return isValid;
        }
        
        public static boolean IsPrime(int prime)
        {
            boolean isValid = false;
                  
            if(prime > 1)
            {
                if(prime % 2 != 0)
                {
                    if(prime % 3 != 0)
                    {
                        isValid = true;
                    }
                    else if(prime == 3)
                    {
                        isValid = true;
                    }
                }
            }
            
            return isValid;
        }
        
        public static boolean IsPalindrome(int palindrome)
        {
            boolean isValid = false;
            
            int originalValue = palindrome;
            
            int temp = 0;
            
            while(palindrome != 0)
            {
                temp = temp * 10 + palindrome % 10;
                palindrome = palindrome / 10;
            }
                
            if(originalValue == temp)
            {
                isValid = true;
            }
            
            return isValid;
        }
    }
    
    public static class StringReverse
    {
        public static void ReverseString(String originalValue)
        {
            
            StringBuilder reversed = new StringBuilder();
            reversed.append(originalValue);
            reversed.reverse();
            
            System.out.println(originalValue);
            for(int x = 0; x < originalValue.length(); x++)
            {
                System.out.print(reversed.charAt(x));
            }
            
            System.out.println("");

        }
    }
    
    public static void main(String[] args) {
        
        EvaluateIntiger evaluateIntiger = new EvaluateIntiger();
              
        //System.out.println("Is 0 IsEven ? " + evaluateIntiger.IsEven(0));
        //System.out.println("Is 3 IsEven ? " + evaluateIntiger.IsEven(3));
        //System.out.println("Is 6 IsEven ? " + evaluateIntiger.IsEven(6));
        

        //System.out.println("Is 1 IsPrime ? " + evaluateIntiger.IsPrime(1));
        //System.out.println("Is 3 IsPrime ? " + evaluateIntiger.IsPrime(3));
        //System.out.println("Is 110 IsPrime ? " + evaluateIntiger.IsPrime(110));
        //System.out.println("Is 113 IsPrime ? " + evaluateIntiger.IsPrime(113));
        
        
        //System.out.println("Is 10 Palindrome ? " + evaluateIntiger.IsPalindrome(10));
        //System.out.println("Is 101 Palindrome ? " + evaluateIntiger.IsPalindrome(101));
        //System.out.println("Is 123321 Palindrome ? " + evaluateIntiger.IsPalindrome(123321));
        
        
        StringReverse stringReverse = new StringReverse();
        stringReverse.ReverseString("Dunisani Hlongwane");
     
        /*
            Write a Java class that will evaluate integer numbers. The class should have the 
            following methods, each taking an integer as input and returning a Boolean result:
              
            IsEven: A number is called even if it is completely divisible by two and odd if it’s not 
            completely divisible by two. For example, the number 4 is an even number because 
            when you divide 4/2, the remainder is 0 which means 4 is completely divisible by 2. 
            On the other hand, 5 is an odd number because 5/2 will result in the remainder = 1
                
            IsPrime: An integer greater than 1 is called a prime number if its only positive 
            divisors (factors) are 1 and itself.
        
            IsPalindrome: A number is called a palindrome if the number is equal to reverse of 
            the same number e.g. 121 is a palindrome because the reverse of 121 is 121, which 
            is the same. On the other hand 321 is not a palindrome because the reverse of 321 
            is 123 which is not equal to 321.
        */
    }
}
