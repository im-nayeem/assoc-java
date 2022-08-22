package pojoClasses;


import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MemberInfo {
    private String name;
    private String id;
    private String email;
    private String phone;
    private String dept;
    private String session;
    private String batch;
    private String gender;
    private String bg;
    private byte[] photoByte;
    private ImageIcon photo;
    private String co_activity;
    private String fathersname;
    private String mothersname;
    private String present_area;
    private String present_details;
    private String permanent_upazila;
    private String permanent_details;
    private String tranc_no;
    
    public MemberInfo(){}

        
    public ImageIcon getPhoto(byte[] image) {
        Image img = new ImageIcon(image).getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDept() {
        return dept;
    }

    public String getSession() {
        return session;
    }

    public String getBatch() {
        return batch;
    }

    public String getGender() {
        return gender;
    }

    public String getBg() {
        return bg;
    }

    public byte[] getPhotoByte() {
        return photoByte;
    }

    public String getCo_activity() {
        return co_activity;
    }

    public String getFathersname() {
        return fathersname;
    }

    public String getMothersname() {
        return mothersname;
    }

    public String getPresent_area() {
        return present_area;
    }

    public String getPresent_details() {
        return present_details;
    }

    public String getPermanent_upazila() {
        return permanent_upazila;
    }

    public String getPermanent_details() {
        return permanent_details;
    }

    public String getTranc_no() {
        return tranc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public void setPhotoByte(byte[] photoByte) {
        this.photoByte = photoByte;
    }

    public void setCo_activity(String co_activity) {
        this.co_activity = co_activity;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    public void setMothersname(String mothersname) {
        this.mothersname = mothersname;
    }

    public void setPresent_area(String present_area) {
        this.present_area = present_area;
    }

    public void setPresent_details(String present_details) {
        this.present_details = present_details;
    }

    public void setPermanent_upazila(String permanent_upazila) {
        this.permanent_upazila = permanent_upazila;
    }

    public void setPermanent_details(String permanent_details) {
        this.permanent_details = permanent_details;
    }

    public void setTranc_no(String tranc_no) {
        this.tranc_no = tranc_no;
    }

    
    
    
}