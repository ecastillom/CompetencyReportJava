public class CompetencyReport
{
    public static void main(String arg[]) 
    {
        int[] ListNumbers = {3,5,7,6,3,2,9};

        int Result = 0;

        for(int x=0; x<ListNumbers.length; x++ )
        {
            Result = Result + ListNumbers[x];
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------");
        System.out.println("Task #1");
        System.out.println("The sum for the all elements is: " +  Result );
        System.out.println("----------------------------------------------");
        for(int x=0; x<ListNumbers.length; x++ )
        {
            if(ListNumbers[x] == 7)
            {
                System.out.println("Task #2");
                System.out.println("Hi everyone!!! the #7 is in position " +  x );
                System.out.println("----------------------------------------------");
                x = 7;
            }
        }

    }
}