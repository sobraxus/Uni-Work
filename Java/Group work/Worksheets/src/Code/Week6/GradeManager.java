package Code.Week6;
public class GradeManager {

    double[] grades; //Creates array "grades"=

    public GradeManager(int gradeCount) {

        grades = new double[gradeCount];
    }

    public int size() {
        return grades.length;
    }

    public void set(int student, double grade) {
        grades[student] = grade;

    }

    public double getGrade(int index) {
        return grades[index];
    }

    public double lowestGrade() {
        double grade = grades[0];
        for (int i = 0; i < size(); i++) {
            if (grade > getGrade(i)) {
                grade = getGrade(i);
            }
        }
        return grade;
    }

    public double highestGrade(){
        double grade = grades[0];
        for (int i = 1; i < size(); i++) {
            if (grade < getGrade(i)) {
                grade = getGrade(i);
            }
        }
        return grade;
    }

    public double averageGrade() {
        double grade = 0;
        for (int i = 0; i < size(); i++) {
            grade += getGrade(i);
        }
        return grade / size();
    }

    public String allGgrades() {
        String grade = "[ ";
        for (int i = 0; i < size(); i++) {
            if (i < size() - 1) {
                grade += getGrade(i) + " , ";
            } else {
                grade += getGrade(i);
            }
        }
        grade += " ]";
        return grade;
    }

    public void replaceGrade(int index, double newGrade){
        set(index,newGrade);
    }

}
