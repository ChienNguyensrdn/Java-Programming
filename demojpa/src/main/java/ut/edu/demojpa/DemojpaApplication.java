package ut.edu.demojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemojpaApplication.class, args);
        //JPA (Java Persistence API)
        //JPA chuẩn API của Java --> CSDL dễ không cần SQL
        //CSDL ( Databe , Table, Column, row )
        //OOP khai báo class --> Re của các bảng
        // ORM : Mapping Object --> Table
        // property --> Column
        //primary key -->
        //CRUD cơ bản (Object )
        //Lazy loading, Caching
        //Transaction  :
        /*
        Begin tran
            //cau lenh sql
            commit tran
            cacth:
                rollback
        End tran
        procedure , function , trigger  ....
         */
        //JPA hỗ trợ trên nhiều dạng hệ quản tri csdl
        //SQL server (MS SQL), MySql , Oracle , Postgress
        //JPA không phải framework mà là một chuẩn (specification)
        //Hibernate, EclipseLink, Open JPA
    }

}
