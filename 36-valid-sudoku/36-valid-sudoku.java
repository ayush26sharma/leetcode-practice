class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i<9; i++){
            Set<Character> setCol = new HashSet<>();
            Set<Character> setrow = new HashSet<>();
            for (int j = 0; j<9; j++){
                if (board[i][j]!='.'){
                    if (setCol.contains(board[i][j])) return false;
                    else setCol.add(board[i][j]);
                }
            }
            for (int j = 0; j<9; j++){
                if (board[j][i]!='.'){
                    if (setrow.contains(board[j][i])) return false;
                    else setrow.add(board[j][i]);
                }
            }
        }
        int box = 0;
        while(box<9){
            Set<Character> setbox = new HashSet<>();
            if (box%3 == 0){
                System.out.println("box: " + box);
                for(int i = (box/3)*3; i <((box/3)*3) + 3; i++){
                    for(int j = 0; j<3; j++){
                        if (board[i][j]!='.'){
                            if (setbox.contains(board[i][j])) return false;
                            else setbox.add(board[i][j]);
                        }
                    }
                }
                System.out.println(setbox);
            }
            else if (box%3==1){
                System.out.println("box: " + box);
                for(int i = (box/3)*3; i<((box/3)*3) +3; i++){
                    for(int j = 3; j<6; j++){
                        if (board[i][j]!='.'){
                            if (setbox.contains(board[i][j])) return false;
                            else setbox.add(board[i][j]);
                        }
                    }
                }
                System.out.println(setbox);
            }
            else{
                 System.out.println("box: " + box);
                for(int i = (box/3)*3; i<((box/3)*3) +3; i++){
                    for(int j = 6; j<9; j++){
                        if (board[i][j]!='.'){
                            if (setbox.contains(board[i][j])) return false;
                            else setbox.add(board[i][j]);
                        }
                    }
                }
                System.out.println(setbox);
            }
            box++;
        }
        return true;
    }
}