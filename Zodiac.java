
/**
 * Enumeration class RollerCoasters
 *
 * @author Sveinson
 */
public enum Zodiac
{
    ARIES("Aries", "Fire", true), TAURUS("Taurus", "Earth", false), 
    GEMINI("Gemini", "Air", true), CANCER("Cancer", "Water", false), 
    LEO("Leo", "Fire", true), VIRGO("Virgo", "Earth", false), 
    LIBRA("Libra", "Air", true), SCORPIO("Scorpio", "Water", false), 
    SAGITTARIUS("Sagittarius", "Fire", true), CAPRICORN("Capricorn", "Earth", false), 
    AQUARIUS("Aquarius", "Air", true), PISCES("Pisces", "Water", false);
            
    private String friendlyName;    
    private String element;
    private boolean polarity;
    
    private Zodiac(String fn, String e,boolean p){
        friendlyName = fn;
        element = e;
        polarity = p;
    }
    
    public String getFriendlyName(){
        return friendlyName;
    }
    
    public String getElement(){
        return element;
    }
    
    public boolean isPositive(){
        return polarity;
    }

    
    
    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("Sign: " + friendlyName + "\n");
        st.append("Element: " + element + "\n");
        return st.toString();
    }
 
}
