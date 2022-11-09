public class Orange {

    private String friendName;


    public Orange(String name){
        friendName=name;
    }

    // public void getName(String name){
    //     friendName=name;

    // }

    public String setName(){
        return friendName;
    }
    
    public void say(){
        System.out.println("Your Friend name is "+ setName());
    }
}
