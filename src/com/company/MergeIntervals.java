package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zhao on 16/7/25.
 */
public class MergeIntervals {
    public static void main(String args[]){
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(5,6));
        list.add(new Interval(1,4));
        mergeIntervals.merge(list);
    }
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval obj0, Interval obj1) {
                return obj0.start - obj1.start;
            }
        });

        List<Interval> ret = new ArrayList<>();
        Interval prev = null;
        for (Interval inter : intervals) {
            if (  prev==null || inter.start>prev.end ) {
                ret.add(inter);
                prev = inter;
            } else if (inter.end>prev.end) {
                // Modify the element already in list
                prev.end = inter.end;
            }
        }
        return ret;
    }

}




