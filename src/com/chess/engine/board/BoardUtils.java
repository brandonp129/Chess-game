package com.chess.engine.board;



public class BoardUtils {

    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);

    public static final boolean[] SECOND_ROW = initRow(8);
    public static final boolean[] SEVENTH_ROW = initRow(48);

    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;

    private BoardUtils() {
        throw new RuntimeException("You cannot instantiate this");
    }
    public static boolean isValidTileCoordinate(final int coordinate) {

        return coordinate >= 0 && coordinate < 64;
    }

    public static boolean[] initColumn(int columnNumber) {
        final boolean[] column = new boolean[64];
        for (int i = columnNumber; i < 64; i += 8) {
            column[i] = true;
        }
        return column;
    }

    private  static boolean[] initRow(int rowNumber) {
        final boolean[] row = new boolean[NUM_TILES];
        while (rowNumber % NUM_TILES_PER_ROW != 0) {
            row[rowNumber] = true;
            rowNumber++;
        }
        return row;
    }
}
