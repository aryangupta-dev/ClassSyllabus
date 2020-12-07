/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/7/2020
 *   Time: 7:49 PM
 *   File: Student.java
 */

package Stream;

import java.util.Objects;

public class Student {
    public int rollNo;
    public float cpi;
    public String studentName;

    public float getCpi() {
        return cpi;
    }

    public void setCpi(float cpi) {
        this.cpi = cpi;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo &&
                Float.compare(student.cpi, cpi) == 0 &&
                Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, cpi, studentName);
    }

    @Override
    public String toString() {
        return String.format("%d %s %.2f", rollNo, studentName, cpi);
    }
}