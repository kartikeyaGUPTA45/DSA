import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<String> paths = getMazePaths(1, 1, n, m);
    for (String path : paths) {
        System.out.println(path);
    }
}

public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    if (sr == dr && sc == dc) {
        ArrayList<String> baseList = new ArrayList<>();
        baseList.add("");
        return baseList;
    }

    ArrayList<String> paths = new ArrayList<>();

    // horizontal moves
    for (int h = 1; h <= dc - sc; h++) {
        ArrayList<String> hPaths = getMazePaths(sr, sc + h, dr, dc);
        for (String hPath : hPaths) {
            paths.add("h" + h + hPath);
        }
    }

    // vertical moves
    for (int v = 1; v <= dr - sr; v++) {
        ArrayList<String> vPaths = getMazePaths(sr + v, sc, dr, dc);
        for (String vPath : vPaths) {
            paths.add("v" + v + vPath);
        }
    }

    // diagonal moves
    for (int d = 1; d <= dr - sr && d <= dc - sc; d++) {
        ArrayList<String> dPaths = getMazePaths(sr + d, sc + d, dr, dc);
        for (String dPath : dPaths) {
            paths.add("d" + d + dPath);
        }
    }

    return paths;
}

}
