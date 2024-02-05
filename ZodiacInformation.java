import java.util.Scanner;
/** 
 * ACS-1904 Lab 4
 * @Sveinson 
*/

public class ZodiacInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sign;
        
        Zodiac zodiac;
        Zodiac[] signs = Zodiac.values();
        
        // print inverted roller coasters
        System.out.println("Positive signs:");
        
        for(Zodiac z : signs)
            if(z.isPositive())
                System.out.println(z.name());
        
        // print non-inverted coasters
        System.out.println("\nNegative signs:");
        
        for(Zodiac z : signs)
            if(!z.isPositive())
                System.out.println(z.name());
                
        // get roller coaster info        
        System.out.println("\nEnter a sign to see its element:");
        sign = scanner.next().toUpperCase();
        zodiac = Zodiac.valueOf(sign);
        
        // print the infor for the requested roller coaster
        System.out.println();
        System.out.print(zodiac + "\n\n");
        
        // program has terminated normally
        System.out.println("end of program");
    }
}
