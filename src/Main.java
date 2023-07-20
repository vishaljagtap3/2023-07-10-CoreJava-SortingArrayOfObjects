public class Main {
    public static void main(String[] args) {

        Student [] students = new Student[5];

        students[0] = new Student(34, "Vaibhav", 71);
        students[1] = new Student(56, "Swapnil", 80);
        students[2] = new Student(16, "Kartik", 54);
        students[3] = new Student(90, "Priya", 72);
        students[4] = new Student(12, "Aditi", 90);

        for(int i = 0; i < students.length; i++) {
            students[i].display();
        }
        System.out.println();

        int passes = students.length - 1;
        int comps = students.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(students[j].getRoll() > students[j+1].getRoll()) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < students.length; i++) {
            students[i].display();
        }
        System.out.println();

        //by name
        passes = students.length - 1;
        comps = students.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(students[j].getName().compareTo(students[j+1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < students.length; i++) {
            students[i].display();
        }
        System.out.println();

        ////////////////////////////////////////////////////////////

        int [] nos = {34, 56, 12, 89, 39, 22, 59, 9};

        for(int i = 0; i < nos.length; i++) {
            System.out.print(nos[i] + " ");
        }
        System.out.println();

        passes = nos.length - 1;
        comps = nos.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(nos[j] > nos[j+1]) {
                    int temp = nos[j];
                    nos[j] = nos[j+1];
                    nos[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < nos.length; i++) {
            System.out.print(nos[i] + " ");
        }
        System.out.println();
    }
}
