package OOP-autograding-quiz

/**
 * Student class.
 *
 * TASK: Complete every section marked TODO below.
 * Do not change the class name, method names, or method signatures —
 * the autograder calls them exactly as defined here.
 */
public class Student {

    // TODO: add fields: studentId (String), name (String), gpa (double)
    public String studentId;
    public String name;
    public double gpa;


    /**
     * Student constructor.
     *
     * @param studentId Student identification number
     * @param name      Student's full name
     * @param gpa       Grade Point Average (0.0 - 4.0)
     */
    public Student(String studentId, String name, double gpa) {
        // TODO: store parameters into fields
       this.studentId = studentId;
       this.name = name;
       this.gpa = gpa;
    }

    public String getStudentId() {
        // TODO: return studentId
       return studentId;
    }

    public String getName() {
        // TODO: return name
        return name;
    }

    public double getGpa() {
        // TODO: return gpa
        return gpa;
    }

    /**
     * Determines the graduation predicate based on GPA:
     * - gpa >= 3.5           -> "Cum Laude"
     * - 3.0 <= gpa < 3.5     -> "Very Satisfactory"
     * - gpa < 3.0            -> "Satisfactory"
     *
     * @return graduation predicate
     */
    public String getPredicate() {
        // TODO: implement the predicate logic per the rules above
        if (gpa >= 3.5) {
           return "Cum Laude";
        }
        if (gpa <= 3.5 ) {
            return "Very Satisfactory";
        }
        if (gpa < 3.0) {
            return "Satisfactory";
        }
        
    }
}
