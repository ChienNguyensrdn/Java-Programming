package edu.uth;

public class Nhanvien {
    private String code;
    private String fullName;
    private int Age;

    public Nhanvien() {
    }

    public Nhanvien(String code, String fullName, int age) {
        this.code = code;
        this.fullName = fullName;
        Age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", Age=" + Age +
                '}';
    }
}
