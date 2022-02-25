//SingleTon  Using eNUN
class MainDemo{
       
    public static void main(String[] args) {
        
         Server_d obj1=Server_d.INSTANCE;
         obj1.getUpdate();
         Server_d obj2=Server_d.INSTANCE;
         obj2.getUpdate();
         Server_d obj3=Server_d.INSTANCE;
         obj3.getUpdate();


    }
     

}
enum Server_d{
       
    INSTANCE;
    void getUpdate(){ 
         
        System.out.println("New Msg");

    }
       
     

}