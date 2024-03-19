package com.codecool.draughts;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(10);
        System.out.println(board);
        board.initBoard();
        System.out.println(board);
    }
}