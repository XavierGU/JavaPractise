public class ModulusAnimation1011 {
    public static void main( String[] args ) throws Exception
    {
        for ( int i=0; i<80; i++ )
        {
            if ( i%10 == 0 )
                System.out.print(" Mr. Mitchell is cool. \r");
            else if (i%11==0)
                System.out.println("    Mr. Mitchell is cool. \n");
            else if (i%12==0)
                System.out.println("           Mr. Mitchell is cool. \n");
            Thread.sleep(200);
        }
    }
}
