public class Abhaengigkeit implements AbhaengigkeitIF {

    public String[][] abhaengigkeit;

    public Abhaengigkeit(String[][] s1){
        abhaengigkeit = s1;
    }

    public boolean isWellSorted( String[] sequence){

        for(int i=0; i<sequence.length; i++){
            String aktuell = sequence[i];
            for(int j=0; j<abhaengigkeit.length; j++){
                if(aktuell.equals(abhaengigkeit[j][1])){
                    for(int k=i+1; k<sequence.length;k++){
                        if(sequence[k].equals(abhaengigkeit[j][0])){
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }

}