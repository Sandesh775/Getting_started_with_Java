/*
* /**
 * YOUR TASK:
 *
 * 1. Create custom exception: InvalidGradeException
 *    - extends Exception
 *    - has constructor with message
 *
 * 2. Create custom exception: StudentNotFoundException
 *    - extends Exception
 *    - has constructor with message
 *
 * 3. Modify StudentRepository:
 *    - add(Student s) throws InvalidGradeException
 *      → throw if grade < 0 or grade > 100
 *    - getById(int id) throws StudentNotFoundException
 *      → throw if id not found
 *
 * 4. In main():
 *    - Try adding student with grade 150
 *    - Catch InvalidGradeException, print message
 *    - Try getting student id 999
 *    - Catch StudentNotFoundException, print message
 *    - Add valid students, retrieve them successfully
 *
 * TIME LIMIT: 60 minutes
 */
public class ExceptionHandlingSystem {
}
class InvalidGradeException extends RuntimeException{
    public InvalidGradeException() {
    }

    public InvalidGradeException(String message) {
        super(message);
    }
}
class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException() {
    }

    public StudentNotFoundException(String message) {
        super(message);
    }
}