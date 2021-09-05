/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StudentDetails {

    private int sum;
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int  id;
    private String name ,gn1,gn2,gn3,gn4,gn5;
    private double grn1,grn2,grn3,grn4,grn5;
    private String email;
    private String mobile;
    String grade;

    public StudentDetails() {
       
    }

    public StudentDetails(int sum, int n1, int n2, int n3, int n4, int n5 ,String grade) {
        this.sum = sum;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.grade=grade;
        
        
    }
    
    public String gpa(int n){
        String g="";
        if(n>=100){
         g="invalid";
        }
        else if(n>=80){
         g="A+";
        }
        else if(n>=70){
         g="A";
        }
        else if(n>=60){
         g="A-";
        }
        else if(n>=50){ 
         g="B";
        }
        else if(n>=40){
         g="C";
        }
        else if(n>=30){
         g="D";
        }
        else if(n<30){
         g="F";
        }
        
    return g;
    }
    public Double grade(int n){
        double g=0;
        if(n>=100){
         g=00;
        }
        else if(n>=80){
         g=5.0;
        }
        else if(n>=70){
         g=4.5;
        }
        else if(n>=60){
         g=4.0;
        }
        else if(n>=50){ 
         g=3.5;
        }
        else if(n>=40){
         g=3.0;
        }
        else if(n>=30){
         g=2.5;
        }
        else if(n<30){
         g=00;
        }
        
    return g;
    }

    public String getGn1() {
        gn1=gpa(n1);
        return gn1;
    }

    public void setGn1(String gn1) {
        this.gn1 = gn1;
    }

    public String getGn2() {
        gn2=gpa(n2);
        
        return gn2;
    }

    public void setGn2(String gn2) {
        this.gn2 = gn2;
    }

    public String getGn3() {
         gn3=gpa(n3);
        return gn3;
    }

    public void setGn3(String gn3) {
        this.gn3 = gn3;
    }

    public String getGn4() {
         gn4=gpa(n4);
        return gn4;
    }

    public void setGn4(String gn4) {
        this.gn4 = gn4;
    }

    public String getGn5() {
         gn5=gpa(n5);
        return gn5;
    }

    public void setGn5(String gn51) {
        this.gn5 = gn5;
    }

    public double getGrn1() {
        grn1=grade(n1);
        return grn1;
    }

    public void setGrn1(double grn1) {
        this.grn1 = grn1;
    }

    public double getGrn2() {
        grn2=grade(n2);
        return grn2;
    }

    public void setGrn2(double grn2) {
        this.grn2 = grn2;
    }

    public double getGrn3() {
        grn3=grade(n3);
        return grn3;
    }

    public void setGrn3(double grn3) {
        this.grn3 = grn3;
    }

    public double getGrn4() {
        grn4=grade(n4);
        return grn4;
    }

    public void setGrn4(double grn4) {
        this.grn4 = grn4;
    }

    public double getGrn5() {
        grn5=grade(n5);
        return grn5;
    }

    public void setGrn5(double grn5) {
        this.grn5 = grn5;
    }
       
    public int getSum() {
        sum=n1+n2+n3+n4+n5;
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getN5() {
        return n5;
    }

    public void setN5(int n5) {
        this.n5 = n5;
    }


    public String getGrade() {
        int averageNumber=(n1+n2+n3+n4+n5)/5;
        if(n1>100 ||n2>100 || n3>100 || n4>100 || n5>100 ){
         grade="invalid";
        }
        else if(averageNumber>=80){
         grade="A+";
        }
        else if(averageNumber>=70){
         grade="A";
        }
        else if(averageNumber>=60){
         grade="A-";
        }
        else if(averageNumber>=50){ 
         grade="B";
        }
        else if(averageNumber>=40){
         grade="C";
        }
        else if(averageNumber>=30){
         grade="D";
        }
        else if(averageNumber<30){
         grade="F";
        }
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "SumationItem{" + "sum=" + sum + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + ", n5=" + n5 + ", id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", grade=" + grade + '}';
    }
    
    

    

}
