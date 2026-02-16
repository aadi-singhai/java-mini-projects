class SmartLight {
    private boolean isOn;
    private int brightness;
    private String color;

    SmartLight(boolean stat, int brgtns, String col){
        this.isOn = stat;
        this.brightness = brgtns;
        this.color = col;
    }

    public void setLight(boolean status){
        setLight(status, 100, "White");
    }

    public void setLight(boolean status, int brightness){
        setLight(status, brightness, "White");
    }
    
    public void setLight(boolean status, int brightness, String color){
        this.isOn = status;
        if(status){
            if(brightness>100){
                this.brightness = 100;
            }
            else if(brightness<0){
                this.brightness = 0;
            }else{
                this.brightness = brightness;
            }
            this.color = color;
        }else{
            this.brightness = 0;
            this.color = "White";
        }
    }

    public void printStatus(){
        if(isOn){
            System.out.println("Light Status: ON | Brightness: "+brightness+"% | Color: "+ color);
        }
        else{
            System.out.println("Light Status: OFF | Brightness: "+brightness+"% | Color: "+ color );
        }
    }
}

public class HomeSystem{
    public static void main(String[] args) {
        SmartLight livingRoom = new SmartLight(false, 0, "White");

        livingRoom.setLight(true);
        livingRoom.printStatus();
        
        livingRoom.setLight(true, 50);
        livingRoom.printStatus();

        livingRoom.setLight(true, 100, "Red");
        livingRoom.printStatus();

        livingRoom.setLight(false, 150, "Red");
        livingRoom.printStatus();

    }
}
