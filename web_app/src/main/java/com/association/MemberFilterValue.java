/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.association;

import java.util.Vector;

/**
 *
 * @author Mestu
 */
public class MemberFilterValue {
    private Vector<String>deptList = new Vector<>();
    private Vector<String>sessionList = new Vector<>();
    private Vector<String>presentAreaList = new Vector<>();
    private Vector<String>permanentUpazilaList = new Vector<>();

    public MemberFilterValue() {
    }
    
    void addToDeptList(String dept){
        this.deptList.add(dept);
    }
    void addToSessionList(String session){
        this.sessionList.add(session);
    }
    void addToPresentAreaList(String presentArea){
        this.presentAreaList.add(presentArea);
    }
    void addToPermanentUpazilaList(String permanentUpazila){
        this.permanentUpazilaList.add(permanentUpazila);
    }

    public Vector<String> getDeptList() {
        return deptList;
    }

    public Vector<String> getSessionList() {
        return sessionList;
    }

    public Vector<String> getPresentAreaList() {
        return presentAreaList;
    }

    public Vector<String> getPermanentUpazilaList() {
        return permanentUpazilaList;
    }
    
}
