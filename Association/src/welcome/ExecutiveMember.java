/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package welcome;

/**
 *
 * @author Mestu
 */
public class ExecutiveMember {
    private String studentId;
    private String email;
    private String postName;
    private String startDate;
    private String endDate;

    public ExecutiveMember() {
    }
    

//========all getter method==============//
    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public String getPostName() {
        return postName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
//--------------------------------------------//
    
//=========all setter method============//

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
//--------------------------------------------//
    
}
