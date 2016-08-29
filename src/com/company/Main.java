package com.company;

import  java.util.*;

/**
 * Created by zhao on 16/7/17.
 */
class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] aar = new int[26];
        int count = 0;
        scanner.nextLine();
        Map<Integer,List<Integer>> a = new HashMap<>();
        Map<Integer,List<Integer>> b = new HashMap<>();
        for(int i = 0;i < n;i++){
//            System.out.println(i);
            String line = scanner.nextLine();
            int last = -1;
            int flag = -1;
            for(int j = 0;j < line.length();j++){
                if(line.charAt(j)-'0' >= 0 && line.charAt(j)-'0' <= 9){
                    int k = j+1;
                    while(k < line.length() && line.charAt(k)-'0' >= 0 && line.charAt(k)-'0' <= 9){
                        k++;
                    }
                    int tmp = Integer.parseInt(line.substring(j,k)) + 26;
                    j = k-1;
                    if(last == -1) last = tmp;
                    else{
                        if(flag == 0) {
                            List<Integer> t = null;
                            if(a.containsKey(last)) t = a.get(last);
                            else{
                                t = new ArrayList<>();
                            }
                            t.add(tmp);
                            a.put(last,t);
                            last = tmp;
                        }
                        else {
                            List<Integer> t = null;
                            if(b.containsKey(last)) t = b.get(last);
                            else{
                                t = new ArrayList<>();
                            }
                            t.add(tmp);
                            b.put(last,t);
                            last = tmp;
                        }
                    }

                }
                else if(line.charAt(j)-'A' >= 0 && line.charAt(j)-'A' < 26){
                    if(aar[line.charAt(j)-'A'] == 0) count++;
                    aar[line.charAt(j)-'A']++;
                    int tmp = line.charAt(j)-'A';
                    if(last == -1) last = tmp;
                    else{
                        if(flag == 0) {
                            List<Integer> t = null;
                            if(a.containsKey(last)) t = a.get(last);
                            else{
                                t = new ArrayList<>();
                            }
                            t.add(tmp);
                            a.put(last,t);
                            last = tmp;
                        }
                        else {
                            List<Integer> t = null;
                            if(b.containsKey(last)) t = b.get(last);
                            else{
                                t = new ArrayList<>();
                            }
                            t.add(tmp);
                            b.put(last,t);
                            last = tmp;
                        }
                    }
                }
                else{
//                    System.out.println(j+1);
                    if(line.charAt(j+1) == '=') {flag = 1;j++;}
                    else flag = 0;
                }
            }

        }

        int m = scanner.nextInt(); Map<Integer,Integer> map = new HashMap<>();
        scanner.nextLine();
        for(int e = 0;e < m;e++) {
            map.clear();
            for (int j = 0; j < count; j++) {
                String line = scanner.nextLine();
                String[] tmp = line.split(" ");
                map.put(tmp[0].charAt(0) - 'A', Integer.parseInt(tmp[1]));
            }


            boolean ff = true;
            for (Map.Entry<Integer, List<Integer>> entry : a.entrySet()) {

                if (true) {
                    List<Integer> t = entry.getValue();
                    int one = entry.getKey();
                    if (one >= 26) one -= 26;
                    else one = map.get(one);

                    for (int i = 0; i < t.size(); i++) {
                        int two = t.get(i);
                        if (two >= 26) two -= 26;
                        else {
                            if (!map.containsKey(two)) continue;
                            two = map.get(two);
                        }
                        if (one >= two) {
                            ff = false;
                            break;
                        }
                    }

                }

            }

            for (Map.Entry<Integer, List<Integer>> entry : b.entrySet()) {

                if (true) {
                    List<Integer> t = entry.getValue();
                    int one = entry.getKey();
//                    System.out.println(one);
                    if (one >= 26) one -= 26;
                    else one = map.get(one);

                    for (int i = 0; i < t.size(); i++) {
                        int two = t.get(i);
                        if (two >= 26) two -= 26;
                        else {
                            if (!map.containsKey(two)) continue;
                            two = map.get(two);
                        }
                        if (one > two) {
                            ff = false;
                            break;
                        }
                    }

                }

            }
            if(ff) System.out.println("Yes");
            else System.out.println("No");
        }



    }
}
