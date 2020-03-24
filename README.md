# springboot-course-api
Currently I am learning rest api development using spring boot. Here I am going to follow javabrains.io Spring Boot Quick Start course. 

Before jumping into the actual programming it is important to define some thing, it will be helpful to organize and maintain project in the long run.

- Naming convention
	- Project: All lower case separated by dash(-): springboot-course-api 
	- Package: Starting with reserve domain name and ending with project name in lower case without any special characters: com.nadimemon.springbootcourseapi
	- Class: Class name should be noun and PascalCase, java build in classes also follows PascalCase: HashMap, Student, StudentController
	- Interface: Like class name interface name should also be in PascalCase but here it is not restricted to noun, adjective is recommended over noun. Interface name should be in generalized form, like Student, Course.
	- Variable: Variable name should be noun and camelCase. Boolean variable can contain only true/false value hence it should start with is or has: isActive, hasArchieved
	- Constand variable: Constant variable value is fixed, they are not changeable. It is recommanded to highlight them using all uppercase letters: UPPER_CASE, DB_TIMEOUT
	- Method: Method name should be verb and camelCase. getCourseByTopicId()


- Project structure: There is no specific project structure to follow, it is highly depends on the specific requirements. However there are two popular ways to structure the application. One is feature base and other is common tasks base.
	- Feature base: Create separate package for each feature and add all items related to that feature.
	- Type based: Create separate package for each type, like controller, dao, service. In this application I am going to follow this structure though the actual course is folloing other structure.
	
	
