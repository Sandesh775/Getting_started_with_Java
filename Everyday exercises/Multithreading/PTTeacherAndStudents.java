// Create a SchoolAssembly system where:
// - 10 students arrive at different times
// - Each student joins the line and WAITS
// - Teacher checks if all students are present
// - When all 10 are present, teacher blows whistle
// - Teacher calls notifyAll() to start ALL students
// - Each student prints: "Student X is marching..."

// Expected Behavior:
// Student 1 joined the line and waiting...
// Student 2 joined the line and waiting...
// ...
// Teacher: All students present! Blowing whistle...
// Student 1: Marching...
// Student 2: Marching...
public class PTTeacherAndStudents {
    public static void main(String[] args) {  // ✅ Fixed main signature
        Teacher teacher = new Teacher();

        // Create 10 students, all sharing the SAME teacher
        for(int i = 1; i <= 10; i++) {
            new Student(teacher, i).start();
            try { Thread.sleep(500); } catch (Exception e) {} // Students arrive with delay
        }

        // Start teacher thread
        teacher.start();
    }
}

class Teacher extends Thread {
    int studentCount = 0;
    final int TOTAL_STUDENTS = 10;
    boolean whistleBlown = false;

    // Student calls this when they arrive
    public synchronized void studentArrived(int studentId) {
        studentCount++;
        System.out.println("Student " + studentId + " joined the line and waiting... (Total: " + studentCount + "/10)");

        while (!whistleBlown) {
            try {
                wait();  // Student waits for teacher's whistle
            } catch (InterruptedException e) {}
        }

        // Whistle blown, student marches
        System.out.println("Student " + studentId + " is marching... 🏃‍♂️");
    }

    // Teacher checks and blows whistle when all present
    public void run() {
        try {
            // Wait until all 10 students arrive
            while (studentCount < TOTAL_STUDENTS) {
                Thread.sleep(1000);  // Check every second
            }

            // All students present!
            System.out.println("\n📢 Teacher: All " + TOTAL_STUDENTS + " students present! Blowing whistle...\n");
            blowWhistle();

        } catch (InterruptedException e) {}
    }

    // Blow whistle and wake up ALL waiting students
    public synchronized void blowWhistle() {
        whistleBlown = true;
        notifyAll();  // Wake up ALL waiting students
    }
}

class Student extends Thread {
    Teacher teacher;
    int id;

    Student(Teacher teacher, int id) {
        this.teacher = teacher;
        this.id = id;
    }

    public void run() {
        teacher.studentArrived(id);
    }
}