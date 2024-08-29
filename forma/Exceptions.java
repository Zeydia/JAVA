import java.io.IOException;
import java.util.*;

public class Exceptions 
{

    public static void main(String[] args) throws IOException
    {
        
        try(Scanner sc = new Scanner(System.in))
        {
        System.out.print("Quel est votre annee de naissance : ");
        int anniv = sc.nextInt();
        System.out.println("Vous etes ne en "+anniv);
        }
        catch(InputMismatchException e)
        {
            // System.out.println("La date de naissance est incorrecte.");
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {

        }
        finally
        {
            System.out.println("ok");
        }
    }
}

//Throwable <= Exception <= RuntimeException <= NoSuchElementException <= InputMismatchException