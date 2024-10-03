package com.chess.engine.board;

public class BoardUtils {

    private BoardUtils() {
        throw new RuntimeException("YOu cannot instantiate this");
    }
    public static boolean isValidTileCoordinate(int coordinate) {

        return coordinate >= 0 && coordinate < 64;
    }
}
