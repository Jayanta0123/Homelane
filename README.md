# Homelane hiring assignment
The application has a basic CRUD feature implemented on a set of notes. In other words, an user can read/write/update and delete a note.

# Softwares/Tools needed
1. Java 1.8
2. Maven 3.5 or higher
3. MySQL database to be installed (ver 5.7 or higher)

# Steps to run the application
1. Download the project, unzip and go to the root-directory of this unzipped folder.
2. Install MySQL database-server on your machine, installer available at this link - https://dev.mysql.com/downloads/mysql/5.7.html
3. Take a note of the root-password for your Mysql server.
4. Replace the password in the application.properties file, and put as a value for "spring.datasource.password" field.
5. Open a bash shell
6. Run *mvn clean install*
7. Run **java -jar target/HomeLane-1.0.0.jar**, you can press tab-key to select the proper file under "target/" folder   , filename starts with Home 
8. The application will run on port 6280. 

# Details about the API-endpoints
1. Create Note          ::  /api/newnote/   Http-type = POST
2. Select-All           ::  /api/allnotes/  Http-type = GET
3. Select-By-Id         ::  /api/note/id/{id} Http-type = GET
4. Select-By-Title      ::  /api/note/title/{title} Http-type = GET
5. Select-By-Importance ::  /api/note/level/{importance} Http-type = GET
6. Update Note          ::  /api/allnotes/id/{noteId}   Http-type = PUT
7. Delete Note          ::  /api/note/id/{noteId}   Http-type = DELETE
