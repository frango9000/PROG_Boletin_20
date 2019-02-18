package App2;
//@author fsancheztemprano

public class App {

    public static void main(String[] args) {
        int filas = 13;
        int[][] piramide = new int[filas][(filas * 2) - 1];
        for (int i = 0; i < piramide.length; i++) {
            for (int j = 0; j < piramide[i].length; j++) {
                if (i == 0) {
                    piramide[i][filas - 1] = 1;
                } else if (j == 0) {
                    piramide[i][j] = piramide[i - 1][j + 1];
                } else if (j == piramide[i].length - 1) {
                    piramide[i][j] = piramide[i - 1][j - 1];
                } else {
                    piramide[i][j] = piramide[i - 1][j - 1] + piramide[i - 1][j + 1];
                }

            }

        }

        for (int i = 0; i < piramide.length; i++) {
            for (int j = 0; j < (filas * 2) - 1; j++) {
                if (piramide[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.printf("%3s", String.valueOf(piramide[i][j]));
                }
            }
            System.out.println("\n");
        }
    }
}

/*
run:
                          1                        

                        1    1                      

                      1    2    1                    

                    1    3    3    1                  

                  1    4    6    4    1                

                1    5   10   10    5    1              

              1    6   15   20   15    6    1            

            1    7   21   35   35   21    7    1          

          1    8   28   56   70   56   28    8    1        

        1    9   36   84  126  126   84   36    9    1      

      1   10   45  120  210  252  210  120   45   10    1    

    1   11   55  165  330  462  462  330  165   55   11    1  

  1   12   66  220  495  792  924  792  495  220   66   12    1
*/
