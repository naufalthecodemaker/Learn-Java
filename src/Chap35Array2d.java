

public class Chap35Array2d {
    public static void main(String[] args){
        // 2D array => useful for storing a matrix of data


        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[0][0] = "pineapple"; // replace apple with pineapple

        for(String[] foods : groceries){ // for every array of foods in groceries array, do this code
            for(String food : foods){ // for every food in foods array, do this code
                System.out.print(food + " ");
            }
            System.out.println();
        }


        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
