//SingleTon
//Eagar Initialization
class Server{
    
    static public Server obj=new Server();
     
    private Server(){
           
        System.out.println("What's App Opened");

    }    
    public static Server getUpdate(){
            
        System.out.println("New Msg");
        return obj;
          
    }
    
    public static void main(String[] args) {
           
        Server s1=obj.getUpdate();
        Server s2=obj.getUpdate();
        Server s3=obj.getUpdate();
          
        
    }

     
    
}
