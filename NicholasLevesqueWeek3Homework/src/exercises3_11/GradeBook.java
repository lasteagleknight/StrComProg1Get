package exercises3_11;
// Lab 2: GradeBook.java
// GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String profName;		//prof name  for this GradeBook
   /*- write code to declare a second String instance variable */

   // constructor initializes courseName with String supplied as argument
   public GradeBook( String name, String instructor ) 
   {  
      courseName = name; // initializes courseName
      profName = instructor;//initializes profName
      
   } // end constructor 

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName
   
   public void setInstructorName( String instructor )
   {
	   profName = instructor;//store the prof name
   }
 
   public String getInstructorName()
   {
	   return profName;
   }

   /* write code to declare a get and a set method for the instructor’s name */

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
      
      System.out.printf("This course is presented by: %s",
    		  getInstructorName() );
      /* write code to output the instructor’s name */
   } // end method displayMessage

} // end class GradeBook