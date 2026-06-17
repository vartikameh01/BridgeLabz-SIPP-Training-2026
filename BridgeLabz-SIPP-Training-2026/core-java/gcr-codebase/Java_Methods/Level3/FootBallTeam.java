public class FootBallTeam {
    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int h : heights) {
            sum += h;
        }

        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int h : heights) {
            if (h < shortest) {
                shortest = h;
            }
        }

        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int h : heights) {
            if (h > tallest) {
                tallest = h;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights();

        System.out.println("Player Heights:");

        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n\nMean Height = " + findMean(heights));
        System.out.println("Shortest Height = " + findShortest(heights));
        System.out.println("Tallest Height = " + findTallest(heights));
    }
}