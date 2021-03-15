package com.HackerRank;
import java.util.*;
import java.util.ArrayList;

class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    //Complete the code

// class comaprison implements Comparator<Student>{
//
//    @Override
//    public int compare(Student student, Student t1) {
//        if (st)
//    }
//}

    public class sortt
    {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);

                testCases--;
            }
            studentList.sort(Comparator.comparing(Student::getCgpa).reversed()
                    .thenComparing(Student::getFname).thenComparing(Student::getId));


            for(Student st: studentList){
                System.out.println(st.getFname());
            }
        }
    }
    //5
//33 Rumpa 3.68
//85 Ashis 3.85
//56 Samiha 3.75
//19 Samara 3.75
//22 Fahim 3.76







