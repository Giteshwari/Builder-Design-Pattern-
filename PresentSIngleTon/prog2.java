//SingleTon
//Lazy  Initialization
class Server_a {

    static public Server_a obj ;

    private Server_a() {

        System.out.println("What's App Opened");

    }

    public static Server_a getUpdate() {

       if(obj==null){    
        obj = new Server_a();
       }
        System.out.println("New Msg");
        
        return obj;

    }

    public static void main(String[] args) {

        Server_a s1 = obj.getUpdate();
        Server_a s2 = obj.getUpdate();
        Server_a s3 = obj.getUpdate();

    }

}
