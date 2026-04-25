
public class Main {
    public static void main(String[] args) {
        Student student=Student.getBuilder()
            .setName("Ayushee")
            .setDepartment("ECE")
            .setRollNo(110)
            .setAge(25)
            .build();
        System.out.println("Successfully created: " + student.name);
    }
}
class Student{
     String name;
     String department;
     int rollNo;
     int age;
    public Student(Builder b){
        this.name=b.getName();
        this.department=b.getDepartment();
        this.rollNo=b.getRollNo();
        this.age=b.getAge();
    } 
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder{
        String name;
        String department;
        int rollNo;
        int age;
        private Builder(){}
        public Student build(){
            if(this.age<25) throw new IllegalArgumentException("Age should be above or equal to 25!!");
            System.out.println("Successfully created: " + this.getName());
            return new Student(this);
        }
        public String getName(){
            return this.name;
        }
        public String getDepartment(){
            return this.department;
        }
        public int getRollNo(){
            return this.rollNo;
        }
        public int getAge(){
            return this.age;
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setDepartment(String department){
            this.department=department;
            return this;
        }
        public Builder setRollNo(int rollNo){
            this.rollNo=rollNo;
            return this;
        }
        public Builder setAge(int age){
            this.age=age;
            return this;
        }
    }
}
