Write a Java program based on the following text:
It is necessary to create an information system that supports the work of foreign language schools. 
For each foreign language school, the name, year of establishment and web address are known. 
The web address must start with http:// or https:// and contain at least one period.
Each foreign language school keeps data on persons who can be lecturers and students. For each of them, the name, surname, contact phone number (must start with +381) and gender are known. For lecturers, the list remembers the languages ​​they teach, the number of years and whether they have previous work experience. While for students, information about the current level is important
education (primary school, secondary school, university) and whether they attend one or more foreign languages.
Foreign language schools also have owners. For the owner, the name, surname, email address (must contain @), age and number of years of service are remembered.
In order for schools to manage their employees more easily, it is necessary to provide a comparison of lecturers. We can compare teachers by the number of years, and if they have the same number of years, then they are compared by the number of languages ​​they teach. While we compare students by their current level of education (eg high school is a lower level than college).
It is necessary to implement the following methods:
A method that receives the current education level and returns all students who take multiple languages ​​and are at that current education level.
A method that calculates the average number of years of male lecturers who have previous work experience.
