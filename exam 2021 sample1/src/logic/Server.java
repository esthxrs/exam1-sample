package logic;

import java.util.ArrayList;


public class Server {
    private String name;
    private User owner;
    private ArrayList<Channel> channelList;
    private ArrayList<User> memberList;

    public Server(String name, User owner, TemplateType template){
        setOwner(owner);
        channelList = new ArrayList<>();
        memberList = new ArrayList<>();
        memberList.add(this.owner);
        owner.addJoinedServersList(this);

        addUser(this.owner);
        setName(name);

        if(template==TemplateType.BASIC){
            Channel newChannel = new Channel("general");
            addChannel(owner, "general");
        }

        else if(template==TemplateType.GAMING){
            Channel newChannel = new Channel("gaming");
            addChannel(owner, "gaming");
        }

        else if(template==TemplateType.STUDY){
            Channel newChannel = new Channel("homework-help");
            addChannel(owner, "homework-help");
        }

    }

    public Channel addChannel(User user, String channelName){
        if(user.equals(this.owner)){
            Channel newChannel = new Channel(channelName);
            channelList.add(newChannel);
            return newChannel;
        }
        else return null;
    }

    public User addUser(User user){
        if(!memberList.contains(user)){
            memberList.add(user);
            user.addJoinedServersList(this);
            return user;
        }
        else return null;
    }

    public boolean kickUser(User kicker, User kicked) throws Exception{
        if(!kicker.equals(getOwner())) throw new Exception();
        else if(!memberList.contains(kicked) || kicked.equals(this.owner)){
            return false;
        }
        else {
            kicked.getJoinedServersList().remove(this);
           memberList.remove(kicked);
           return true;
        }
    }

    public void setName(String name){
        if(name.isBlank()){
            this.name = getOwner().getName() + " home";
        }
        else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public ArrayList<Channel> getChannelList() {
        return channelList;
    }

    public void setChannelList(ArrayList<Channel> channelList) {
        this.channelList = channelList;
    }

    public ArrayList<User> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<User> memberList) {
        this.memberList = memberList;
    }
}
