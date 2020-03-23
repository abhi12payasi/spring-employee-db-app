package com.app;

import com.app.bean.Employee;
import com.app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");

        String sql = "insert into employee values(?,?,?)";
        System.out.println(jdbcTemplate.update(sql,103,"ankit",86985.6));

        sql="select * from employee";
        List<Employee> employeeList = (List<Employee>) jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper(Employee.class));


//        String sql = "delete from employee where id = ? ";
//        System.out.println(jdbcTemplate.update(sql,101));
    }
}

