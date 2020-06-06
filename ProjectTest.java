public class ProjectTest {
    public static void main(String[] args) {
        Project proj1 = new Project();
        Project proj2 = new Project("secret project2");
        Project proj3 = new Project("secret project3", "placeholder for description of secret project3");

        proj1.setDesc("this is the description for project1");
        System.out.println(proj1.getName());
        System.out.println(proj1.getDesc());
        String pitch1 = proj1.elevatorPitch();
        System.out.println(pitch1);
        String pitch2 = proj2.elevatorPitch();
        System.out.println(pitch2);
        System.out.println(proj3.getName());
        String pitch3 = proj3.elevatorPitch();
        System.out.println(pitch3);

    }
}