class settingname extends Thread {
    String name;
    settingname(String name) {
        super(name);
        this.name=name;
    }

    public void run() {
        int i = 0;
        while (true) {
            if (i == 34) {
                break;
            }
            System.out.println("hello world "+this.name);
            i++;
        }
    }
}

public class threadingName {
    public static void main(String[] args) {
settingname t1=new settingname("jatt");
settingname t2=new settingname("umiii");
t1.start();
t2.start();
System.out.println(t1.getId());
System.out.println(t1.getName());
System.out.println(t2.getId());
System.out.println(t2.getName());
// System.out.println(t2.isAlive());

    }
}
