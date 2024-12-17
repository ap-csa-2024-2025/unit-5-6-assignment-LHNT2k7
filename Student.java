public class Student
{
  private int ID;
  private int grade;
  private String name;

  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    this.id = input_id;
    this.grade = input_grade;
    this.name = input_name;
  }

  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }

  // Make getters
  public String getBreed()
  {
    return breed;
  }
  

  
  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }
}
