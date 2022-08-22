/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import java.sql.ResultSet;

/**
 * AssocMember the model class containing single member's info
 * @author Nayeem
 */
public class AssocMember {
    private String name;
    private String id;
    private String email;
    // all info variables are here...complete this
    
    
    /**
     * Constructor
     * @param singleResult containing single member info
     */
    public AssocMember(ResultSet singleResult)
    {
                //use it for RegisteredListModel

        
        
        // if you find better replacemet for ResultSet then replace it,try to find better idea
    }
    
    
    
    
    /**
     * Constructor retrieve all info of member from db and store in class member variables
     * @param id the id of the member to retrieve info from DB
     */
    public AssocMember(String id){
        //for further use,dont't touch this contructor
        //retrieve info from db and store here
    }
    
    
    
    
    /*=============getter methods=============*/
    
    /*-------------------------------------*/
}
