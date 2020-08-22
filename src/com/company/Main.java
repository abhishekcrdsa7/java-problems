package com.company;

import javax.xml.stream.events.Characters;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int absDiff = Integer.MAX_VALUE;
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        int k  = s.nextInt();
//        int h = s.nextInt();
//        int temp = 1;
//        Queue<Integer> q = new LinkedList<>();
//        int head = s.nextInt();
//        q.add(head);
//        Map<Integer, ArrayList<Integer>> adj = new HashMap<>();
//        int tempNode = q.poll();
//        ArrayList<Integer> leafNodes = new ArrayList<>();
//        while(temp < h) {
//            adj.put(tempNode, new ArrayList<>());
//            for(int i = 0; i < temp; i++) {
//                int childA = s.nextInt();
//                int childB = s.nextInt();
//                if(childA != -1) {
//                    adj.get(tempNode).add(childA);
//                    if(temp == h - 1) {
//                        leafNodes.add(childA);
//                    }
//                }
//                if(childB != -1) {
//                    adj.get(tempNode).add(childB);
//                    if(temp == h - 1) {
//                        leafNodes.add(childA);
//                    }
//                }
//                tempNode = q.poll();
//            }
//            temp++;
//        }
//        int ans = 0;
//        for(int i = 0; i < leafNodes.size()-1; i++) {
//            for(int j = i+1; j < leafNodes.size(); j++) {
//                Set<Integer> visited = new HashSet<>();
//                if(bfs(adj, leafNodes.get(i), leafNodes.get(j), visited) <= k) {
//                    ++ans;
//                }
//            }
//        }
//        System.out.println(ans);

//        String[] a = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//        numUniqueEmails(a);

//        String[] a = {"+1E", "-1E", "+1E", "-1E", "+1E", "-1E", "+1E", "-1E","+2A", "-2A", "+2A", "-2A", "+2A", "-2A", "+2A",
//                "-2A","+2B", "-2B", "+2B", "-2B", "+2B", "-2B", "+2B", "-2B"};;
//        int[] b = {1,4,3,2,5};
//        for(int i : choose(b,4)) {
//            System.out.println(i);
//        }

        System.out.println(solve());
    }

    static Scanner s = new Scanner(System.in);

    static String keyboard = "";
    static String text = "";

    public static void testCase() {

        keyboard = s.nextLine();

        text = s.nextLine();

    }


    public static int solve() {

        testCase();

        Map<Character, Integer> m = new HashMap();


        for(int i = 0; i < keyboard.length(); i++) {
            m.put(keyboard.charAt(i), i);
        }

        int prevInd = 0;
        int totalTime = 0;
        for(int i = 0; i < text.length(); i++) {
            int currInd = m.get(text.charAt(i));
            totalTime += Math.abs(currInd - prevInd);
            prevInd = currInd;
        }
        return totalTime;
    }



//    class distance {
//        int x;
//        int y;
//        double distance;
//        distance(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//    public int[][] kClosest(int[][] points, int K) {
//        ArrayList<distance> d = new ArrayList<>();
//        for(int i = 0; i < points[0].length; i++) {
//            for(int j = 0; j < 2; j++) {
//                distance temp = new distance(points[0][i], points[1][i]);
//                temp.distance = calcDistance(points[0][i], points[1][i]);
//                d.add(temp);
//            }
//        }
//
//
//        Collections.sort(d, new Comparator<distance>() {
//            public int compare(distance o1, distance o2) {
//                if(o1.distance < o2.distance) {
//                    return -1;
//                } else if (o1.distance > o2.distance) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//
//        int[][] answer = new int[2][k];
//        for(int i = 0; i < k; i++) {
//            answer[0][i] = d.get(i).x;
//            answer[1][i] = d.get(i).y;
//        }
//        return answer;
//    }
//
//    public static double calcDistance(int x, int y) {
//        double sqX = x*x;
//        double sqY = y*y;
//
//        return (double)Math.sqrt(sqX+sqY);
//    }

