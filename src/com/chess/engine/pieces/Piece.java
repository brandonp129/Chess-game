package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Move;
import com.chess.engine.board.Board;

import java.util.Collection;
import java.util.Collections;


public class Piece {

    protected final PieceType pieceType;
    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final boolean isFirstMove;


    Piece( final PieceType pieceType, final Alliance pieceAlliance, final int piecePosition) {

        this.pieceType = pieceType;
        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
        //TODO there is more work to do here
        this.isFirstMove = false;
    }

    public boolean isFirstMove() {
        return this.isFirstMove;
    }

    public PieceType getPieceType() {
        return this.pieceType;
    }

    public Alliance getPieceAlliance() {

        return this.pieceAlliance;
    }

    public Collection<Move> calculateLegalMoves(final Board board) {

        return Collections.emptyList();
    }


    public int getPiecePosition() {

        return this.piecePosition;
    }

    public enum PieceType {

        PAWN("P") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        KNIGHT("N") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        BISHOP("B") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        ROOK("R") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        QUEEN("Q") {
            @Override
            public boolean isKing() {
                return false;
            }
        },
        KING("K") {
            @Override
            public boolean isKing() {
                return true;
            }
        };

        private String pieceName;

        PieceType(final String pieceName) {

            this.pieceName = pieceName;
        }

        @Override
        public String toString() {

            return this.pieceName;
        }

        public abstract boolean isKing();
    }
}
