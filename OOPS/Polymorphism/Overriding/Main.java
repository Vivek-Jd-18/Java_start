package OOPS.Polymorphism.Overriding;

public class Main {
    public static void main(String[] args) {
        Child c1= new Child(12, "rahul", "low", 22, "Subhash", "Heavy");

        // System.out.println(c1.childName+" childName");
        // System.out.println(c1.childAge+" childAge");
        // System.out.println(c1.childVoice+" childVoice");
        // c1.changeChildVoice("Medium");
        // System.out.println(c1.childVoice+" childVoice");
        System.out.println(c1.parentName+" parentName");
        System.out.println(c1.parentAge+" parentAge");
        System.out.println(c1.parentVoice+" parentVoice");

    }
}
