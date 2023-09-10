package platform;

public class Subscriber {
    private String name;
    private Channel channel=new Channel();

    public Subscriber(String name) {
        this.name = name;
    }


    public void update()
    {
        System.out.println("hi " +name+ " video uploaded  " +channel.title);
    }
    public void subscribeChannel(Channel ch)
    {
        channel=ch;
    }
}
