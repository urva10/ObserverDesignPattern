package platform;
public class Main {
    public static void main(String[] args) {
        Channel tel=new Channel();
        Subscriber s1=new Subscriber("sagar");
        Subscriber s2=new Subscriber("amit");
        Subscriber s3=new Subscriber("suman");
        Subscriber s4=new Subscriber("saroj");
        Subscriber s5=new Subscriber("samuya");

        tel.subscribe(s1);
        tel.subscribe(s2);
        tel.subscribe(s3);
        tel.subscribe(s4);
        tel.subscribe(s5);

        s1.subscribeChannel(tel);
        s2.subscribeChannel(tel);
        s3.subscribeChannel(tel);
        s4.subscribeChannel(tel);
        s5.subscribeChannel(tel);

        tel.upload("intro");
    }
}