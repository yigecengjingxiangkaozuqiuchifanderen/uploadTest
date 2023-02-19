package net.xdclass.shopmanager.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

@Data
@TableName("employee")
public class Employee {
    private int empno;

    private String ename;

    private String job;

    private int mgr;

    private Date hiredate;

    private double sal;

    private int deptnu;

}