//    public static int solve(int[] load) {
//        loadHelper(load, 0, 0, 0);
//        return absDiff;
//
//    }
//
//
//    public static void loadHelper(int[] a, int s1, int s2, int ind) {
//        if(ind >= a.length) {
//            absDiff = Math.min(Math.abs(s1-s2), absDiff);
//            return;
//        }
//        loadHelper(a, s1+a[ind], s2, ind+1);
//        loadHelper(a, s1, s2+a[ind], ind+1);
//    }



//    public static int solve(int[] load) {
//        int sum = 0;
//
//        for(int i : load) {
//            sum += i;
//        }
//
//        int[][] dp = new int[(int)Math.ceil(sum/2)+1][load.length];
//        loadHelper(load,dp);
//        int l1 = dp[dp.length-1][dp[0].length-1];
//        int l2 = sum - l1;
//        return Math.abs(l2 - l1);
//
//    }
//
//
//    public static void loadHelper(int[] a, int[][] dp) {
//        for(int i = 1; i < dp.length; i++) {
//            for(int j = 0; j < dp[0].length; j++) {
//                if(j-1 >= 0) {
//                    dp[i][j] = dp[i][j-1];
//                } else {
//                    if(a[j] <= i) {
//                        dp[i][j] = i;
//                    }
//                }
//                if(i-a[j] >= 0 && j-1 >= 0) {
//                    dp[i][j] = Math.max(dp[i][j], dp[i-a[j]][j-1]);
//                }
//            }
//        }
//    }
//
//    public static int[] choose(int[] a, int k) {
//        int lo = 0;
//        int hi = lo + k - 1;
//        int[] ans = new int[k];
//        for(int i = 0; i <= hi; i++) {
//            ans[i] = a[i];
//        }
//        ++hi;
//        ++lo;
//
//        while(hi < a.length) {
//            int temp = lo;
//            for(int i = 0; i < k; i++) {
//                if(ans[i] < a[temp]) {
//                    temp = lo;
//                    for(int j = 0; j < k; j++) {
//                        ans[j] = a[temp+j];
//                    }
//                } else if(ans[i] > a[temp]){
//                    hi++;
//                    lo++;
//                    break;
//                }
//                temp++;
//            }
//            hi++;
//            lo++;
//        }
//        return ans;
//    }
//
//
//    static Map<Integer, ArrayList<Integer>> adj = new HashMap();
//    static Set<Integer> del = new HashSet<>();
//    static Scanner s = new Scanner(System.in);
//    public static void testCase() {
//        int edges = s.nextInt();
//        int delayed = s.nextInt();
//        for(int i = 0; i < edges; i++) {
//            char left = s.next().charAt(0);
//            char right = s.next().charAt(0);
//            if(adj.containsKey((int)left)) {
//                adj.get((int)left).add((int)right);
//            } else {
//                ArrayList<Integer> temp = new ArrayList();
//                temp.add((int)right);
//                adj.put((int)left, temp);
//            }
//        }
//
//        for(int i = 0; i < delayed; i++) {
//            char pro = s.next().charAt(0);
//            del.add((int)pro);
//        }
//    }
//
//
//    public static void solve() {
//        int cases = s.nextInt();
//        int total = cases;
//        while(cases > 0) {
//            testCase();
//            for(int sv : adj.keySet()) {
//                if(!del.contains(sv)) {
//                    boolean d = dfs(sv);
//                    if(d) {
//                        del.add(sv);
//                    }
//                }
//            }
//
//
//            System.out.print("Case #"+(total-cases+1)+":");
//            ArrayList<Integer> forAns = new ArrayList();
//            for(int item : del) {
//                forAns.add(item);
//            }
//
//            Collections.sort(forAns);
//
//            for(int i = 0; i < forAns.size(); i++) {
//                char temp = (char)((int)forAns.get(i));
//                System.out.print(" "+ temp);
//            }
//
//            System.out.println();
//            del.clear();
//            adj.clear();
//            cases--;
//        }
//    }
//
//
//    public static boolean dfs(int sv) {
//        for(int i = 0; adj.containsKey(sv) && i < adj.get(sv).size(); i++) {
//            if(del.contains(adj.get(sv).get(i))) {
//                return true;
//            } else {
//                boolean temp = dfs(adj.get(sv).get(i));
//                if(temp) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


