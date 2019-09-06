package com.swagger.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Employee
{
  private int empId;
  private String empName;
  private String empExp;
  private String empBllodgroup;
  private boolean empCurrentEmployment;
  private Date empJoinedDate;
  
  public Date getEmpJoinedDate()
  {
    return this.empJoinedDate;
  }
  
  public void setEmpJoinedDate(Date empJoinedDate)
  {
    this.empJoinedDate = empJoinedDate;
  }
  
  public boolean isEmpCurrentEmployment()
  {
    return this.empCurrentEmployment;
  }
  
  public void setEmpCurrentEmployment(boolean empCurrentEmployment)
  {
    this.empCurrentEmployment = empCurrentEmployment;
  }
  
  public int getEmpId()
  {
    return this.empId;
  }
  
  public void setEmpId(int empId)
  {
    this.empId = empId;
  }
  
  public String getEmpName()
  {
    return this.empName;
  }
  
  public void setEmpName(String empName)
  {
    this.empName = empName;
  }
  
  public String getEmpExp()
  {
    return this.empExp;
  }
  
  public void setEmpExp(String empExp)
  {
    this.empExp = empExp;
  }
  
  public String getEmpBllodgroup()
  {
    return this.empBllodgroup;
  }
  
  public void setEmpBllodgroup(String empBllodgroup)
  {
    this.empBllodgroup = empBllodgroup;
  }
  
  public void deleteEmployee(int id)
  {
    Map<Integer, Map<String, Object>> emp = new HashMap();
    Map<String, Object> empdetail = new HashMap();
    empdetail.put("empID", Integer.valueOf(getEmpId()));
    empdetail.put("empName", getEmpName());
    empdetail.put("empExp", getEmpExp());
    empdetail.put("empBloodgroup", getEmpBllodgroup());
    empdetail.put("empEmployment", Boolean.valueOf(isEmpCurrentEmployment()));
    
    emp.put(Integer.valueOf(id), empdetail);
    if (emp.containsKey(Integer.valueOf(id))) {}
  }
}
