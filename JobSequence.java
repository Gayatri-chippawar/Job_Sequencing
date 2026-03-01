package Greedy_Algo;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequence {
    public static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int[][] jobs = {{4,20},{1,20},{1,40},{1,30}};

        ArrayList<Job> job = new ArrayList<>();

        for (int i=0; i<jobs.length; i++){
            job.add(new Job(i,jobs[i][0],jobs[i][1]));
        }

        Collections.sort(job,(a,b)->b.profit-a.profit);//descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;

        for (int i=0; i<job.size(); i++){
            Job curr = job.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Maximum jobs "+seq.size()+" Sequence of jobs "+seq);
    }

}
