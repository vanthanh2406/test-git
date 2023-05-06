package model;

import java.io.Serializable;

/**
 *
 * @author Hello
 */
public class NhanVien implements Serializable{
    
    private String ID;
    private String name;
    private int age;
    private String role;
    private String area;
    private int experience;

    public NhanVien() {
    }

    public NhanVien(String ID, String name, int age, String role, String area, int experience) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.role = role;
        this.area = area;
        this.experience = experience;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ID=" + ID + ", name=" + name + ", age=" + age + ", role=" + role + ", area=" + area + ", experience=" + experience + '}';
    }
    
    public String getStatus(String trangThai){
        if(experience < 3){
            return "Bán chuyên";
        }else if(experience < 10){
            return "Chuyên nghiệp";
        }else{
            return "Lão luyện";
        }
    }
    
    public double getSalary(){
        if(role.equals("Administrators") && area.equals("Vip")){
            return 1000+100;
        }else if(role.equals("Administrators") && area.equals("Classic")){
            return 1000+75;
        }else if(role.equals("Administrators") && area.equals("Regular")){
            return 1000+50;
        }else if(role.equals("Moderators") && area.equals("Vip")){
            return 500+100;
        }else if(role.equals("Moderators") && area.equals("Classic")){
            return 500+75;
        }else if(role.equals("Moderators") && area.equals("Regular")){
            return 500+50;
        }else if(role.equals("Operational") && area.equals("Vip")){
            return 300+100;
        }else if(role.equals("Operational") && area.equals("Classic")){
            return 300+75;
        }else if(role.equals("Operational") && area.equals("Regular")){
            return 300+50;
        }else if(role.equals("Regular") && area.equals("Vip")){
            return 150+100;
        }else if(role.equals("Regular") && area.equals("Classic")){
            return 150+75;
        }else if(role.equals("Regular") && area.equals("Regular")){
            return 150+50;
        }else if(role.equals("Part-time") && area.equals("Vip")){
            return 50+100;
        }else if(role.equals("Part-time") && area.equals("Classic")){
            return 50+75;
        }else if(role.equals("Part-time") && area.equals("Regular")){
            return 50+50;
        }
        return -1;
    }
}
