package SiddhiB;

class LoopEx1
{
    void display(String name)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(name + ":" + i);
        }//return name;
    } 
    public static void main(String[] a)
    {
        LoopEx1 loopEx1 = new LoopEx1();
        loopEx1.display("Maulik");
    }
}