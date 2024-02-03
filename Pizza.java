
/**
 * Enumeration class Pizza 
 *
 * @author Sveinson
 */


public enum Pizza
{
    CHEESE("Cheese", 12.95), CALABRIA("Calabria", 15.99), ROMA("Roma", 16.99), 
    TUSCAN("Tuscan", 18.00), MILANESE("Milanese",21.50);
    
    private String friendlyName;
    private double price;

    
    
    private Pizza(String fn, double p){
        friendlyName = fn;
        price = p;
    }// end constructor
    
    public void setPrice(double p){
        price = p;
    }
    
    @Override
    public String toString(){
      String st = friendlyName + ": $" + price;
        
      return st;
    }
}
