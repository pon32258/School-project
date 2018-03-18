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
public class RegisterDetail {
    
    private boolean studentPay;
    
    public RegisterDetail(boolean studentPay){
        this.studentPay=studentPay;
        
    }

    public boolean isStudentPay() {
        return studentPay;
    }

    public void setStudentPay(boolean studentPay) {
        this.studentPay = studentPay;
    }

    @Override
    public String toString() {
        return "RegisterDetail{" + "studentPay=" + studentPay + '}';
    }
    
    
    
}
