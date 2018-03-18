/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author First
 */
public  class Person {
    private String name;
    private String surname;
    private String phone;
    private String mail;

    public Person(String name, String surname, String phone, String mail) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String toString(){
        return  "/nName=" + name + "    " + surname 
                + "/nPhone=" + phone + "/nMail=" + mail ;     
    }
}
