package vpack;

public class Car extends Vehicle
{
    private int maxSpeed;
    private String type;

    public Car(int regNo,String model,int currSpeed,int MaxSpeed,String type) {
        super(regNo, model, currSpeed, MaxSpeed, type);
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
        @Override
        public int increSpeed(int n){
            if(currSpeeed+n<maxSpeed)


        }


    }


}
