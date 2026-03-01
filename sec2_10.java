package day2;

class College {
    private String collegeName;
    private int totalStudents;

    College(String collegeName, int totalStudents) {
        this.collegeName = collegeName;
        this.totalStudents = totalStudents;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getTotalStudents() {
        return totalStudents;
    }
}

public class sec2_10 {
    public static void main(String[] args) {
        College col = new College("XYZ University", 5000);
        System.out.println(col.getCollegeName() + " has " + col.getTotalStudents() + " students.");
    }
}