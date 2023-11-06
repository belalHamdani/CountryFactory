public class Country {

    public String name;
    public String continent;
    public int numSize;
    public String flagColor;

    public void printInfo() {
        System.out.println("The country is called:" + name);
        System.out.println("The country is in:" + continent);
        System.out.println("The country is (in mi^2):" + numSize);
        System.out.println("The country's flag color are:" + flagColor);

    }


    public Country(String paramName, String paramContinent, int paramnumSize, String paramflagColor) {
        name = paramName;
        numSize = 10;
        continent = paramContinent;
        flagColor = paramflagColor;

    }
}

