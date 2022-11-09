public class T_24_advanced {
    
    public static void main(String[]args){
        T_24_advanced obj = new T_24_advanced();
        obj.sendMessage(5, 10, "Chamaali");
        
        obj.sendMessage(25, 35, "Sunil");
    }
        

    public void sendMessage(int n, int m, String name){
        System.out.println(n + "+" + m + "=" + (n+m));
        System.out.println("Hello "+ name);
    }
    
}