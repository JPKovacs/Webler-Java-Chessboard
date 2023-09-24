package org.example;

public class Chessboard {
    public String createChessboardFull(int size) {
        String result = "";
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i + j) % 2 == 0) {
                    result = result + "W ";
                } else {
                    result = result + "B ";
                }
            }
            result = result + "\n";
        }
        System.out.println(result);
        return result;
    }
}