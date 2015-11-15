package com.hackerrank.algorithms.graphTheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShortestPath1 {
    public static final Scanner sc = new Scanner(System.in);
    public static int startPoint = 0;
    public static HashMap<Integer, ArrayList<Integer>> wayMap = new HashMap<Integer, ArrayList<Integer>>();
    public static ArrayList<ArrayList<Integer>> tracks = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<Integer> preDestination = new ArrayList<Integer>();

    public static void main(String[] args) {
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            graph();
            System.out.println();
        }
    }

    public static void graph(){
        int nodes = sc.nextInt(); //tops
        int edgex = sc.nextInt(); //connections
        for (int i = 0; i < edgex; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (wayMap.containsKey(x)) {
                ArrayList<Integer> list = wayMap.get(x);
                if (!list.contains(y)) {
                    list.add(y);
                    wayMap.put(x, list);
                }
            }
            else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(y);
                wayMap.put(x, list);
            }
            if (wayMap.containsKey(y)) {
                ArrayList<Integer> list = wayMap.get(y);
                if (!list.contains(x)) {
                    list.add(x);
                    wayMap.put(y, list);
                }
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(x);
                wayMap.put(y, list);
            }
        }
        startPoint = sc.nextInt();
                          // nodes
        for (int i = 1; i <= nodes; i++) {
            tracks.clear();
            fillPreDestinationPoints(i);
            buildTrack(startPoint, i, new ArrayList<Integer>(), 1, 5);
            if (getMinTrackLength() == 0)
                buildTrack(startPoint, i, new ArrayList<Integer>(), 1, -1);
            printPointResult(i);
        }
    }

    public static void buildTrack(int curentPoint, int destinationPoint, ArrayList<Integer> tempTrack, int level, int maxLvl) {
        int tempLvl = level;
        if (destinationPoint == curentPoint) return;

        if (tracks.size() == 0) tracks.add((ArrayList<Integer>)tempTrack.clone());
        if (!wayMap.containsKey(curentPoint)) return;
        if (level == 1 && !isGoalReachable(destinationPoint)) return;

        ArrayList<Integer> curTrack = new ArrayList<Integer>();
        ArrayList<Integer> path = wayMap.get(curentPoint);

        if (path.contains(destinationPoint)) {
            curTrack.addAll(tempTrack);
            curTrack.add(destinationPoint);
            tracks.add((ArrayList<Integer>)curTrack.clone());
            curTrack.clear();
            return;
        }

        for (int pre : preDestination) {
            if (path.contains(pre)) {
                curTrack.addAll(tempTrack);
                curTrack.add(pre);
                curTrack.add(destinationPoint);
                tracks.add((ArrayList<Integer>)curTrack.clone());
                curTrack.clear();
                return;
            }
        }

        if (level > maxLvl) return;

        for (int point : path) {
            int curTrackSize = tempTrack.size();
            int minTrackLength = getMinTrackLength();

            if (minTrackLength > 0 && curTrackSize >= (minTrackLength - 1))
                return;

            curTrack.clear();
            curTrack.addAll(tempTrack);

            if (curTrack.contains(point)) continue;
            if (point == startPoint) continue;

            if (point != destinationPoint)
            {
                if (point != startPoint && !curTrack.contains(point)) {
                    curTrack.add(point);
                    buildTrack(point, destinationPoint, (ArrayList<Integer>)curTrack.clone(), ++tempLvl, maxLvl);
                    tempLvl = level;
                }
            }
            else {
                curTrack.add(point);
                tracks.add((ArrayList<Integer>)curTrack.clone());
                curTrack.clear();
                return;
            }
        }
    }

    public static void printPointResult(int point) {
        if (tracks.size() == 0) return;

        int trackPointsCounter = -1;

        for (ArrayList<Integer> track : tracks) {
            if ((track.size() > 0 && trackPointsCounter > 0 && track.size() < trackPointsCounter)
                    || (track.size() > 0 && trackPointsCounter == -1))
                trackPointsCounter = track.size();
        }

        System.out.print(trackPointsCounter == -1 ? -1 + " " : trackPointsCounter * 6 + " ");
    }

    public static int getMinTrackLength() {
        if (tracks.size() == 0) return 0;
        int min = tracks.get(0).size();

        for (ArrayList<Integer> track : tracks) {
            if (track.size() < min && track.size() > 0)
                min = track.size();
            else if (min == 0 && track.size() > 0)
                min = track.size();
        }
        return min;
    }

    public static boolean isGoalReachable(int destination) {
        for (Map.Entry<Integer, ArrayList<Integer>> connections : wayMap.entrySet()) {
            if (connections.getValue().contains(destination)) return true;
        }
        return false;
    }

    public static void fillPreDestinationPoints(int point) {
        preDestination.clear();
        for (Map.Entry<Integer, ArrayList<Integer>> connections : wayMap.entrySet()) {
            if (connections.getValue().contains(point))
                preDestination.add(connections.getKey());
        }
    }
}
