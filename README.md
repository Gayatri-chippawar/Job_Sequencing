# 🗂️ Job Sequencing Problem (Greedy Algorithm)
## 📌 Problem Statement

Given a set of jobs where each job has:

A deadline

A profit

Each job takes 1 unit of time, and only one job can be executed at a time.

The objective is to maximize the number of jobs completed within their deadlines while prioritizing higher profit jobs.

## 🧠 Algorithm Used

This solution uses the Greedy Algorithm approach.

Strategy:

Store all jobs with:

Job ID

Deadline

Profit

Sort jobs in descending order of profit

Pick jobs one by one:

If the job’s deadline allows scheduling, select it

Otherwise, skip it

Print total selected jobs and their sequence

## ⚙️ Implementation Details

Language: Java

Data Structures Used:

ArrayList

Collections.sort()

Time Complexity:

O(n log n)

(Because of sorting)

Space Complexity:

O(n)
📂 Input Example
int[][] jobs = {
    {4,20},
    {1,20},
    {1,40},
    {1,30}
};

Where:

Deadline	Profit
4	20
1	20
1	40
1	30
✅ Output
Maximum jobs 2 Sequence of jobs [2, 0]
## 🔎 How It Works

Jobs are sorted by profit → [40, 30, 20, 20]

Highest profit jobs are selected first.

Only jobs that satisfy deadline constraint are added.

## 🚀 Key Concepts Covered

Greedy Strategy

Sorting with Comparator

Job Scheduling Optimization

Basic Scheduling Logic

## 📖 Learning Outcome

Understand how greedy algorithms make locally optimal choices.

Learn how sorting plays a crucial role in optimization problems.

Practice scheduling problems commonly asked in coding interviews.
