
 //SingleTon
 //Using Synchronied Method

 class Server_b {

     static public Server_b obj;

     private Server_b() {

         System.out.println("What's App Opened");

     }

     public static synchronized Server_b getUpdate() {

         if (obj == null) {
             obj = new Server_b();
         }
         System.out.println("New Msg");

         return obj;

     }

     public static void main(String[] args) {
 
         
         Thread t1=new Thread(new Runnable(){
              public void run(){
                 Server_b s1 = obj.getUpdate();
                 Server_b s2 = obj.getUpdate();
                 Server_b s3 = obj.getUpdate();
              }
         });

         Thread t2=new Thread(new Runnable(){
              public void run(){
                 Server_b s1 = obj.getUpdate();
                 Server_b s2 = obj.getUpdate();
                 Server_b s3 = obj.getUpdate();
              }
         });
           
          t1.start();
          t2.start();


         

     }

 }
