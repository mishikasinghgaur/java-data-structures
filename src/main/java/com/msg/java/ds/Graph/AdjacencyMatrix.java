package com.msg.java.ds.Graph;

import java.util.Random;

public class AdjacencyMatrix {

    private static final String NEWLINE = System.getProperty("line.separator");
    private final int V;
    private int E;
    private boolean[][] adjMatrix;

    public AdjacencyMatrix(int V) {
        if(V<0){
            throw new IllegalArgumentException("Too few vertices");
        }
        this.V = V;
        this.E = 0;
        this.adjMatrix = new boolean[V][V];
    }

    public AdjacencyMatrix(int V, int E) {
        this(V);
        if (E > ((long) V * (V-1)/2+V)) throw new IllegalArgumentException("Too many edges");
        if(E < 0) throw new IllegalArgumentException("Too few edges");

        Random rnd = new Random();

    }
}
