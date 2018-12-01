package sda.pl;


public class App 
{
    public static void main( String[] args )
    {
        Dish dish1 = new AglioOlio(20, 2);

        String description = dish1.description();
        System.out.println(description);
    }
}
