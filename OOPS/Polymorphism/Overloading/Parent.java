package OOPS.Polymorphism.Overloading;

public class Parent {
    public int parentAge;
    public String parentName;
    public String parentVoice;

    Parent(int parentAge, String parentName, String parentVoice) {
        this.parentAge = parentAge;
        this.parentName = parentName;
        this.parentVoice = parentVoice;
    }

    public String parentSounds() {
        return parentVoice;
    }

    public void changeParentAge(int parentAge) {
        this.parentAge = parentAge;
    }
    public void changeParentName(String parentName) {
        this.parentName = parentName;
    }
    public void changeParentVoice(String parentVoice) {
        this.parentVoice = parentVoice;
    }
}
