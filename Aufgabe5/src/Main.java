//import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] solution = {
                {5,3,4, 6,7,8, 9,1,2},
                {6,7,2, 1,9,5, 3,4,8},
                {1,9,8, 3,4,2, 5,6,7},

                {8,5,9, 2/*7*/,6,1, 4,2,3},
                {4,2,6, 8,5,3, 7,9,1},
                {7,1,3, 9,2,4, 8,5,6},

                {9,6,1, 5,3,7, 2,8,4},
                {2,8,7, 4,1,9, 6,3,5},
                {3,4,5, 2,8,6, 1,7,9}
        };

        printSudoku(solution);
        checkSudoku(solution);
    }

    public static void printSudoku(int [][] solution) {
        // iteratione deep to String:
        //System.out.println(Arrays.deepToString(solution).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));


        // iteration nested for each:
        /*for (int[] x : solution)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }*/

        // iteration nested for loop:
        for (int row=0; row < solution.length; row++){

            for (int column=0; column < solution[row].length; column++){
                System.out.print(solution[row][column ]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("+---------+---------+---------+");
        //System.out.print("|");
        //System.out.print("|");
        //System.out.print("|");


        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%%%% 3X3 PRINT / COUNT %%%%%%%%%%%%
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        //wenn row % 3 (durch 3 teilbar) dann System.out.println("+---------+---------+---------+");
        //wen column % 3 (durch 3 teilbar) dann System.out.println("|");
        //define the variable outside the for loop in order to not reset the result in every loop and keep and add the result
        // to get e.g. the final sum

        // 3x3
        for (int row=0; row < /*3*/solution.length; row++){

            System.out.print("|");
            for (int column=0; column < /*3*/solution[row].length; column++){
                System.out.print(" "+solution[row][column ]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //%%%%%%%%%%% BLOCK 1 %%%%%%%%%%%%%%%%%%%%
        System.out.println("Block 1: 0-2|0-2");
        System.out.println("+---------+");
        int g=0;
        for (int row=0; row < 3/*solution.length*/; row++){

            //System.out.print("|");
            for (int column=0; column < 3/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column ]+" ");
                g = g + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.println("-> "+g);
        System.out.println();

        //%%%%%%%%%%% BLOCK 2 %%%%%%%%%%%%%%%%%%%%
        System.out.println();
        System.out.println("Block 2: 3-5|0-2");
        System.out.println("+---------+");
        int h=0;
        for (int row=0; row < 3 /*solution.length*/; row++){

            //System.out.print("|");
            for (int column=3; column < 6/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column ]+" ");
                h = h + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.println("-> "+h);
        System.out.println();

        //%%%%%%%%%%% BLOCK 3 %%%%%%%%%%%%%%%%%%%%
        System.out.println();
        System.out.println("Block 3: 6-8|0-2");
        System.out.println("+---------+");
        int k=0;
        for (int row=0; row < 3 /*solution.length*/; row++){

            //System.out.print("|");
            for (int column=6; column < 9/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column ]+" ");
                k = k + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.println("-> "+k);
        System.out.println();

        //%%%%%%%%%%% ROW TWO %%%%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%%%% BLOCK 4 %%%%%%%%%%%%%%%%%%%%

        System.out.println();
        System.out.println("Block 4: 0-2|3-5");
        System.out.println("+---------+");
        int f = 0;
        for (int row=3; row < 6 /*solution.length*/; row++){

            //System.out.print("|");
            for (int column=0; column < 3/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column ]+" ");
                f = f + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.println("-> "+f);
        System.out.println();

        //%%%%%%%%%%% BLOCK 5 %%%%%%%%%%%%%%%%%%%%
        System.out.println();
        System.out.println("Block 5: 3-5|3-5");
        System.out.println("+---------+");
        int b=0;
        for (int row=3; row < 6 /*solution.length*/; row++){

            //System.out.print("|");
            for (int column=3; column < 6/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column ]+" ");
                b = b + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.println("-> "+b);
        System.out.println();

        //%%%%%%%%%%% BLOCK 6 %%%%%%%%%%%%%%%%%%%%
        System.out.println();
        System.out.println("Block 6: 6-8|3-5");
        System.out.println("+---------+");
        int a=0;
        for (int row=3; row < 6 /*solution.length*/; row++){

            //System.out.print("|");
            for (int column=6; column < 9/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column ]+" ");
                a = a + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.print("-> "+a);
        System.out.println();

        //%%%%%%%%%%% ROW THREE %%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%%%% BLOCK 7 %%%%%%%%%%%%%%%%%%%%

        System.out.println();
        System.out.println("Block 7: 0-2|6-8");
        System.out.println("+---------+");
        int n = 0;
        for (int row=6; row < 9 /*solution.length*/; row++){

            //System.out.print("|");
            for (int column=0; column < 3/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column]+" ");
                    n = n + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.print("-> "+n);
        System.out.println();

        //%%%%%%%%%%% BLOCK 8 %%%%%%%%%%%%%%%%%%%%
        System.out.println();
        System.out.println("Block 8: 3-5|6-8");
        System.out.println("+---------+");
        int c=0;
        for (int row=6; row < 9 /*solution.length*/; row++){

            //System.out.print("|");
            for (int column=3; column < 6/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column ]+" ");
                c = c + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.print("-> "+c);
        System.out.println();

        System.out.println();

        //%%%%%%%%%%% BLOCK 9 %%%%%%%%%%%%%%%%%%%%
        System.out.println("Block 9: 6-8|6-8");
        System.out.println("+---------+");
        int d=0;
        for (int row=6; row < 9 /*solution.length*/; row++){

            //System.out.print("|");
            for (int column=6; column < 9/*solution[row].length*/; column++){
                System.out.print(" "+solution[row][column ]+" ");
                d = d + solution[row][column]; // add all numbers of an array
            }
        }
        System.out.print("-> "+c);
            System.out.println();

        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%%%% ENTIRE PRINT FUNCTION %%%%%%%%
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


        System.out.println();
        /*System.out.println("All three Blocks | first row");*/
        System.out.println("+---------+---------+---------+");
        for (int row=0; row < 3 /*solution.length*/; row++){


            System.out.print("|");

            for (int column=0; column < solution[row].length; column++){
                if (column == 3){
                    System.out.print("|");
                }
                else if (column == 6){
                    System.out.print("|");
                }
                System.out.print(" "+solution[row][column ]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
        /*System.out.println("All three Blocks | second row");*/
        System.out.println("+---------+---------+---------+");
        for (int row=3; row < 6 /*solution.length*/; row++){


            System.out.print("|");

            for (int column=0; column < solution[row].length; column++){
                if (column == 3){
                    System.out.print("|");
                }
                else if (column == 6){
                    System.out.print("|");
                }
                System.out.print(" "+solution[row][column ]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
        /*System.out.println("All three Blocks | third row");*/
        System.out.println("+---------+---------+---------+");
        for (int row=6; row < 9 /*solution.length*/; row++){


            System.out.print("|");

            for (int column=0; column < solution[row].length; column++){
                if (column == 3){
                    System.out.print("|");
                }
                else if (column == 6){
                    System.out.print("|");
                }
                System.out.print(" "+solution[row][column ]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("+---------+---------+---------+");

    }


    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    //%%%%%%%%% AWNSER EVALUATION CLASS %%%%%%%%
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public static void checkSudoku(int[][] solution) {


        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%% ROW EVALUATION FUNCTION %%%%%%%%
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        boolean bool = true;
        boolean falseMemory = true;

        System.out.println();
        System.out.println();
        //for (int rowlimit=0; rowlimit <= 9; rowlimit++){
        System.out.println("rows:");
            for (int row=0; row < 9 /*solution.length*/; row++) {


                int n = 0;
                for (int column = 0; column < solution[row].length; column++) {

                    if (column == 8) {
                        System.out.print(" " + solution[row][column] + " ");
                    } else {
                        System.out.print(" " + solution[row][column] + " ");
                    }
                }
                System.out.print("= "+n);
                if(n == 45){
                    bool = true;
                    System.out.print(" ->"+bool);
                }
                else if(n != 45){
                    bool = false;
                    falseMemory = bool;
                    System.out.print(" ->"+bool);
                    System.out.print(" ->"+n);
                    System.out.println();
                }
                System.out.println();
                if(n==45 && row == 8 && falseMemory == true){
                    System.out.println("All rows are correct");
                }
                else if(falseMemory == false && row == 8){
                    System.out.println("Not all rows are correct");
                }
            }

        //}

        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //%%%%%% COLUMN EVALUATION FUNCTION %%%%%%%%
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        System.out.println();
        System.out.println();
        //for (int rowlimit=0; rowlimit <= 9; rowlimit++){
        System.out.println("column 1");
        int n = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {


            for (int column = 0; column < 1/*solution[row].length*/; column++) {
                n = n + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+n);
            if(n == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(n != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("column 2");
        int l = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {


            for (int column = 1; column < 2/*solution[row].length*/; column++) {
                l = l + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+l);
            if(l == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(l != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("column 3");
        int m = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 2; column < 3/*solution[row].length*/; column++) {
                m = m + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+m);
            if(m == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(m != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("column 4");
        int p = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 3; column < 4/*solution[row].length*/; column++) {
                p = p + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+p);
            if(p == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(p != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("column 5");
        int q = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 4; column < 5/*solution[row].length*/; column++) {
                q = q + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+q);
            if(q == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(q != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("column 6");
        int r = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 5; column < 6/*solution[row].length*/; column++) {
                r = r + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+r);
            if(r == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(r != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("column 7");
        int s = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 6; column < 7/*solution[row].length*/; column++) {
                s = s + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+s);
            if(s == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(s != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("column 8");
        int t = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 7; column < 8/*solution[row].length*/; column++) {
                t = t + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+t);
            if(t == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(t != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("column 9");
        int u = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 8; column < 9/*solution[row].length*/; column++) {
                u = u + solution[row][column];
                if (row == 8) {
                    System.out.print(" " + solution[row][column] + " ");
                } else {
                    System.out.print(" " + solution[row][column] + " +");
                }
            }
            System.out.print("= "+u);
            if(u == 45){
                bool = true;
                System.out.println(" "+bool);
            }
            else if(u != 45 && row == 8){
                bool = false;
                System.out.print(" ->"+bool);
                System.out.println();
            }
            System.out.println();
        }

        if(n==l&&n==m&&n==p&&n==q&&n==r&&n==s&&n==t&&n==u){
            System.out.println("All columns are correct");
        }

    }
}
