class PascalTriangle {
     public static void main(String[] args) {
        int rows = 5;
        for (int n = 0; n < rows; n++) {
            for (int s = 0; s < rows - n - 1; s++) {
                System.out.print("  ");
            }
            for (int r = 0; r <= n; r++) {
                System.out.print(nCr(n, r) + "   ");
            }
            System.out.println();
        }
    }

    public static int nCr(int n, int r) {
        if (r > n) return 0;
        if (r > n / 2) r = n - r;
        long ans = 1;
        for (int i = 0; i < r; i++) {
            ans = ans * (n - i) / (i + 1);
        }
        return (int) ans;
    }
}