package edu.eci.cvds.patterns.archetype;

/**
 * Hello aew gfad gsergerz!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name = "";
        if (args.length > 0){
            for (String s:args) {
                name += s + " ";
            }
            System.out.println("Huola " + name + "! :D");
        }
        else{
            System.out.println("Hello world!");
        }
    }
}





