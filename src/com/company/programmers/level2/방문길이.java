package com.company.programmers.level2;

class Position {
    int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 방문길이 {

    public static void main(String[] args) {
        Position position = new Position(0, 0);
        String dirs = "ULURRDLLU";
        for (char ch : dirs.toCharArray()) {
            if (ch == 'U') {
                if (position.y <5){
                    position.y++;
                }
            } else if (ch == 'L') {
                position.x--;
            } else if (ch =='R') {
                position.x++;
            } else {
                position.y--;
            }
        }

    }
}
