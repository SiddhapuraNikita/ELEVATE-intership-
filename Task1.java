import java.util.*;

public class Task1 {
    public static ArrayList<Integer> list;

    public Task1(){
       list=new ArrayList<>();
    }
    public void addGrade(int grade){
        list.add(grade);
    }

    public double calculateAverage(){
        if(list.isEmpty()){
            return 0.0;
        }
        int sum=0;
        for(int i:list){ 
            sum = sum+ i;
        }
        return (double)sum/list.size();
    }

    public int getHighestGrade(){
        if(list.isEmpty()){
            return 0;
        }
        int h=list.get(0);
        for(int i : list){
            if(h<i){
                h=i;
            }
        }
        return h;
    }

    public int getLowestGrade(){
        if(list.isEmpty()){
            return -1;
        }
        int l=list.get(0);
        for(int i : list){
            if(l>i){
                l=i;
            }
        }
        return l;
    }
    public static void main(String[] args) 
    {
       Task1 t=new Task1();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no. of elements:");
       int a=sc.nextInt();
       System.out.println("");

        try{
            for(int i=0; i<a; i++)
            {
              list.add(sc.nextInt());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        double ave= t.calculateAverage();
        int high=t.getHighestGrade();
        int low=t.getLowestGrade();

        System.out.println("Average of Grades= "+ave);
        System.out.println("Highest Grades is= "+high);
        System.out.println("Lowest Grades is= "+low);
    }
}
