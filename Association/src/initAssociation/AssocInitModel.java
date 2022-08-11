
package initAssociation;

import association.Association;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.prefs.Preferences;

/**
 *
 * @author Nayeem
 */
public class AssocInitModel {
    private String dbAddr;
    private String dbUserName;
    private String dbPass;
    private AssocInfo assocInfo;
    private VarsityInfo varsityInfo;
    

    public AssocInitModel() {
       
    }

  
    public String createDatabaseTables(String dbAddr,String dbUserName,String dbPass)
    {
         this.dbAddr="jdbc:mysql://"+dbAddr+"?allowMultiQueries=true";
         this.dbUserName=dbUserName;
         this.dbPass=dbPass;
         String query=getFirstQuery();
         
                 
        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection conn = (Connection)DriverManager.getConnection(this.dbAddr, dbUserName, dbPass);
             Statement st = conn.createStatement();
             st.execute(query);
             st.close();
        } 
        catch (ClassNotFoundException e) {
            return "Could't connect with Database";
        }
        catch(SQLException ex){
            return "Couldn't Connect With Database,SQL Exception!";
        }
        
        
        return "Successfully Connected With Database";     
    }
    

//<editor-fold defaultstate="collapsed" desc="mehtods to store in Preferences and DB">
    public void storeInPreferences(){
        Preferences prefs=Preferences.userNodeForPackage(Association.class);
        prefs.put("dbAddr", dbAddr);
        prefs.put("dbUserName", dbUserName);
        prefs.put("dbPass", dbPass);

    }
    
    public void storeVarsityInfo(VarsityInfo varsityInfo){
        
    }
    
    public void storeAssocInfo(AssocInfo assocInfo){
        
    }
//</editor-fold>
 
    
      private String getFirstQuery(){
          
            return "CREATE TABLE varsity_info(\n" +
"    varsity_name varchar(50),\n" +
"    website_link varchar(20),\n" +
"    dept JSON,\n" +
"    last_batch int(3)\n" +
"    );\n" +
"    \n" +
"CREATE TABLE assoc_info(\n" +
"    assoc_name varchar(100),\n" +
"    assoc_logo mediumblob,\n" +
"    about varchar(2000),\n" +
"    constitution mediumblob, #uploaded in pdf format\n" +
"    email varchar(20), #association email address which will be used in verification\n" +
"    pass varchar(16), #in-app password\n" +
"    pay_details varchar(100),\n" +
"    prsdnt_phone int(11),\n" +
"    gs_phone int(11)\n" +
"    );\n" +
"\n" +
"\n" +
"CREATE TABLE members(\n" +
"    name varchar(30),\n" +
"    id int,\n" +
"    email varchar(30) UNIQUE not null,\n" +
"    pass varchar(30),\n" +
"    phone int(11),\n" +
"    dept varchar(40),\n" +
"    session varchar(9),\n" +
"    batch varchar(7),\n" +
"    gender varchar(6),\n" +
"    bg varchar(3),\n" +
"    photo mediumblob,\n" +
"    co_activity varchar(40),\n" +
"    fathersname varchar(30),\n" +
"    mothersname varchar(30),\n" +
"    present_area varchar(15),\n" +
"    present_details varchar(40),\n" +
"    permanent_upazila varchar(15),\n" +
"    permanent_details varchar(30),\n" +
"    tranc_no varchar(15),\n" +
"    PRIMARY KEY(id)  );\n" +
"    \n" +
"    \n" +
"\n" +
"CREATE TABLE verified(\n" +
"    id int not null,\n" +
"    email varchar(30) not null,\n" +
"    is_alumni boolean,\n" +
"    is_exec boolean,\n" +
"    was_exec boolean,\n" +
"    FOREIGN KEY(id) REFERENCES members(id) on update cascade on delete cascade,\n" +
"    FOREIGN KEY(email) REFERENCES members(email) on update cascade on delete cascade\n" +
");\n" +
"CREATE table alumni(\n" +
"    id int not null,\n" +
"    email varchar(30) not null,\n" +
"    occupation varchar(30),\n" +
"    job_loc varchar(30),\n" +
"    FOREIGN KEY(id) REFERENCES members(id) on update cascade on delete cascade,\n" +
"    FOREIGN KEY(email) REFERENCES members(email) on update cascade on delete cascade\n" +
");\n" +
"CREATE table exec_member(\n" +
"    id int not null,\n" +
"    email varchar(30) not null,\n" +
"    from_time varchar(10),\n" +
"    to_time varchar(10),\n" +
"    FOREIGN KEY(id) REFERENCES members(id) on update cascade on delete cascade,\n" +
"    FOREIGN KEY(email) REFERENCES members(email) on update cascade on delete cascade\n" +
");\n" +
"CREATE table advisor(\n" +
"    name varchar(30),\n" +
"    email varchar(30),\n" +
"    pass varchar(20),\n" +
"    present_addr varchar(30),\n" +
"    permanent_addr varchar(30), \n" +
"    photo mediumblob,\n" +
"    occupation varchar(30),\n" +
"    from_time varchar(10),\n" +
"    to_time varchar(10),\n" +
"    PRIMARY KEY(email)\n" +
"    );\n" +
"\n" +
"CREATE TABLE media(\n" +
"	Media_id int unique not null auto_increment,\n" +
"    headline varchar(700),\n" +
"    photo1 mediumblob,\n" +
"    caption1 varchar(500),\n" +
"    photo2 mediumblob,\n" +
"    caption2 varchar(500),\n" +
"    photo3 mediumblob,\n" +
"    caption3 varchar(500),\n" +
"    video longblob,\n" +
"    video_caption varchar(500),\n" +
"    details varchar(2500),\n" +
"    in_gallery boolean,\n" +
"    in_highlights boolean,\n" +
"    in_culture boolean,\n" +
"    label varchar(50),\n" +
"\n" +
"	primary key(media_id)\n" +
");\n" +
"    \n" +
"    \n" +
"CREATE TABLE notice(\n" +
"    notice_id int UNIQUE not null AUTO_INCREMENT,\n" +
"    headline varchar(700),\n" +
"    details varchar(2500),\n" +
"    footer varchar(500),\n" +
"    in_headline boolean\n" +
");";
      }
      
    
}
