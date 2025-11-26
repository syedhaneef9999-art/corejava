package net.konic.corejava.methods;


public class StudentMarks {

    int totalMarks(int s1, int s2, int s3) {
        int total = s1 + s2 + s3;
        System.out.println(total);
        return total;
    }

    double averageMarks(double total, double subjects) {
        double avg = total / subjects;
        System.out.println(avg);
        return avg;
    }

    boolean isPass(int total) {
        boolean pass = total >= 150;
        System.out.println(pass);
        return pass;
    }

    char grade(double avg) {
        char g;
        if(avg >= 90) g = 'A';
        else if(avg >= 75) g = 'B';
        else if(avg >= 60) g = 'C';
        else g = 'F';

        System.out.println(g);
        return g;
    }

    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();

        sm.totalMarks(60, 70, 80);
        sm.averageMarks(210, 3);
        sm.isPass(210);
        sm.grade(75);
    }
}
