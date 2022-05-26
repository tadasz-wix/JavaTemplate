import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastIO io = new FastIO(System.in, System.out);
        int n = io.getInt();
        io.println("Answer: " + n);
        io.close();
    }
}

/**
 * Example usage:
 * FastIO io = new FastIO(System.in, System.out);
 * while (io.hasMoreTokens()) {
 * int n = io.getInt();
 * double d = io.getDouble();
 * io.println("Answer: " + ans);
 * }
 * io.close();
 */

class FastIO extends PrintWriter {
    public FastIO(InputStream i) {
        super(new BufferedOutputStream(System.out));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public FastIO(InputStream i, OutputStream o) {
        super(new BufferedOutputStream(o));
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
        return peekToken() != null;
    }

    public int getInt() {
        return Integer.parseInt(nextToken());
    }

    public double getDouble() {
        return Double.parseDouble(nextToken());
    }

    public long getLong() {
        return Long.parseLong(nextToken());
    }

    public String getWord() {
        return nextToken();
    }

    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
        if (token == null) try {
            while (st == null || !st.hasMoreTokens()) {
                line = r.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            token = st.nextToken();
        } catch (IOException e) {
        }
        return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }
}

class Pair implements Comparable<Pair> {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int compareTo(Pair other) {
        if (this.first != other.first) {
            return this.first - other.first;
        }
        return this.second - other.second;
    }
}
