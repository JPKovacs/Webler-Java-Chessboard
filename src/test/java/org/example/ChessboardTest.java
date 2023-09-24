package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessboardTest {


    private Chessboard chessboard;

    @BeforeEach
    void setUp() {
        chessboard = new Chessboard();
    }

    @Test
    void testCreateChessboard() {
        String expectedOutput =
                "W B W B W B W B \n" +
                        "B W B W B W B W \n" +
                        "W B W B W B W B \n" +
                        "B W B W B W B W \n" +
                        "W B W B W B W B \n" +
                        "B W B W B W B W \n" +
                        "W B W B W B W B \n" +
                        "B W B W B W B W \n";

        String result = chessboard.createChessboardFull(8);

        assertEquals(expectedOutput, result);

    }
}
