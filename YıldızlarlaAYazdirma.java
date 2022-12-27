public class YıldızlarlaAYazdirma {
    public static void main(String[] args) {
        String[][] dizi = new String[7][7];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    dizi[i][j] = "* ";
                } else if (j == 0 || j == 3) {
                    dizi[i][j] = "* ";
                } else {
                    dizi[i][j] = "     ";
                }
            }

        }
        for (String[] row : dizi
        ) {
            for (String col : row
            ) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
