package platform;
import java.util.List;
import java.util.ArrayList;
public class Channel {
    private List<Subscriber> subs=new ArrayList<>();
    String title;

    public void subscribe(Subscriber sub)
    {
        boolean add = subs.add(sub);
    }
    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }
    public void notifySubscribers()
    {
        for(Subscriber sub:subs)
        {
            sub.update();
        }
    }
    public void upload(String title)
    {
        this.title=title;
        notifySubscribers();
    }

}
