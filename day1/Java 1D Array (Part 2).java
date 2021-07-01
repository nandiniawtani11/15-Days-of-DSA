public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(0, leap, game);
    }

    private static boolean isSolvable(int pos, int leap, int[] game) {
        //base
        if (pos < 0 || game[pos] == 1){
            return false;
        }
        else if(pos + leap >= game.length || pos == game.length - 1){
            return true;
        }
        game[pos] = 1;

        return isSolvable(pos + 1, leap, game)
                || isSolvable(pos + leap, leap, game)
                || isSolvable(pos - 1, leap, game);

    }
