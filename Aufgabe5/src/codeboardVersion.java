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

        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%%%% ENTIRE PRINT FUNCTION %%%%%%%%
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        System.out.println();
        //System.out.println("+---------+---------+---------+");
        
        for (int row=0; row < solution.length; row++){
            if(row % 3 == 0){
                System.out.println("+---------+---------+---------+");
            }
            for (int column=0; column < solution[row].length; column++){
                if (column % 3 == 0){
                    System.out.print("|");
                }
                System.out.print(" "+solution[row][column]+" ");
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
        
        boolean allRowsAreOk = true;
        
                    for (int row=0; row < solution.length; row++) {
        
                        int n = 0;
                        for (int column = 0; column < solution[row].length; column++) {
                            n = n + solution[row][column];
                        }
                        
                        if(n != 45){
                            System.out.println("Sum of row "+row+" is wrong. Sum is: "+ n);
                            allRowsAreOk = false;
                        }
                    }
                    
                    if(allRowsAreOk) {
                        System.out.println("All rows are correct");
                    }

        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //%%%%%% COLUMN EVALUATION FUNCTION %%%%%%%%
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        boolean bool=true;
        //%%%%%% COLUMN 0 %%%%%%%%
        System.out.println();
        System.out.println();
        int nz = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {


            for (int column = 0; column < 1/*solution[row].length*/; column++) {
                nz = nz + solution[row][column];
            }
            if(nz == 45){
                bool = true;
            }
            else if(nz != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 0 is wrong. Sum is: "+nz);
            }
            System.out.println();
        }

        //%%%%%% COLUMN 1 %%%%%%%%
        int l = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {


            for (int column = 1; column < 2/*solution[row].length*/; column++) {
                l = l + solution[row][column];
            }
            if(l == 45){
                bool = true;
            }
            else if(l != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 1 is wrong. Sum is: "+l);
            }
            System.out.println();
        }

        //%%%%%% COLUMN 2 %%%%%%%%
        int m = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 2; column < 3/*solution[row].length*/; column++) {
                m = m + solution[row][column];
            }
            if(m == 45){
                bool = true;
            }
            else if(m != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 2 is wrong. Sum is: "+m);
            }
            System.out.println();
        }

        //%%%%%% COLUMN 3 %%%%%%%%
        int p = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 3; column < 4/*solution[row].length*/; column++) {
                p = p + solution[row][column];
            }
            if(p == 45){
                bool = true;
            }
            else if(p != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 3 is wrong. Sum is: "+p);
            }
            System.out.println();
        }
        
        //%%%%%% COLUMN 4 %%%%%%%%
        int q = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 4; column < 5/*solution[row].length*/; column++) {
                q = q + solution[row][column];
            }
            if(q == 45){
                bool = true;
            }
            else if(q != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 4 is wrong. Sum is: "+q);
            }
            System.out.println();
        }

        //%%%%%% COLUMN 5 %%%%%%%%
        int r = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 5; column < 6/*solution[row].length*/; column++) {
                r = r + solution[row][column];
            }
            if(r == 45){
                bool = true;
            }
            else if(r != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 5 is wrong. Sum is: "+r);
            }
            System.out.println();
        }

        //%%%%%% COLUMN 6 %%%%%%%%
        int s = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 6; column < 7/*solution[row].length*/; column++) {
                s = s + solution[row][column];
            }
            if(s == 45){
                bool = true;
            }
            else if(s != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 6 is wrong. Sum is: "+s);
            }
            System.out.println();
        }

        //%%%%%% COLUMN 7 %%%%%%%%
        int t = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 7; column < 8/*solution[row].length*/; column++) {
                t = t + solution[row][column];
            }
            if(t == 45){
                bool = true;
            }
            else if(t != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 7 is wrong. Sum is: "+t);

            }
            System.out.println();
        }

        //%%%%%% COLUMN 8 %%%%%%%%
        int u = 0;
        for (int row=0; row < 9 /*solution.length*/; row++) {

            for (int column = 8; column < 9/*solution[row].length*/; column++) {
                u = u + solution[row][column];
            }
            if(u == 45){
                bool = true;
            }
            else if(u != 45 && row == 8){
                bool = false;
                System.out.println("Sum of column 8 is wrong. Sum is: "+u);

            }
            System.out.println();
        }

        if(45==nz&&45==l&&45==m&&45==p&&45==q&&45==r&&45==s&&45==t&&45==u){
            System.out.println("All columns are correct");
        }
        
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%%%% 3X3 PRINT / COUNT %%%%%%%%%%%%
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        //%%%%%%%%%%% BLOCK 1 %%%%%%%%%%%%%%%%%%%%
        int g=0;
        for (int row=0; row < 3/*solution.length*/; row++){
            for (int column=0; column < 3/*solution[row].length*/; column++){
                g = g + solution[row][column]; // add all numbers of an array
            }
        }
        if(g!=45){
            System.out.println("Sum of block rows: 0-2, columns: 0-2 is wrong. Sum is: "+g);
        }
        System.out.println();

        //%%%%%%%%%%% BLOCK 2 %%%%%%%%%%%%%%%%%%%%
        int h=0;
        for (int row=0; row < 3 /*solution.length*/; row++){
            for (int column=3; column < 6/*solution[row].length*/; column++){
                h = h + solution[row][column]; // add all numbers of an array
            }
        }
        if(h != 45){
            System.out.println("Sum of block rows: 3-5, columns: 0-2 is wrong. Sum is: "+h);
        }
        System.out.println();

        //%%%%%%%%%%% BLOCK 3 %%%%%%%%%%%%%%%%%%%%
        int k=0;
        for (int row=0; row < 3 /*solution.length*/; row++){
            for (int column=6; column < 9/*solution[row].length*/; column++){
                k = k + solution[row][column]; // add all numbers of an array
            }
        }
        if(k != 45){
            System.out.println("Sum of block rows: 6-8, columns: 0-2 is wrong. Sum is: "+k);
        }
        System.out.println();

        //%%%%%%%%%%% ROW TWO %%%%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%%%% BLOCK 4 %%%%%%%%%%%%%%%%%%%%
        int f = 0;
        for (int row=3; row < 6 /*solution.length*/; row++){
            for (int column=0; column < 3/*solution[row].length*/; column++){
                f = f + solution[row][column]; // add all numbers of an array
            }
        }
        if(f != 45){
            System.out.println("Sum of block rows: 0-2, columns: 3-5 is wrong. Sum is: "+f);
        }
        System.out.println();

        //%%%%%%%%%%% BLOCK 5 %%%%%%%%%%%%%%%%%%%%
        int b=0;
        for (int row=3; row < 6 /*solution.length*/; row++){
            for (int column=3; column < 6/*solution[row].length*/; column++){
                b = b + solution[row][column]; // add all numbers of an array
            }
        }
        if(b != 45){
            System.out.println("Sum of block rows: 3-5, columns: 3-5 is wrong. Sum is: "+b);
        }
        System.out.println();

        //%%%%%%%%%%% BLOCK 6 %%%%%%%%%%%%%%%%%%%%
        int a=0;
        for (int row=3; row < 6 /*solution.length*/; row++){
            for (int column=6; column < 9/*solution[row].length*/; column++){
                a = a + solution[row][column]; // add all numbers of an array
            }
        }
        if(a != 45){
            System.out.println("Sum of block rows: 6-8, columns: 3-5 is wrong. Sum is: "+a);
        }
        System.out.println();

        //%%%%%%%%%%% ROW THREE %%%%%%%%%%%%%%%%%%%%
        //%%%%%%%%%%% BLOCK 7 %%%%%%%%%%%%%%%%%%%%
        int n = 0;
        for (int row=6; row < 9 /*solution.length*/; row++){
            for (int column=0; column < 3/*solution[row].length*/; column++){
                    n = n + solution[row][column]; // add all numbers of an array
            }
        }
        if(n != 45){
            System.out.println("Sum of block rows: 2-0, columns: 6-8 is wrong. Sum is: "+n);
        }
        System.out.println();

        //%%%%%%%%%%% BLOCK 8 %%%%%%%%%%%%%%%%%%%%
        int c=0;
        for (int row=6; row < 9 /*solution.length*/; row++){
            for (int column=3; column < 6/*solution[row].length*/; column++){
                c = c + solution[row][column]; // add all numbers of an array
            }
        }
        if(c != 45){
            System.out.println("Sum of block rows: 3-5, columns: 6-8 is wrong. Sum is: "+c);
        }

        //%%%%%%%%%%% BLOCK 9 %%%%%%%%%%%%%%%%%%%%
        int d=0;
        for (int row=6; row < 9 /*solution.length*/; row++){
            for (int column=6; column < 9/*solution[row].length*/; column++){
                d = d + solution[row][column]; // add all numbers of an array
            }
        }
        if(d != 45){
            System.out.println("Sum of block rows: 6-8, columns: 0-2 is wrong. Sum is: "+d);
        }
        System.out.println();

        if (d==45&&c==45&&n==45&&a==45&&b==45&&f==45&&k==45&&h==45&&g==45){
            System.out.println("All blocks are correct");
        }

    }
}
