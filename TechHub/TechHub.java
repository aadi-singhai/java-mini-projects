 interface Rechargeble {
    void charge(int minutes);
    int getBatteryLevel = 0;
    
}
 interface Diagnosable {
    void runDiagnostics();
    
}

class Smartphone implements Rechargeble, Diagnosable{
    private int batteryLevel;
    private int chargeRatePerMinute;

    public Smartphone(int startingBattery, int chargeRate) {
        batteryLevel = startingBattery;
        chargeRatePerMinute=chargeRate;
    }
    @Override
    public void charge(int minutes) {
        batteryLevel += minutes*chargeRatePerMinute;
        if(batteryLevel > 100){
            batteryLevel = 100;
        }
        System.out.println("Smartphone charged for "+minutes+" mins. Battery: "+batteryLevel+"%");
    }
    @Override
    public void runDiagnostics() {
        System.out.println("Smartphone Diagnostics: Screen OK. Battery at "+batteryLevel+"%");
    }
    
}


class ElectricCar implements Rechargeble, Diagnosable{
    private int batteryLevel; 
    private int chargeRatePerMinute;
    private boolean isFastChargerPluggedIn;

    public ElectricCar(int startingBattery, boolean fastCharge) {
        batteryLevel = startingBattery;
        isFastChargerPluggedIn = fastCharge;
    }

    @Override
    public void charge(int minutes) {
        if(isFastChargerPluggedIn){
            chargeRatePerMinute = 5;
        }
        else{
            chargeRatePerMinute = 1;
        }

        batteryLevel += minutes*chargeRatePerMinute;

        if(batteryLevel>100){
            batteryLevel = 100;
        }
        System.out.println("EV charged for "+minutes+" mins. Battery: "+batteryLevel+"%");
    }

    @Override
    public void runDiagnostics() {
        if(isFastChargerPluggedIn){
            System.out.println("EV Diagnostics: Engine OK. Fast Charging Capable: True");
        }
        else{
            System.out.println("EV Diagnostics: Engine OK. Fast Charging Capable: False");
        }
       
    }
}

public class TechHub {
    public static void main(String[] args){
        System.out.println("Initiating Tech Hub...\n");
        Rechargeble[] device = new Rechargeble[2];
        device[0] = new Smartphone(20, 5);
        device[1] = new ElectricCar(30, false);

        for(int i = 0; i < 2 ; i++){
            device[i].charge(10);
            if (device[i] instanceof Diagnosable) {
                Diagnosable diagDevice = (Diagnosable) device[i];
                diagDevice.runDiagnostics();
            }
        }
    }
}
