import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String mSquadName;
    private int mSquadsize;
    private String mSquadCause;

    public Squad(String squadName, int squadSize, String squadCause ){
        mSquadName = squadName;
        mSquadsize = squadSize;
        mSquadCause = squadCause;

    }
    public String getsquadName(){
        return mSquadName;
    }

    public int getsquadSize(){
    return mSquadsize;

    }

    public String getsquadCause(){
    return mSquadCause;
    }
}





