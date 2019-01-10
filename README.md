# Homelane hiring assignment
The application has a basic CRUD feature implemented on a set of notes. In other words, an user can read/write/update and delete a note.

# Softwares/Tools needed
1. Java 1.8
2. Maven 3.5 or higher
3. MySQL database to be installed (ver 5.7 or higher)

# Steps to run the application
1. Download the project, unzip and go to the root-directory of this unzipped folder.
2. Open a bash shell
3. Run *mvn clean install*
4. Run **java -jar target/HomeLane-1.0.0.jar**, you can press tab-key to select the proper file under "target/" folder   , filename starts with Home 
5. The application will run on port 6280. 

# Details about the API-endpoints
1. Create Note          ::  /api/newnote/   Http-type = POST
2. Select-All           ::  /api/allnotes/  Http-type = GET
3. Select-By-Id         ::  /api/note/id/{id} Http-type = GET
4. Select-By-Title      ::  /api/note/title/{title} Http-type = GET
5. Select-By-Importance ::  /api/note/level/{importance} Http-type = GET
6. Update Note          ::  /api/allnotes/id/{noteId}   Http-type = PUT
7. Delete Note          ::  /api/note/id/{noteId}   Http-type = DELETE
