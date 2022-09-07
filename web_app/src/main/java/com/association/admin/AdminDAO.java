package com.association.admin;

import com.association.AssocInfo;
import com.association.VarsityInfo;
import com.association.database.DatabaseConnection;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
public class AdminDAO {
    private DatabaseConnection conn;
    public AdminDAO(){
        conn = new DatabaseConnection();
    }
    public void storeAssocInfo(AssocInfo assocInfo){

    }
    public void storeVarsityInfo(VarsityInfo varsityInfo){

    }
}
