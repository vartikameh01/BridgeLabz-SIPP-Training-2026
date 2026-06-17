public class transpose {
    static void display(double[][] m) {
        for (double[] row : m) {
            for (double val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
    static double det2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    static double det3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(double[][] m) {
        double det = det2x2(m);

        double[][] inv = {
            { m[1][1] / det, -m[0][1] / det },
            { -m[1][0] / det, m[0][0] / det }
        };

        return inv;
    }

    static double[][] inverse3x3(double[][] m) {
        double det = det3x3(m);

        double[][] inv = new double[3][3];

        inv[0][0] = ((m[1][1]*m[2][2])-(m[1][2]*m[2][1]))/det;
        inv[0][1] = ((m[0][2]*m[2][1])-(m[0][1]*m[2][2]))/det;
        inv[0][2] = ((m[0][1]*m[1][2])-(m[0][2]*m[1][1]))/det;

        inv[1][0] = ((m[1][2]*m[2][0])-(m[1][0]*m[2][2]))/det;
        inv[1][1] = ((m[0][0]*m[2][2])-(m[0][2]*m[2][0]))/det;
        inv[1][2] = ((m[0][2]*m[1][0])-(m[0][0]*m[1][2]))/det;

        inv[2][0] = ((m[1][0]*m[2][1])-(m[1][1]*m[2][0]))/det;
        inv[2][1] = ((m[0][1]*m[2][0])-(m[0][0]*m[2][1]))/det;
        inv[2][2] = ((m[0][0]*m[1][1])-(m[0][1]*m[1][0]))/det;

        return inv;
    }

    public static void main(String[] args) {

        double[][] A = {
            {4, 7},
            {2, 6}
        };
        System.out.println("Determinant (2x2): " + det2x2(A));
        System.out.println("Inverse (2x2):");
        display(inverse2x2(A));

        double[][] B = {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        };
        System.out.println("\nDeterminant (3x3): " + det3x3(B));
        System.out.println("Inverse (3x3):");
        display(inverse3x3(B));
    }
}