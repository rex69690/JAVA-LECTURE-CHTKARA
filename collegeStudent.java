public class collegeStudent implements Student {

    
    public void speak() {
        System.out.println("I am a student!");
    }

    public void study() {
        System.out.println("I am studying");
    }

    public static void main(String[] args) {
        collegeStudent student = new collegeStudent();
        student.study(); 
        student.speak();
}
};
