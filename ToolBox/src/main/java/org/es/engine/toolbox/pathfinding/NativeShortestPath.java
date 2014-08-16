package org.es.engine.toolbox.pathfinding;

import android.graphics.Point;

import java.util.ArrayList;

/**
 * Created by Cyril on 16/08/14.
 */
public class NativeShortestPath {

    static {
        System.loadLibrary("PathFinding");
    }

    /**
     * Calculate the shortest path from a start node and a goal node.
     *
     * @return The list of the shortest path the wave will take.
     */
    public native ArrayList<Point> nativeFindShortestPath(int startX, int startY, int goalX, int goalY, int[][] tiles);

    /**
     * Calculate the shortest path from a start node and a goal node.
     *
     * @return The list of the shortest path the wave will take.
     */
    public ArrayList<Point> findShortestPath(int startX, int startY, int goalX, int goalY, int[][] tiles) {
        return nativeFindShortestPath(startX, startY, goalX, goalY, tiles);
    }
}
