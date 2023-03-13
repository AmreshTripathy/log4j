package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=0310aa27-ae31-4a05-abcf-4201397be9bc
 * https://leetcode.com/problems/keys-and-rooms/description/
 */

import java.util.ArrayList;
import java.util.Scanner;

public class KeysAndRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j < m; j++) {
                temp.add(sc.nextInt());
            }
            r.add(temp);
        }

        sc.close();
        if(canVisitAllRooms(r))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static boolean canVisitAllRooms(ArrayList<ArrayList<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];

        dfs(0, visited, rooms);

        for (boolean room : visited) {
            if (!room)
                return false;
        }

        return true;
    }

    public static void dfs(int curr, boolean[] visited, ArrayList<ArrayList<Integer>> rooms) {
        visited[curr] = true;

        for (int nbr : rooms.get(curr)) {
            if (!visited[nbr])
                dfs(nbr, visited, rooms);
        }
    }
}
