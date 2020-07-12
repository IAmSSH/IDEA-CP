package Codechef;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.IOException;
import java.io.InputStream;

class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];

    private int curChar;

    private int numChars;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (numChars == -1)
            throw new RuntimeException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new RuntimeException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public String readString() {
        final StringBuilder stringBuilder = new StringBuilder();
        int c = read();
        while (isSpaceChar(c))
            c = read();
        do {
            stringBuilder.append(c);
            c = read();
        } while (!isSpaceChar(c));
        return stringBuilder.toString();
    }

    public int readInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public long readLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}

public class PNTMSSNG {
	public static void main(String [] args) {
		int t;
		StringBuilder res = new StringBuilder();
//		Scanner kb = new Scanner(System.in);
		InputReader kb = new InputReader(System.in);
		t = kb.readInt();
		for (int c = 0; c < t; c++) {
			int n = kb.readInt();
			int x = 0, y = 0;
			HashMap<Integer, Integer> xCount = new HashMap<>();
			HashMap<Integer, Integer> yCount = new HashMap<>();
			for (int i = 0; i < 4*n-1; i++) {
				x = kb.readInt();
				y = kb.readInt();

				if (xCount.containsKey(x)) {
					xCount.put(x, xCount.get(x) + 1);
				}
				else {
					xCount.put(x, 1);
				}

				if (yCount.containsKey(y)) {
					yCount.put(y, yCount.get(y) + 1);
				}
				else {
					yCount.put(y, 1);
				}
			}

            for (Map.Entry<Integer, Integer> entry : xCount.entrySet()) {
                if (entry.getValue()%2 != 0) {
                    x = entry.getKey();
                    break;
                }
            }

            for (Map.Entry<Integer, Integer> entry : yCount.entrySet()) {
                if (entry.getValue()%2 != 0) {
                    y = entry.getKey();
                    break;
                }
            }

//			System.out.println(x + " " + y);
			res.append(x).append(" ").append(y).append('\n');
		}
		System.out.println(res);
	}
}