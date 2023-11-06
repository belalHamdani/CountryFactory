public class Main {

    public static void main(String[] args) {
        Main myFactory = new Main();

    }
    public Main() {

        Country Italy;                             // declare strawberry
        Italy = new Country("Italy", "Europe", 115000 , "Green, Red, White");
        Italy.name = "Italy";
        Italy.continent = "Europe";
        Italy.numSize = 115000;
        Italy.flagColor = "Green, Red, White";
        Italy.printInfo();

        Country SouthKorea;                             // declare strawberry
        SouthKorea = new Country("South Korea", "Europe", 115000, "White, Red, Blue, Black");
        SouthKorea.name = "South Korea";
        SouthKorea.continent = "Asia";
        SouthKorea.numSize = 39000;
        SouthKorea.flagColor = "White, Red, Blue, Black";
        SouthKorea.printInfo();
    }}