package org.spring.GetAPI;

import java.util.HashMap;
import java.util.Map;

public class Employe
{
  private final Map<String, Object> empList;
  
  public Employe()
  {
    this.empList = new HashMap();
  }
  
  public Map<String, Object> getEmpDetails()
  {
    this.empList.put("empID", Integer.valueOf(1));
    this.empList.put("empExp", "1 year");
    this.empList.put("empBllodgroup", Character.valueOf('A'));
    
    return this.empList;
  }
}
