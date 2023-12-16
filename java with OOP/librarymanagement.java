class Library {
  static String[] books=new String[10];
  // books[0]="opps by robert";
  // books[1]="java by reference";
  // books[2]="python.org";
  // books[3]="ict by peter notin";
  static int i = 0;

  public void addbook(String name) {
    if(i==books.length){
      System.out.println("library size has been fulled ");
    }
else{
     books[i]=name;
     i=i+1;
  }
}

  public void showbooks() {
    System.out.println("the books available in libraray are :");
    for (int i=0;i<books.length;i++) {
      if(books[i]=="null"){
          continue;
      }
      else{
      System.out.println(books[i]);
    }
  }
  }

}

public class librarymanagement {
  public static void main(String[] args) {
    Library l1 = new Library();
    Library l2=new Library();
    l2.addbook("oops by robert lafore");
    l1.addbook("database");
    l1.showbooks();

  }
}
