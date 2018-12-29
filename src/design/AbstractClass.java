package design;

public abstract class AbstractClass implements Employee {

    final String empName = "John Bon Jovi";
    static String dateOfJoining = "01/12/2015";

    public void joiningDate (){

            System.out.println(empName+"'s first day was" +dateOfJoining);

    }

    public abstract void farewell (int date);{

    }


}












