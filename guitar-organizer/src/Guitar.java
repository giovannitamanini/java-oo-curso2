public class Guitar extends MusicalInstrument{

    private int numberOfStrings;
    private String typeOfBridge;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getTypeOfBridge() {
        return typeOfBridge;
    }

    public void setTypeOfBridge(String typeOfBridge) {
        this.typeOfBridge = typeOfBridge;
    }
}