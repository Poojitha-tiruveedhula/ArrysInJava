class Hi
{
private int age;
private String name;

public int getAge()
{
return age;
}

public void setAge(int a)
{
age=a;
}

public String getName()
{
return name;
}

public void setName(String b)
{
name=b;
}
}

public class Encapsulation
{
public static void main(String[] args)throws ClassNotFoundException
{
Hi obj=new Hi();
obj.setAge(10);
obj.setName("ayra");
System.out.println(obj.getName()+":"+obj.getAge());
}
}