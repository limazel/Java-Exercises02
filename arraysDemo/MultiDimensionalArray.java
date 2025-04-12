package arraysDemo;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Istanbul";
        cities[0][1] = "Ankara";
        cities[0][2] = "Konya";

        cities[1][0] = "Vienna";
        cities[1][1] = "Salzburg";
        cities[1][2] = "Tyrol";

        cities[2][0] = "New York";
        cities[2][1] = "Los Angeles";
        cities[2][2] = "Chicago";

        for (int i = 0; 0 < cities.length; i++) {
            System.out.println("-------------");
            for( int j = 0; j < cities[i]. length; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}
