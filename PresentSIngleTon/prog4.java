//Double Check Locking 

//SingleTon
//Using Synchronied 

class Server_c {

    static public Server_c obj;

    private Server_c() {

        System.out.println("What's App Opened");

    }

    public static  Server_c getUpdate() {

        if (obj == null) { 
            synchronized(Server_c.class){
            if(obj==null){
                obj = new Server_c();
            }
            }
    }
        System.out.println("New Msg");

        return obj;

    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Server_c s1 = obj.getUpdate();
                Server_c s2 = obj.getUpdate();
                Server_c s3 = obj.getUpdate();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Server_c s1 = obj.getUpdate();
                Server_c s2 = obj.getUpdate();
                Server_c s3 = obj.getUpdate();
            }
        });

        t1.start();
        t2.start();

    }

}
