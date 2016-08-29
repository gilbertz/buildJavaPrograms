package com.company;

/**
 * Created by zhao on 16/7/31.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        List<Interval> ret = new ArrayList<>();
        Interval pre = null;
        for(Interval inter:intervals){
            if(pre == null || inter.start > pre.end){
                ret.add(inter);
                pre = inter;
            }else if(pre.end<inter.end){
                pre.end = inter.end;
            }
        }
        return ret;
    }
}