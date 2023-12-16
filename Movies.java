abstract class movie{
       public String author="Ahmed";

      abstract void setTitle();
      abstract void setDirector();
      abstract void setActor();
      abstract void setReviews();

}

class createMovie extends movie{
      public void setTitle(){
            System.out.println("set your title ");
            System.out.println("author is "+author);
      }
      public void setDirector(){
          System.out.println("set your director name ");  
      }
      public void setActor(){
            System.out.println("enter actor  name ");
      }
      public void setReviews(){
            System.out.println("set your reveiws");

      }
}



public class Movies{
     public static void main(String[] args) {
     createMovie m1=new createMovie();
     m1.setTitle();
     m1.setDirector();
     m1.setActor();
     m1.setReviews();


            
      }
}
