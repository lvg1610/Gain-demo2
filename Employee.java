class Employee implements Comparable<Employee>
{
    private int employeeId;
    private String employeeName;
    private double salary;
    public Employee(){}
    public Employee(int employeeId,String employeeName,double salary)
    {
       this.employeeId = employeeId; this.employeeName = employeeName;  this.salary = salary;
    }
    
    public int getEmployeeId() { return employeeId  ; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
 
    public String toString()
    {
        return employeeId+"     "+employeeName+"    "+salary;
    } 
    public boolean equals(Object obj)
    {
       if(obj instanceof Employee)
       {
           Employee e = (Employee)obj;
           return employeeId == e.employeeId && employeeName.equals(e.employeeName) && salary == e.salary;
       }
       return false;
    }

    public int hashCode()
    {
        return Integer.valueOf(employeeId).hashCode()+employeeName.hashCode()+Double.valueOf(salary).hashCode();
    }

    public int compareTo(Employee e)
    {
         return hashCode() - e.hashCode(); 
    }
}





















/*class List<T>
{
    addAtTheBeg(T element)
    {
    }

    append(T element)
    {
    }


    insertAtPosition(int position,T element)
    {
    }

    deleteFromEnd()
    {
        //should delete Last element
    }
    
    deleteFirst()
    {
       //should delete first element
    }

    delete(T element)
    {
         if the element is found then should delete
         else throw exception with message "Element Does not exist"
    } 
}*/
