package com.association;

import org.jetbrains.annotations.NotNull;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

public class Utility {
    public  static  int getVerificationCode(){
       return   ThreadLocalRandom.current().nextInt(1111, 1000000 );
    }
    public static  String getAssocInitQuery(){
        return "CREATE TABLE varsity_info(\n" +
                "    varsity_name varchar(50),\n" +
                "    website_link varchar(30),\n" +
                "    dept varchar(3000),\n" +
                "    last_batch int(3)\n" +
                "    );\n" +
                "    \n" +
                "CREATE TABLE assoc_info(\n" +
                "    assoc_name varchar(100),\n" +
                "    assoc_abbr varchar(10),\n" +
                "    assoc_logo mediumblob,\n" +
                "    about varchar(2000),\n" +
                "    constitution mediumblob, #uploaded in pdf format\n" +
                "    email varchar(30), #association email address which will be used in verification\n" +
                "    pass varchar(20), #in-app password\n" +
                "    pay_details varchar(100),\n" +
                "    prsdnt_phone varchar(15),\n" +
                "    Gs_phone varchar(15)\n" +
                "    );\n" +
                "\n" +
                "\n" +
                "CREATE TABLE members(\n" +
                "    name varchar(30),\n" +
                "    id int UNIQUE not null,\n" +
                "    email varchar(30),\n" +
                "    phone varchar(15),\n" +
                "    dept varchar(40),\n" +
                "    session varchar(9),\n" +
                "    batch varchar(7),\n" +
                "    gender varchar(6),\n" +
                "    bg varchar(3),\n" +
                "    photo mediumblob,\n" +
                "    co_activity varchar(40),\n" +
                "    fathersname varchar(30),\n" +
                "    mothersname varchar(30),\n" +
                "    present_area varchar(30),\n" +
                "    present_details varchar(50),\n" +
                "    permanent_upazila varchar(30),\n" +
                "    permanent_details varchar(50),\n" +
                "    tranc_no varchar(20),\n" +
                "    PRIMARY KEY(id),\n" +
                "    FOREIGN key(email) REFERENCES account(email) on update cascade on DELETE CASCADE\n" +
                ");\n" +
                "CREATE TABLE verified(\n" +
                "    email varchar(30),\n" +
                "    id int not null,\n" +
                "    FOREIGN KEY(email) REFERENCES members(email) on UPDATE CASCADE on DELETE CASCADE,\n" +
                "    FOREIGN KEY(id) REFERENCES members(id) on update cascade on delete cascade\n" +
                "    );\n" +
                "CREATE table alumni(\n" +
                "    id int not null,\n" +
                "    email varchar(30) not null,\n" +
                "    occupation varchar(30),\n" +
                "    job_loc varchar(30),\n" +
                "    FOREIGN KEY(id) REFERENCES members(id) on update cascade on delete cascade,\n" +
                "    FOREIGN KEY(email) REFERENCES members(email) on update cascade on delete cascade\n" +
                ");\n" +
                "CREATE table exec_committee(\n" +
                "    committee_id int not null,\n" +
                "    from_time DATE,\n" +
                "    to_time DATE,\n" +
                "    PRIMARY key(committee_id)\n" +
                "    \n" +
                ");\n" +
                "CREATE table exec_member(\n" +
                "    id int not null,\n" +
                "    email varchar(30) not null,\n" +
                "    post varchar(40),\n" +
                "    committee_id int not null,\n" +
                "    FOREIGN KEY(committee_id) REFERENCES exec_committee(committee_id) on update cascade on delete cascade,\n" +
                "    FOREIGN KEY(id) REFERENCES members(id) on update cascade on delete cascade,\n" +
                "    FOREIGN KEY(email) REFERENCES members(email) on update cascade on delete cascade\n" +
                ");\n" +
                "CREATE table adviser(\n" +
                "    name varchar(30),\n" +
                "    email varchar(30),\n" +
                "    present_addr varchar(70),\n" +
                "    permanent_addr varchar(70), \n" +
                "    photo mediumblob,\n" +
                "    occupation varchar(50),\n" +
                "    from_time DATE,\n" +
                "    to_time DATE,\n" +
                "    FOREIGN KEY(email) REFERENCES account(email) on UPDATE CASCADE on DELETE CASCADE\n" +
                "    );\n" +
                "\n" +
                "\n" +
                "CREATE TABLE media(\n" +
                "    media_id int unique not null auto_increment,\n" +
                "    photo1 mediumblob,\n" +
                "    caption1 varchar(1000),\n" +
                "    photo2 mediumblob,\n" +
                "    caption2 varchar(1000),\n" +
                "    photo3 mediumblob,\n" +
                "    caption3 varchar(1000),\n" +
                "    video_link varchar(1000),\n" +
                "    Primary key(media_id)\n" +
                ");\n" +
                "CREATE TABLE gallery(\n" +
                "\tid int unique not null,\n" +
                "\tshort_desc varchar(1000),\n" +
                "\thighlights tinyint(1),"+
                "\tForeign key(id) references media(media_id) on update cascade on delete cascade\n" +
                "\t\n" +
                "\t);\n" +
                "    \n" +
                "    \n" +
                "CREATE TABLE news(\n" +
                "    news_id int UNIQUE not null AUTO_INCREMENT,\n" +
                "    media_id int unique not null,\n" +
                "    headline varchar(1000),\n" +
                "    details varchar(3000),\n" +
                "    footer varchar(500),\n" +
                "    post_date DATE,\n" +
                "    Primary key(news_id),\n" +
                "   Foreign key(media_id) references media(media_id) on update cascade on delete cascade\n" +
                ");\n" +
                "Create table notice(\n" +
                "   notice_id int UNIQUE not null AUTO_INCREMENT,\n" +
                "    headline varchar(1000),\n" +
                "    details varchar(3000),\n" +
                "    footer varchar(500),\n" +
                "    post_date DATE,\n" +
                "    Primary key(notice_id)\n" +
                ");\n" +
                "Create table Culture (\n" +
                "    culture_id int unique not null auto_increment,\n" +
                "    media_id int unique not null,\n" +
                "    headline varchar(1000),\n" +
                "    details varchar(3000),\n" +
                "    label varchar(10),\n" +
                "    PRIMARY KEY(culture_id),\n" +
                "    Foreign key(media_id) references media(media_id) on update cascade on delete cascade\n" +
                "    \n" +
                ");";
    }
    public static String getBaseUrl(HttpServletRequest request) {
        String scheme = request.getScheme() + "://";
        String serverName = request.getServerName();
        String serverPort = (request.getServerPort() == 80) ? "" : ":" + request.getServerPort();
        String contextPath = request.getContextPath();
        return scheme + serverName + serverPort + contextPath;
    }

    public static String inputStreamToString( InputStream inpStream)
    {
        if(inpStream==null)
            return "";
        try{

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            byte[] buffer = new byte[8192];
            int length;
            while ((length = inpStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.flush();


            String base64Image = Base64.getEncoder().encodeToString(outputStream.toByteArray());
            return base64Image;



        }
        catch(Exception e)
        {
            throw  new RuntimeException(e.getMessage());
        }

    }
}
