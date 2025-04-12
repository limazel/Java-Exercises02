package arraysDemo;

public class Projects {
    public static void main(String[] args) {
        double[] costs = {1.2, 3.4, 5.6, 7.8};
        double total = 0;
        double max = costs[0];
        for(double cost:costs) {
            if(max < cost) {
                max = cost;
            }
            total += cost;
        }

        System.out.println(total);
        System.out.println("Max: " + max);
    }
}