package ru.mirea.task9;
import java.util.*;

public interface Comparator {
    void sortStudents (ArrayList<Student> Students,  int leftBorder, int rightBorder);
    ArrayList<Student> getStudents ();
    void setStudents(ArrayList<Student> students);
}

class SortingStudentsByGPA implements Comparator {
    private ArrayList<Student> Students;
    public SortingStudentsByGPA(ArrayList<Student> Students) {
        this.Students = Students;
    }

    @Override
    public ArrayList<Student> getStudents() {
        return Students;
    }

    @Override
    public void setStudents(ArrayList<Student> students) {
        Students = students;
    }

    @Override
    public void sortStudents(ArrayList<Student> Students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = Students.get((leftMarker + rightMarker) / 2).getMarks();
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (Students.get(leftMarker).getMarks() < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (Students.get(rightMarker).getMarks() > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = Students.get(leftMarker);
                    Students.set(leftMarker, Students.get(rightMarker));
                    Students.set(rightMarker, tmp);
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            sortStudents(Students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            sortStudents(Students, leftBorder, rightMarker);
        }
    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "Students=" + Students +
                '}';
    }
}

class TestComparator {
    public static void main(String[] args) {
        ArrayList<Student> iDNumber = new ArrayList<>();
        iDNumber.add(new Student("Максим", "Степанов", "КАБО-02-22", 18, 5));
        iDNumber.add(new Student("Влад", "Степанов", "КАБО-02-22", 13, 2));
        iDNumber.add(new Student("Никита", "Степанов", "КАБО-02-22", 14, 3));
        iDNumber.add(new Student("Семён", "Степанов", "КАБО-02-22", 15, 4));
        Comparator mStudents = new SortingStudentsByGPA(iDNumber);
        for(Student x : mStudents.getStudents()) {
            System.out.println(x);
        }
        mStudents.sortStudents(mStudents.getStudents(), 0, mStudents.getStudents().size()-1);
        Collections.reverse(mStudents.getStudents()); System.out.println();
        for(Student x : mStudents.getStudents()) {
            System.out.println(x);
        }
    }
}