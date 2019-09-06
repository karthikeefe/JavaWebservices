package org.spring.GetAPI;

import com.swagger.model.Asiapacific;
import com.swagger.model.Bank;
import com.swagger.model.Compositebe;
import com.swagger.model.DomesticAccountDetail;
import com.swagger.model.Employee;
import com.swagger.model.Europe;
import com.swagger.model.InternationalAccDetail;
import com.swagger.model.InternationalAccount;
import com.swagger.model.Response;
import com.swagger.model.Us;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.fasterxml.jackson.databind.JsonNode;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping({"/class"})
@EnableSwagger2
@CrossOrigin(origins = "*")
public class EmployeController
{
  private static final String templete = "No input param";
  
  /*@GetMapping({"/string/pathParam/{name}"})
  @ResponseBody
  public Employee get_employeenamePP(@PathVariable String name)
  {
    Employee employee = new Employee();
    employee.setEmpId(1);
    employee.setEmpName(name);
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("A");
    return employee;
  }
  
  @GetMapping({"/string/queryParam"})
  @ResponseBody
  public Employee get_EmployeeNameQP(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("name") String name)
  {
    Employee employee = new Employee();
    employee.setEmpId(1);
    employee.setEmpName(name);
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    
    return employee;
  }
  
  @GetMapping({"/int/pathParam/{id}"})
  @ResponseBody
  public Employee get_EmployeeIdPP(@PathVariable int id)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName("Peter");
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    
    return employee;
  }
  
  @GetMapping({"/int/queryParam"})
  @ResponseBody
  public Employee get_employeeIdQP(@RequestParam("id") int id)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName("Peter");
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    
    return employee;
  }
  
  @GetMapping({"/date/pathParam/{joinedDate}"})
  @ResponseBody
  public Employee get_EmployeeDatePP(@PathVariable @DateTimeFormat(pattern="dd.mm.yyyy") Date joinedDate)
  {
    Employee employee = new Employee();
    employee.setEmpId(123);
    employee.setEmpName("Peter");
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    employee.setEmpJoinedDate(joinedDate);
    return employee;
  }
  
  @GetMapping({"/date/queryParam"})
  @ResponseBody
  public Employee get_employeeDateQP(@RequestParam("date") @DateTimeFormat(pattern="dd.mm.yyyy") Date joinDate)
  {
    Employee employee = new Employee();
    employee.setEmpId(123);
    employee.setEmpName("Peter");
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    employee.setEmpJoinedDate(joinDate);
    
    return employee;
  }
  
  @GetMapping({"/boolean/pathParam/{id}"})
  @ResponseBody
  public Employee get_EmployeeIspresentPP(@PathVariable boolean id)
  {
    Employee employee = new Employee();
    employee.setEmpId(1);
    employee.setEmpName("Peter");
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    employee.setEmpCurrentEmployment(id);
    return employee;
  }
  
  @GetMapping({"/boolean/queryParam"})
  @ResponseBody
  public Employee getBoolean_employeeIspresentQP(@RequestParam("boolean") boolean id)
  {
    Employee employee = new Employee();
    employee.setEmpId(1);
    employee.setEmpName("Peter");
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    employee.setEmpCurrentEmployment(id);
    return employee;
  }
  
  @GetMapping({"/three/pathParam/{name}/{id}/{d}/{joinDate}"})
  @ResponseBody
  public Employee get_EmployeeDetailsPP(@PathVariable String name, @PathVariable int id, @PathVariable boolean d, @PathVariable @DateTimeFormat(pattern="dd.mm.yyyy") Date joinDate)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName(name);
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    employee.setEmpCurrentEmployment(d);
    employee.setEmpJoinedDate(joinDate);
    return employee;
  }
  
  @GetMapping({"/three/queryParam"})
  @ResponseBody
  public Employee get_employeeDetailsQP(@RequestParam("name") String name, @RequestParam("id") int id, @RequestParam("boolean") boolean d, @RequestParam("date") @DateTimeFormat(pattern="dd.mm.yyyy") Date joinDate)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName(name);
    employee.setEmpExp("1 year");
    employee.setEmpBllodgroup("B");
    employee.setEmpCurrentEmployment(d);
    employee.setEmpJoinedDate(joinDate);
    return employee;
  }
  
  @PostMapping({"/testpostBatch"})
  @ResponseBody
  public Response post_Employeelist(@RequestBody ArrayList<Employee> employee)
	{

		try {
			Response response = new Response();
			if ((employee.size() > 0) && (employee.get(0) != null) && !(employee.get(0).getEmpName().isEmpty())) {
				response.setData(employee);
				return response;
			} else {
				response.setErrorCode("400");
				response.setErrorMessage("Provide any values in request");
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provide any values in request");
			}
			// emp.setEmpId(999);
			// emp.setEmpName("Dummy");
			// emp.setEmpExp("0 year");
			// emp.setEmpBllodgroup("z");
			// emp.setEmpCurrentEmployment(false);
			// emp.setEmpJoinedDate(new Date());
			//
			// employee.add(emp);
			// response.setData(employee);
			// return response;
			// }

		} catch (NullPointerException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provide any request value", e);
		}

	}
  
  @PostMapping({"/testpost"})
  @ResponseBody
  public Employee post_EmployeeDetails(@RequestBody Employee employee, @RequestHeader String username, @RequestHeader String password)
  {
	  try {
			//Response response = new Response();
			if (username.equals(password)) {
				//response.setData(employee);
				return employee;
			} else {
				//response.setErrorCode("400");
				//response.setErrorMessage("Provide any values in request");
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provide any values in request");
			}
			

		} catch (NullPointerException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provide any request value", e);
		}
  }
  
  @PostMapping({"/testpost/pathParam/{id}/{name}/{exp}/{bloodgrp}/{employment}/{joinDate}"})
  @ResponseBody
  public Employee post_pathParam(@PathVariable int id, @PathVariable String name, @PathVariable String exp, @PathVariable String bloodgrp, @PathVariable boolean employment, @PathVariable @DateTimeFormat(pattern="dd.mm.yyyy") Date joinDate)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName(name);
    employee.setEmpExp(exp);
    employee.setEmpBllodgroup(bloodgrp);
    employee.setEmpCurrentEmployment(employment);
    employee.setEmpJoinedDate(joinDate);
    return employee;
  }
  
  @PostMapping({"/testpost/queryParam"})
  @ResponseBody
  public Employee post_queryParam(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("exp") String exp, @RequestParam("bloodgrp") String bloodgrp, @RequestParam("currentemployment") boolean employment, @RequestParam("date") @DateTimeFormat(pattern="dd.mm.yyyy") Date joinDate)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName(name);
    employee.setEmpExp(exp);
    employee.setEmpBllodgroup(bloodgrp);
    employee.setEmpCurrentEmployment(employment);
    employee.setEmpJoinedDate(joinDate);
    return employee;
  }
  
  @PutMapping({"/testput"})
  @ResponseBody
  public Employee put_pathParam(@RequestBody Employee employee)
  {
	 
    return employee;
  }
  
  @PutMapping({"/testput/pathParam/{id}/{name}/{exp}/{bloodgrp}/{employment}/{joinDate}"})
  @ResponseBody
  public Employee put_pathParam(@PathVariable int id, @PathVariable String name, @PathVariable String exp, @PathVariable String bloodgrp, @PathVariable boolean employment, @PathVariable @DateTimeFormat(pattern="dd.mm.yyyy") Date joinDate)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName(name);
    employee.setEmpExp(exp);
    employee.setEmpBllodgroup(bloodgrp);
    employee.setEmpCurrentEmployment(employment);
    employee.setEmpJoinedDate(joinDate);
    return employee;
  }
  
  @PutMapping({"/testput/queryParam"})
  @ResponseBody
  public Employee put_queryParam(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("exp") String exp, @RequestParam("bloodgrp") String bloodgrp, @RequestParam("currentemployment") boolean employment, @RequestParam("date") @DateTimeFormat(pattern="dd.mm.yyyy") Date joinDate)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName(name);
    employee.setEmpExp(exp);
    employee.setEmpBllodgroup(bloodgrp);
    employee.setEmpCurrentEmployment(employment);
    employee.setEmpJoinedDate(joinDate);
    return employee;
  }
  
  @DeleteMapping({"/testdelete/pathParam/{id}"})
  @ResponseBody
  public Employee delete_pathParam(@PathVariable int id)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName("Karthik");
    employee.setEmpExp("1year");
    employee.setEmpBllodgroup("B");
    employee.setEmpCurrentEmployment(true);
    if (employee.getEmpId() == id)
    {
      employee.setEmpId(0);
      employee.setEmpName("");
      employee.setEmpExp("");
      employee.setEmpBllodgroup("");
      employee.setEmpCurrentEmployment(false);
    }
    return employee;
  }
  
  @DeleteMapping({"/testdelete/queryParam"})
  @ResponseBody
  public Employee delete_queryParam(@RequestParam("id") int id)
  {
    Employee employee = new Employee();
    employee.setEmpId(id);
    employee.setEmpName("Karthik");
    employee.setEmpExp("1year");
    employee.setEmpBllodgroup("B");
    employee.setEmpCurrentEmployment(true);
    if (employee.getEmpId() == id)
    {
      employee.setEmpId(0);
      employee.setEmpName("");
      employee.setEmpExp("");
      employee.setEmpBllodgroup("");
      employee.setEmpCurrentEmployment(false);
    }
    return employee;
  }*/
  
