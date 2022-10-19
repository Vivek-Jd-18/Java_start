package OOPS.Polymorphism.Overriding;

public class Child extends Parent {
    public int childAge;
    public String childName;
    public String childVoice;

    public Child(int childAge, String childName, String childVoice,int parentAge, String parentName, String parentVoice) {        
        super(parentAge,parentName,parentVoice);
        this.childAge = childAge;
        this.childName = childName;
        this.childVoice = childVoice;
    }

    public String childSounds() {
        return childVoice;
    }

    public void changeChildAge(int childAge) {
        this.childAge = parentAge/2;
    }
    public void changeChildName(String childName) {
        this.childName = childName;
    }
    public void changeChildVoice(String childVoice) {
        this.childVoice = childVoice;
    }
}
