public class Cat extends Animal {

    @Override
    public void run(double distance) {
        if(distance<=200){
            System.out.println("cat run: true "+distance+"m");
        } else{
            System.out.println("cat run: false");
        }
    }

    @Override
    public void swim(double distance) {
        System.out.println("cat swim: false");
    }

    @Override
    public void jump(double height) {
        if(height<=2){
            System.out.println("cat jump: true "+height+"m");
        } else{
            System.out.println("cat jump: false");
        }
    }
}