  @GetMapping({"/compositebe/get"})
  @ResponseBody
  public Compositebe get_CompositeBank()
	{
		Compositebe composite = null;
		try {
			

			composite = new Compositebe();
			DomesticAccountDetail domesticaccdetail = new DomesticAccountDetail();
			InternationalAccount internationalaccount = new InternationalAccount();
			Asiapacific asiapacific = new Asiapacific();
			Europe europe = new Europe();
			Us us = new Us();
			InternationalAccDetail internationalaccdetails = new InternationalAccDetail();
			Bank bank = new Bank();

			domesticaccdetail.setAccountNo(123);
			domesticaccdetail.setAccountname("aaa");
			domesticaccdetail.setCreditdate(new Date());
			domesticaccdetail.setStatus(true);

			List<DomesticAccountDetail> domaccdetail = new ArrayList<>();
			domaccdetail.add(domesticaccdetail);

			asiapacific.setAccountNum(9191);
			asiapacific.setIsActive(true);
			asiapacific.setAccountname("india");
			asiapacific.setCreateddate(new Date());

			europe.setAccountNum(0404);
			europe.setIsActive(true);
			europe.setAccountname("Germany");
			europe.setCreateddate(new Date());

			us.setAccountNum(0101);
			us.setIsActive(false);
			us.setCreateddate(new Date());
			us.setAccountname("USA");

			internationalaccount.setAsiapacific(asiapacific);
			internationalaccount.setEurope(europe);
			internationalaccount.setUs(us);

			internationalaccdetails.setAccountname("kathir");
			internationalaccdetails.setAccountNo(123);
			internationalaccdetails.setCredit(new Date());
			internationalaccdetails.setStatus(true);

			List<InternationalAccDetail> intaccdetail = new ArrayList<>();
			intaccdetail.add(internationalaccdetails);

			bank.setAccountCreatedby("peter");
			bank.setRegisteredBranch("TidelPark");
			bank.setDomesticAccountDetails(domaccdetail);
			bank.setInternationalAccount(internationalaccount);
			bank.setInternationalAccDetails(intaccdetail);

			composite.setBank(bank);

		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provide Correct request", e);
		}

		return composite;

	}
  
  @PostMapping({"/compositebe/postbatch"})
  @ResponseBody
  public Compositebe post_CompositeBank(@RequestBody Compositebe compositebe)
	{
		return compositebe;
	}
  
  @PostMapping({"/compositebe/basicsecured/postbatch"})
  @ResponseBody
  public Compositebe post_CompositeBankSecured(@RequestBody Compositebe compositebe, @RequestHeader String username, @RequestHeader String password)
	{	
	  try {
			//Response response = new Response();
			if (username.equals(password)) {
				//response.setData(employee);
				return compositebe;
			} else {
				//response.setErrorCode("400");
				//response.setErrorMessage("Provide any values in request");
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username & password is incorrect please try again");
			}
		} catch (NullPointerException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Provide any request value", e);
		}
		
	}
}
