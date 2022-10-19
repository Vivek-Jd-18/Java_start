package CallBack;

import java.util.Vector;

class ChatServer{
    int members =0;
    int activeUsers = 0;
    int deactiveUser = 0;
    Vector<User> users = new Vector<User>();


    public void callBackAddActiveUser(User user){
        this.activeUsers++;
        System.out.printf("SERVER: %s is connected to the server\n", user.name);
        System.out.printf("SERVER: Total %d users connected\n", this.activeUsers);
    }

    public void callBackRemoveActiveUser(User user){
        this.activeUsers--;
        System.out.printf("SERVER: %s is disconnected to the server\n", user.name);
        System.out.printf("SERVER: Total %d users disconnected\n", this.deactiveUser);
    }

    public void crashTheServer(){
        this.activeUsers = 0;
        this.deactiveUser = 0;

        this.users.forEach((User u)->{
            u.CallBackcrashInfo();
        });
    }

}

class User{
    String name;
    int id;
    ChatServer cs;

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void addToServer(ChatServer cs){
        this.cs = cs;
        cs.users.add(this);
    }

    public void connectToServer(){
        cs.callBackAddActiveUser(this);
    }

    public void disConnectToServer(){
        cs.callBackRemoveActiveUser(this);
    }

    public void CallBackcrashInfo(){
        System.out.printf("USER: %s the server is crashed\n", this.name);
    }
}

public class CallBack{
    public static void main(String args[]){
        ChatServer cs = new ChatServer();
        User u1 = new User("vishal", 1);
        User u2 = new User("vivek", 2);
        User u3 = new User("ankit", 3);
        User u4 = new User("mayur", 4);

        u1.addToServer(cs);
        u1.connectToServer();
        cs.crashTheServer();

    }
}