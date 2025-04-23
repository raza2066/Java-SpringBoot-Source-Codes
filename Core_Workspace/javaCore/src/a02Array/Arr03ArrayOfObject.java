package a02Array;

class Student{
    String Name;
    int rollNo;
}

public class Arr03ArrayOfObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Raza";
        s1.rollNo = 101;

        Student s2 = new Student();
        s2.Name = "Ayan";
        s2.rollNo = 102;

        Student s3 = new Student();
        s3.Name = "Tanveer";
        s3.rollNo = 103;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student st:students){
            System.out.println(st.Name + " : "+ st.rollNo);
        }

    }
}
