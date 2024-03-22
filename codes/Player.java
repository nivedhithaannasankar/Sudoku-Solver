package player;

import java.util.*;

public class Player {
    public String name;
    public String email;
    public int age;

    public  void setPlayerDetails(String name, String email, int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }

    public void getPlayerDetails(){
        System.out.println("Player name: " + this.name);
        System.out.println("Player email: " + this.email);
        System.out.println("Player age: " + this.age);
    }

    public void setdetails(Player p){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Player name: ");
        String name=sc.nextLine();
        System.out.println("Enter Player email: ");
        String email=sc.nextLine();
        System.out.println("Enter Player age: ");
        int age=sc.nextInt();
        
        p.setPlayerDetails(name, email, age);
        
    }
}
