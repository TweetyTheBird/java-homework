package fourclasswork.school;

public class Students {

    private String name;
    private int fnum;
    private int avgGrade;

    public Students(String name, int fnum, int avgGrade) {
        this.name = name;
        this.fnum = fnum;
        this.avgGrade = avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getAvgGrade() {
        return this.avgGrade;
    }
}
