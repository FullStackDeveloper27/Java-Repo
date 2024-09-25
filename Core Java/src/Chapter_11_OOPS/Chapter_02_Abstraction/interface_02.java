package Chapter_11_OOPS.Chapter_02_Abstraction;
class Phone{
    void call(){
        System.out.println("Phone call");
    }
    void Sms(){
        System.out.println("Phone Sms");
    }
}
interface ICamera{
    void Click();
    void Record();
}
interface IMusicPlayer{
    void Play();
    void Stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer{

    public void videoCall(){
        System.out.println("Smart Phone video calling");
    }
    @Override
    public void Click() {
        System.out.println("Smart Phone Click");
    }

    @Override
    public void Record() {
        System.out.println("Smart Phone Record");
    }
    @Override
    public void Play() {
        System.out.println("Smart Phone Play");

    }
    @Override
    public void Stop() {
        System.out.println("Smart Phone Stop");
    }
}
public class interface_02 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.Click();
        sp.Play();
        sp.Record();
        sp.Stop();
        sp.Sms();
        sp.call();
        sp.videoCall();

        Phone p = new SmartPhone();
        p.call();
        p.Sms();

        // this will call the smartphone override method from iCamera
        ICamera I = new SmartPhone();
        I.Click();
        I.Record();

        IMusicPlayer IM = new SmartPhone();
        IM.Play();
        IM.Stop();

    }
}
