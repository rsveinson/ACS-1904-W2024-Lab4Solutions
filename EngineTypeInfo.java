import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class EngineTypeInfo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // must use .values() to create an array
        // or
        // for(EngineType e : EngineType.values())
        EngineType[] engines = EngineType.values();

        for(EngineType e : engines){
            System.out.println(e);
            //or, could call toString() explicitly
            //System.out.println(e.toString());
        }

        System.out.println();

        System.out.println("end of program");
    }
}
