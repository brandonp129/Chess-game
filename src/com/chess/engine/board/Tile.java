package com.chess.engine.board;


import com.chess.engine.pieces.Piece;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class Tile {


    protected final int tileCoordinate;
    private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = createdAllPossibleEmptyTiles();

    private static Map<Integer, EmptyTile> createdAllPossibleEmptyTiles() {

        final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();

        for (int i = 0; i < BoardUtils.NUM_TILES; i++) {
            emptyTileMap.put(i, new EmptyTile(i));
        }

        return Collections.unmodifiableMap(emptyTileMap);

    }

    public static Tile createTile(final int tileCoordinate, final Piece piece) {
        if (piece != null) {
            return new OccupiedTile(tileCoordinate, piece);
        } else {
            return EMPTY_TILES_CACHE.get(tileCoordinate);
        }
    }


    private Tile(int tileCoordinate) {

        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile {

        private EmptyTile(int coordinate) {
            super(coordinate);
        }

        @Override
        public String toString() {
            return "-";
        }

        @Override
        public boolean isTileOccupied() {

            return false;
        }

        @Override
        public Piece getPiece() {

            return null;
        }
    }

    public static final class OccupiedTile extends Tile {
        private final Piece pieceOnTile;

        private OccupiedTile(int tileCoordinate, Piece pieceOnTile) {
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public String toString() {
            return getPiece().getPieceAlliance().isBlack() ? toString().toLowerCase() : toString();
        }



        @Override
        public boolean isTileOccupied() {

            return true;
        }

        @Override
        public Piece getPiece() {
            return
                    this.pieceOnTile;
        }
    }
}
