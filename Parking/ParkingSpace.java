
public class ParkingSpace
{
    private int spaceNum;
    private char floor;
    private boolean isCompact, isOccupied;
    public ParkingSpace(int x, char y, boolean Compactcheck)
    {
        spaceNum = x;
        floor = y;
        isOccupied = false;
        isCompact = Compactcheck;
    }
    public int getSpaceNum(){
        return spaceNum;
    }
    public char getFloor(){
        return floor;
    }
    public boolean getCompact(){
        return isCompact;
    }
    public boolean getOccupied(){
        return isOccupied;
    }
    public void setOccupied(boolean changer){
        isOccupied = changer;
    }
    public String toString(){
        if(isCompact == true && isOccupied == true){
            return(floor + spaceNum + " (C X)");
        }else if(isCompact == false && isOccupied == true){
            return(floor + spaceNum + " (N X)");
        }else if(isCompact == true && isOccupied == false){
            return(floor + spaceNum + " (C O)");
        }else{
            return(floor + spaceNum + " (N O)");
        }
    }
}
