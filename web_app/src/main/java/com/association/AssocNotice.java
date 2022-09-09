/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.association;

/**
 *
 * @author Mestu
 */
public class AssocNotice {
    private String headline;
    private String details;
    private String footer;
    private String publicationDate;
    private String noticeId;

    public AssocNotice() {
    }

// <editor-fold defaultstate="collapsed" desc="Notice getter method. Click on the + sign on the left to edit the code.">
//--------------------all getter method-----------------//
    public String getHeadline() {
        return headline;
    }

    public String getDetails() {
        return details;
    }

    public String getFooter() {
        return footer;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getNoticeId() {
        return noticeId;
    }
//------------------------------------------------------//
//    </editor-fold>
    
// <editor-fold defaultstate="collapsed" desc="Notice setter method. Click on the + sign on the left to edit the code.">
//--------------------all setter method-----------------//
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }
    
//------------------------------------------------------//
//</editor-fold>
    
    
}
