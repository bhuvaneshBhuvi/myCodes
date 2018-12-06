import java.util.Scanner;
public class DescendingOrderCharacters{
    public char[] convertToArray(String str){
        char[] stringArray = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            stringArray[i]=str.charAt(i);
        }
        return stringArray;
    }
    public int computeUniqueEntriesLength(char[] array){
        int count=0;
        for(int i=0; i<array.length-1; i++){
            if(array[i]!='$'){
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    count++;
                    array[j]='$';
                }
            }
            }
        }
        return (array.length-count);
    }
    public int[][] constructCharacterCountArray(char[] word, int length){
        int[][] charactercountArray = new int[length][2];
        int k=0;
        for(int i=0; i<word.length; i++){
            if(word[i]!='$'){            
                int count=1;
                for(int j=i+1; j<word.length; j++){
                    if(word[i]==word[j]){
                        count++;
                        word[j]='$';
                    }
                }
                charactercountArray[k][0] = word[i];
                charactercountArray[k++][1] = count;
            }
        }
        return charactercountArray;
    }
    public void swap(int[][] array, int row1, int col1, int row2, int col2){
        int temp = array[row1][col1];
        array[row1][col1] = array[row2][col2];
        array[row2][col2] = temp;
    }
    public void sortDescending(int[][] array, int length){
        for(int i=0; i<length-1; i++){
            boolean swap=false;
            for(int j=0; j<length-i-1; j++){
                if(array[j][1]<array[j+1][1]){
                    swap(array, j, 1, j+1, 1);
                    swap(array, j, 0, j+1, 0);
                    swap = true;
                }
            }
            if(swap == false)
                return;
        }
    }
    public void print(int[][] array, int length){
        for(int i=0; i<length; i++){
            System.out.print((char)array[i][0]);
        }
    }
    public void print(char[] array, int length){
        for(int i=0; i<length; i++){
            System.out.println(array[i]);
        }
    }
    public void printWithCount(int[][] array, int length){
        for(int i=0; i<length; i++){
            System.out.print((char)array[i][0]);
            System.out.println(array[i][1]);
            
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DescendingOrderCharacters object = new DescendingOrderCharacters();
        String str = scan.next();
        scan.close();
        char[] stringArray = object.convertToArray(str);
        char[] dupStringArray = object.convertToArray(str);
        int uniqueLength = object.computeUniqueEntriesLength(dupStringArray);
        int[][] characterArrayCount = object.constructCharacterCountArray(stringArray, uniqueLength);   
        object.sortDescending(characterArrayCount, uniqueLength);
        object.print(characterArrayCount, uniqueLength);
    }
}