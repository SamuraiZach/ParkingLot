import java.util.Arrays;
public class ParkingLot
{
    private int numSpaces, numFloors;
    private ParkingSpace[] parkingLot;
    public ParkingLot(int spaces, int floor)
    {
        numSpaces = spaces;
        numFloors = floor;
        int totalfloors = spaces * floor;
        parkingLot = new ParkingSpace[totalfloors];
        int countForSpaces = 1;
        int countForFloors = 1;
        boolean Compact4 = true;
        char floorLetter = 'A';
        for(int i = 0; i < totalfloors; i++){
            if(countForSpaces >= spaces){
                countForSpaces = 0;
                countForFloors += 1;
            }
            if(countForSpaces <= 4){
                Compact4 = true;
            }
            else if(countForSpaces > 4){
                Compact4 = false;
            }
            switch(countForFloors){
                case 1:
                    floorLetter = 'A';
                    break;
                case 2:
                    floorLetter = 'B';
                    break;
                case 3:
                    floorLetter = 'C';
                    break;
                case 4:
                    floorLetter = 'D';
                    break;
                case 5:
                    floorLetter = 'E';
                    break;
                case 6:
                    floorLetter = 'F';
                    break;
                case 7:
                    floorLetter = 'G';
                    break;
                case 8:
                    floorLetter = 'H';
                    break;
                case 9:
                    floorLetter = 'I';
                    break;
                case 10:
                    floorLetter = 'J';
                    break;
                case 11:
                    floorLetter = 'K';
                    break;
                case 12:
                    floorLetter = 'L';
                    break;
                case 13:
                    floorLetter = 'M';
                    break;
                case 14:
                    floorLetter = 'N';
                    break;
                case 15:
                    floorLetter = 'O';
                    break;
                case 16:
                    floorLetter = 'P';
                    break;
                case 17:
                    floorLetter = 'Q';
                    break;
                case 18:
                    floorLetter = 'R';
                    break;
                case 19:
                    floorLetter = 'S';
                    break;
                case 20:
                    floorLetter = 'T';
                    break;
                case 21:
                    floorLetter = 'U';
                    break;
                case 22:
                    floorLetter = 'V';
                    break;
                case 23:
                    floorLetter = 'W';
                    break;
                case 24: 
                    floorLetter = 'X';
                    break;
                case 25:
                    floorLetter = 'Y';
                    break;
                case 26:
                    floorLetter = 'Z';
                    break;
            
                    
            }
            parkingLot[i] = new ParkingSpace(countForSpaces, floorLetter, Compact4);
            countForSpaces += 1;
        }
    }
    public void leaveLot(Object o){
        for(int j = 0; j < (numSpaces*numFloors); j++){
            if(parkingLot[j] == o){
                parkingLot[j].setOccupied(false);
                break;
            }
        }
    }
    public void enterLot(boolean Compact){
        for(int h = 0; h < (numSpaces*numFloors); h++){
            if(parkingLot[h].getOccupied() == false && Compact == parkingLot[h].getCompact()){
                parkingLot[h].setOccupied(true);
                break;
            }
        }
    }
}