//    public static String solve (String[] r) {
//        Map<String, Integer> freq = new HashMap();
//        for(int i = 0; i < r.length; i++) {
//            if(r[i].charAt(0) == '+') {
//                String key = r[i].substring(1);
//                if(freq.containsKey(key)) {
//                    freq.put(key, freq.get(key)+1);
//                } else {
//                    freq.put(key, 1);
//                }
//            }
//        }
//
//        int currMax = -1;
//        String currMaxR = "";
//        for(String key : freq.keySet()) {
//            if(freq.get(key) >= currMax) {
//                if(freq.get(key) == currMax) {
//                    if(key.compareTo(currMaxR) == -1) {
//                        currMaxR = key;
//                    }
//                } else {
//                    currMaxR = key;
//                    currMax = freq.get(key);
//                }
//            }
//        }
//        return currMaxR;
//    }
//
//
//
//
//
//    public static int numUniqueEmails(String[] emails) {
//
//        Set<String> e = new HashSet();
//        for(int i = 0; i < emails.length; i++) {
//            //handle @
//            String domain = emails[i].substring(emails[i].indexOf("@"));
//
//            String splitted = emails[i].substring(0, emails[i].indexOf("+"));
//            if(splitted.contains(".")) {
//                String temp = "";
//                for(int j = 0; j < splitted.length(); j++) {
//                    if(splitted.charAt(j) != '.') {
//                        temp += splitted.charAt(j);
//                    }
//                }
//
//                e.add(temp+domain);
//            } else {
//
//                e.add(splitted+domain);
//            }
//        }
//        return e.size();
//    }
//
//    public static int solution (int[] p, int c1, int c2) {
//        int refill1 = 1;
//        int refill2 = 1;
//
//        int can1 = c1;
//        int can2 = c2;
//
//        int i = 0; int j = p.length-1;
//
//        while(i <= j) {
//            if(i == j) {
//                if(can1+can2 >= p[i] || can2 >= p[i] || can1 >= p[i]) {
//                    i++;
//                    j--;
//                    continue;
//                } else {
//                    refill1++;
//                }
//            }
//
//
//            if(p[i] > can1) {
//                refill1++;
//                can1 = c1 - p[i];
//                i++;
//            } else if(p[i] <= can1) {
//                can1 -= p[i];
//                i++;
//            }
//
//            if(p[j] > can2) {
//                refill2++;
//                can2 = c2 - p[j];
//                j--;
//            } else if(p[j] <= can2) {
//                can2 -= p[j];
//                j--;
//            }
//
//        }
//        return refill1+refill2;
//
//    }
//
//
//    public static  int minDominoRotations(int[] a, int[] b) {
//        int currMin;
//        int[] currA = a;
//        int answer = Integer.MAX_VALUE;
//        for(int i = 0; i < 2; i++) {
//            int currNum = currA[0];
//            currMin = 0;
//            for(int j = 1;  j < b.length; j++) {
//                if(currA[j] == currNum) {
//                    continue;
//                }
//
//                if(currNum == (currA == a ? b[j] : a[j])) {
//                    currMin++;
//                } else {
//                    currMin = -1;
//                    break;
//                }
//            }
//            if(currMin != -1) {
//                answer = Math.min(answer, currMin);
//            }
//
//            currA = b;
//        }
//        return answer == Integer.MAX_VALUE ? -1 : answer;
//    }
//
//
//    public static void maxSubarray(String s) {
//        if(s.length() < 1) {
//            System.out.println(0);
//        }
//        int currOrder = -1;
//        int count = 1;
//        for(int i = 0; i < s.length()-1; i++) {
//            int sub = s.charAt(i+1) - s.charAt(i);
//            if(currOrder == -1) {
//                //set the order
//                if(sub < 0) {
//                    currOrder = 0;
//                } else if(sub > 0) {
//                    currOrder = 1;
//                }
//            } else {
//                if(currOrder == 1 && sub < 0) {
//                    currOrder = -1;
//                    ++count;
//                } else if(currOrder == 0 && sub > 0) {
//                    currOrder = -1;
//                    ++count;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//
//
//
//
//
//
//    public static String reorganizeString(String s) {
//        Map<Character, Integer> cf = new HashMap();
//
//        for(int i = 0; i < s.length(); i++) {
//            if(cf.containsKey(s.charAt(i))) {
//                cf.put(s.charAt(i), cf.get(s.charAt(i))+1);
//            } else {
//                cf.put(s.charAt(i), 1);
//            }
//        }
//
//        String ans = "";
//        while(cf.size() > 0) {
//            int k = 1;
//            for(Map.Entry word : cf.entrySet()) {
//                ans = ans + word.getKey();
//                cf.put((Character) word.getKey(), cf.get(word.getKey())-1);
//
//                if(ans.length() >= 2 && ans.charAt(ans.length()-1) == ans.charAt(ans.length()-2)) {
//                    return "";
//                }
//
//                if(cf.get(word.getKey()) <= 0) {
//                    cf.remove(word.getKey());
//                    break;
//                }
//
//                --k;
//
//                if(k<0) {
//                    break;
//                }
//            }
//        }
//
//        return ans;
//    }





















