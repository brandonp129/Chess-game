package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Move;
import com.chess.engine.board.Board;

import java.util.Collection;



public class Piece {

    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final boolean isFirstMove;


    Piece(final int piecePosition, final Alliance pieceAlliance) {

        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
        //TODO there is more work to do here
        this.isFirstMove = false;
    }

    public boolean isFirstMove() {
        return this.isFirstMove;
    }

    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }

    public Collection<Move> calculateLegalMoves(final Board board) {
        return null;
    }


}
