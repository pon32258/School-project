/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Witchapon-Pc
 */
public class Register {
    
    private int registerId;
    private String dateStrat;
    private String dateEnd;
    private int studentMax;
    private double price;
    private String courceHours;

    public Register(int registerId, String dateStrat, String dateEnd, int studentMax, double price, String courceHours) {
        this.registerId = registerId;
        this.dateStrat = dateStrat;
        this.dateEnd = dateEnd;
        this.studentMax = studentMax;
        this.price = price;
        this.courceHours = courceHours;
    }
    
    
    public int getRegisterId() {
        return registerId;
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public String getDateStrat() {
        return dateStrat;
    }

    public void setDateStrat(String dateStrat) {
        this.dateStrat = dateStrat;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getStudentMax() {
        return studentMax;
    }

    public void setStudentMax(int studentMax) {
        this.studentMax = studentMax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCourceHours() {
        return courceHours;
    }

    public void setCourceHours(String courceHours) {
        this.courceHours = courceHours;
    }

    @Override
    public String toString() {
        return "Register{" + "registerId=" + registerId + ", dateStrat=" + dateStrat + ", dateEnd=" + dateEnd + ", studentMax=" + studentMax + ", price=" + price + ", courceHours=" + courceHours + '}';
    }
    
    
    
}
