package farm;

import animals.Cow;
import animals.Horse;
import animals.Sheep;

import java.util.Arrays;

public class Farm  {
    private String adress;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;
    private String ownerName;

    public Farm() {
    }

    public Farm(String adress, Cow[] cows, Horse[] horses, Sheep[] sheeps, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.ownerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "\tFarm\n" +
                "adress: " + adress +
                "\n\tcows: " + Arrays.toString(cows) +
                "\n\thorses: " + Arrays.toString(horses) +
                "\n\tsheeps: " + Arrays.toString(sheeps) +
                "\nownerName: " + ownerName ;
    }
}
