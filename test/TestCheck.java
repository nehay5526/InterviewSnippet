public class TestCheck<T extends Runnable &  Comparable >
{
T obj;
void add(T obj)
{
this.obj=obj;
}
T get()
{
return obj;
}
public static void main(String... args)
{
TestCheck<Some> g = new TestCheck<Some>();
}
}
 class Some implements Comparable,Runnable
{
public int compareTo(Integer obj1)
{
return 0;
}
public void run()
{
}
}