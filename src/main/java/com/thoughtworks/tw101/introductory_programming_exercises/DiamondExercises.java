package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int middle = n-1;

        for (int row = 0; row < n; row++){
            int beginSpace = row;
            for (int col = 0; col <= row*2; col++){
                for(; beginSpace < middle - col; beginSpace++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int middle = n-1;

        for (int row = 0; row < n; row++){
            int beginSpace = row;

            for (int col = 0; col <= row*2; col++){
                for(; beginSpace < middle - col; beginSpace++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = n-1; row > 0; row--){
            int beginSpace = row;

            for (int col = 0; col < row*2-1; col++){
                for(; beginSpace <= middle - col; beginSpace++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int middle = n-1;

        for (int row = 0; row < n-1; row++){
            int beginSpace = row;

            for (int col = 0; col <= row*2; col++){
                for(; beginSpace < middle - col; beginSpace++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Marco");

        for (int row = n-1; row > 0; row--){
            int beginSpace = row;

            for (int col = 0; col < row*2-1; col++){
                for(; beginSpace <= middle - col; beginSpace++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }
}
