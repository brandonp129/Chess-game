package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public abstract class Move {

    final Board board;
    final Piece movedPiece;
    final int destionationCoordinate;

    Move(final Board board, final Piece movedPiece, final int destionationCoordinate) {
        this.board = board;
        this.movedPiece = movedPiece;
        this.destionationCoordinate = destionationCoordinate;
    }

    public static final class MajorMove extends Move{
        public MajorMove(Board board, Piece movedPiece, final int destinationCoordinate) {
            super(board, movedPiece, destinationCoordinate);
        }
    }

    public static final class AttackMove extends Move {

        final Piece attackedPiece;

        public AttackMove(final Board board, final Piece movedPiece, final int destinationCoordinate,
                   final Piece attackedPiece) {
            super(board, movedPiece, destinationCoordinate);
            this.attackedPiece = attackedPiece;
        }
    }


}