//    public static List<String> topKFrequent(String[] words, int k) {
//        Map<String, Integer> freq = new HashMap<>();
//
//        for(int i = 0; i < words.length; i++) {
//            if(freq.containsKey(words[i])) {
//                freq.put(words[i], freq.get(words[i])+1);
//            } else {
//                freq.put(words[i], 1);
//            }
//        }
//
//        PriorityQueue<String> pq = new PriorityQueue<>(k, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(freq.get(o1) < freq.get(o2)) {
//                    return 1;
//                } else if(freq.get(o1) > freq.get(o2)) {
//                    return -1;
//                } else {
//                    return o1.compareTo(o2);
//                }
//            }
//        });
//
//        for(Map.Entry word : freq.entrySet()) {
//            pq.add((String)word.getKey());
//        }
//
//        List<String> answer = new ArrayList<>();
//        while(!pq.isEmpty() && k > 0) {
//            answer.add(pq.poll());
//            --k;
//        }
//
//        return answer;
//    }



//    public static int[][] merge(int[][] intervals) {
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] > o2[0]) {
//                    return 1;
//                } else if(o1[0] < o2[0]) {
//                    return -1;
//                }
//                return 0;
//            }
//        });
//
//        ArrayList<Integer[][]> array = new ArrayList();
//
//        Integer[][] a = new Integer[1][2];
//        a[0][0] = intervals[0][0];
//        a[0][1] = intervals[0][1];
//        array.add(a);
//        int currInterval = 0;
//        for(int i = 1; i < intervals.length; i++) {
//            if(intervals[i][0] <= array.get(currInterval)[0][1]) {
//                array.get(currInterval)[0][1] = Math.max(array.get(currInterval)[0][1], intervals[i][1]);
//            } else {
//                a = new Integer[1][2];
//                a[0][0] = intervals[i][0];
//                a[0][1] = intervals[i][1];
//                array.add(a);
//                currInterval++;
//            }
//        }
//
//        int[][] result = new int[array.size()][2];
//
//        for(int i = 0; i < result.length; i++) {
//            result[i][0] = array.get(i)[0][0];
//            result[i][1] = array.get(i)[0][1];
//        }
//        return result;
//    }

//    public int maxEvents(int[][] events) {
//        Arrays.sort(events, new Comparator<int[]>() {
//            public int compare(int[] o1, int[] o2) {
//                if(o1[1] < o2[1]) {
//                    return -1;
//                } else if(o1[1] > o2[1]) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        int output = 1;
//        int lastEvent = 0;
//        for(int i = 1; i < events.length; i++) {
//            if(events[i][1] < events[lastEvent][1]) {
//                ++output;
//                ++lastEvent;
//            }
//        }
//        return output;
//    }
//
//    public static List<Integer> partitionLabels(String s) {
//        Map<Character, Integer[]> charSE = new HashMap();
//        for(int i = 0; i < s.length(); i++) {
//            if(charSE.containsKey(s.charAt(i))) {
//                charSE.get(s.charAt(i))[1] = i;
//            } else {
//                Integer[] tempSE = {i,i};
//                charSE.put(s.charAt(i), tempSE);
//            }
//        }
//
//        ArrayList<Integer[]> se = new ArrayList();
//        for (Map.Entry<Character,Integer[]> entry : charSE.entrySet()) {
//            se.add(entry.getValue());
//        }
//
//        Collections.sort(se, new Comparator<Integer[]>() {
//            @Override
//            public int compare(Integer[] o1, Integer[] o2) {
//                if(o1[0] < o2[0]) {
//                    return -1;
//                } else if(o1[0] > o2[0]) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        List<Integer> output = new ArrayList<>();
//        output.add(se.get(0)[1]-se.get(0)[0]+1);
//        int currStart = 0;
//        int currEnd = se.get(0)[1];
//        for(int i = 1; i < se.size(); i++) {
//            if(se.get(i)[0] <= currEnd) {
//                currStart = Math.min(se.get(i)[0], currStart);
//                currEnd = Math.max(se.get(i)[1], currEnd);
//                output.set(output.size()-1, currEnd-currStart+1);
//            } else {
//                currStart = se.get(i)[0];
//                currEnd = se.get(i)[1];
//                output.add(currEnd-currStart+1);
//            }
//        }
//        return output;
//    }

//    public static int findLongestChain(int[][] pairs) {
//        int[] dp = new int[pairs.length];
//
//        Arrays.sort(pairs, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] < o2[0]) {
//                    return -1;
//                } else if (o1[0] > o2[0]) {
//                    return 1;
//                } else {
//                    if(o1[1] < o2[1]) {
//                        return -1;
//                    } else if(o1[1] > o2[1]) {
//                        return 1;
//                    } return 0;
//                }
//            }
//        });
//
//        dp[0] = 1;
//        int answer = 0;
//        for(int i = 0; i < dp.length; i++) {
//            int k = i-1;
//            int maxOutput = 1;
//            while(k >= 0) {
//                if(pairs[i][0] > pairs[k][1]) {
//                    maxOutput = Math.max(maxOutput, dp[k]+1);
//                }
//                --k;
//            }
//            dp[i] = maxOutput;
//            answer = Math.max(answer, dp[i]);
//        }
//        return answer;
//    }



//    public static int calculateMinimumHP(int[][] d) {
//        int[][] dp = new int[d.length][d[0].length];
//        if(d[d.length-1][d[0].length-1] < 0) {
//            dp[d.length-1][d[0].length-1] = Math.abs(d[d.length-1][d[0].length-1]) + 1;
//        } else {
//            dp[d.length-1][d[0].length-1] = 1;
//        }
//
//        for(int i = d.length-2; i >= 0; i--) {
//            if(dp[i+1][d[0].length-1] - d[i][d[0].length-1] < 0) {
//                dp[i][d[0].length-1] = 1;
//            } else {
//                dp[i][d[0].length-1] = dp[i+1][d[0].length-1] - d[i][d[0].length-1];
//            }
//        }
//
//        for(int i = d[0].length-2; i >= 0; i--) {
//            if(dp[d.length-1][i+1] - d[d.length-1][i] < 0) {
//                dp[d.length-1][i] = 1;
//            } else {
//                dp[d.length-1][i] = dp[d.length-1][i+1] - d[d.length-1][i];
//            }
//        }
//
//        for(int i = dp.length-2; i >= 0; i--) {
//            for(int j = dp[0].length-2; j >= 0; j--) {
//                int down = dp[i+1][j] - d[i][j];
//                int right = dp[i][j+1] - d[i][j];
//                int ans = Math.min(down, right);
//                if(ans < 0) {
//                    dp[i][j] = 1;
//                } else {
//                    dp[i][j] = ans;
//                }
//            }
//        }
//        return dp[0][0];
//    }



//    public static int orangesRotting(int[][] grid) {
//        int[][] dp = new int[grid.length][grid[0].length];
//        for(int i = 0; i < dp.length; i++) {
//            for(int j = 0; j < dp[0].length; j++) {
//                if(grid[i][j] == 0) {
//                    dp[i][j] = -1;
//                } else if(grid[i][j] == 2) {
//                    dp[i][j] = 0;
//                } else {
//                    dp[i][j] = Integer.MAX_VALUE;
//                }
//            }
//        }
//        int answer = Integer.MIN_VALUE;
//        for(int i = 0; i < grid.length; i++) {
//            for(int j = 0; j < grid[0].length; j++) {
//                              int x = j;
//                int y = i;
//                if(dp[y][x] == Integer.MAX_VALUE) {
//                    int[][] directions = {{x-1, y},{x, y-1},{x+1, y},{x, y+1}};
//                    int minValueForCell = Integer.MAX_VALUE;
//                    for(int k = 0; k < 4; k++) {
//                        int tempX = directions[k][0];
//                        int tempY = directions[k][1];
//                        if(canGo(grid, tempX, tempY)) {
//                            if(dp[tempY][tempX] >= 0 && dp[tempY][tempX] != Integer.MAX_VALUE) {
//                                minValueForCell = Math.min(minValueForCell, dp[tempY][tempX]+1);
//                            } else if(dp[tempY][tempX] == -1){
//                                continue;
//                            } else {
//                                boolean[][] visited = new boolean[grid.length][grid[0].length];
//                                int tempPath = findPath(grid, tempX, tempY, visited);
//                                if(tempPath != -1) {
//                                    minValueForCell = Math.min(tempPath+1, minValueForCell);
//                                }
//                            }
//                        }
//                    }
//                    if(minValueForCell != -1) {
//                        answer = Math.max(answer, minValueForCell);
//                        dp[i][j] = minValueForCell;
//                    } else {
//                        return -1;
//                    }
//                }
//            }
//        }
//
//        for(int i = 0; i < dp.length; i++) {
//            for(int j = 0; j < dp[0].length; j++) {
//                if(dp[i][j] == Integer.MAX_VALUE) {
//                    return -1;
//                }
//            }
//        }
//        if(answer == Integer.MIN_VALUE) return 0;
//        return answer;
//    }
//
//    public static int findPath(int[][] grid, int x, int y, boolean[][] visited) {
//
//        if(grid[y][x] == 2) {
//            return 0;
//        } else if(grid[y][x] == 0) {
//            return -1;
//        }
//
//        int[][] directions = {{x-1, y},{x, y-1},{x, y+1},{x+1, y}};
//        int ansSteps = -1;
//        visited[y][x] = true;
//        for(int k = 0; k < 4; k++) {
//            int tempX = directions[k][0];
//            int tempY = directions[k][1];
//            if(canGo(grid, tempX, tempY) && !visited[tempY][tempX]) {
//                int steps = findPath(grid, tempX, tempY, visited);
//                if(steps == -1) {
//                    continue;
//                } else if(steps >= 0) {
//                    if(ansSteps == -1) {
//                        ansSteps = steps+1;
//                    } else {
//                        ansSteps = Math.min(ansSteps, steps+1);
//                    }
//                }
//            }
//        }
//        return ansSteps;
//    }
//
//    public static boolean canGo(int[][] grid, int x, int y) {
//        if(x >= 0 && x < grid[0].length && y >= 0 && y < grid.length) {
//            return true;
//        }
//        return false;
//    }
}
