class bank {
    static String bank_name = "Al habib bank ltd";
    static String[] bank_members = new String[100];
    static int count = 4;

    bank() {
        bank.bank_members[0] = "umair";
        bank.bank_members[1] = "danish";
        bank.bank_members[2] = "uzair";
        bank.bank_members[3] = "iqbal";
    }

    public void addmember(String name) {
        bank.bank_members[count] = name;
        count = count + 1;
    }

    public void showmember() {
        int i = 1;
        for (String bank_members : bank.bank_members) {
            System.out.println("member " + i + " => " + bank_members);
            i = i + 1;
        }
    }

}

class manager extends bank {
    static String[] managers = new String[10];
    static int countmanager = 2;

    manager() {
        manager.managers[0] = "umair";
        manager.managers[1] = "danish";
    }

    public void addmanager(String name) {
        manager.managers[countmanager] = name;
        countmanager = countmanager + 1;
    }

    public void showmanagers() {
        int i = 1;
        for (String manag : manager.managers) {
            if (manag == "null") {
            } else {
                System.out.println("manager " + i + " => " + manag);
            }
            i = i + 1;
        }
    }

}

public class project1 {
    public static void main(String[] args) {
        String name = "umair jatt is good boy";
        // System.out.println(name.charAt(0);
        manager m1 = new manager();
        m1.addmanager("bashir");
        m1.showmanagers();
    }
}
