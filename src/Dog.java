public class Dog extends Animal {
    @Override
    public void run(double distance) {
        if(distance<=500){
            System.out.println("dog run: true "+distance+"m");
        } else{
            System.out.println("dog run: false");
        }
    }

    @Override
    public void swim(double distance) {
        if(distance<=10){
            System.out.println("dog swim: true "+distance+"m");
        } else{
            System.out.println("dog swim: false");
        }
    }

    @Override
    public void jump(double height) {
        if (height<=0.5){
            System.out.println("dog jump: true "+height+"m");
        } else{
            System.out.println("dog jump:false");
        }
    }
}
