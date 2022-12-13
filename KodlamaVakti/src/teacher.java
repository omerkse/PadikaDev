public class teacher {
    String name;
    String phone;
    String branch;


    teacher(String name, String branch, String phone){
        this.name= name;
        this.phone = phone;
        this.branch= branch;
    }
    void print(){
        System.out.println("Name:"+this.name);
        System.out.println("Phone Number:"+this.phone);
        System.out.println("Branch:"+this.branch);
    }
}