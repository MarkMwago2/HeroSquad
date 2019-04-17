import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String mSquadName;
    private int mSquadsize;
    private String mSquadCause;
    private static List<Squad> instances = new ArrayList<>();
    private int mId;
    private List<Hero> mHeros;

    public Squad(String squadName, int squadSize, String squadCause ){
        mSquadName = squadName;
        mSquadsize = squadSize;
        mSquadCause = squadCause;
        instances.add(this);
        mId = instances.size();
        mHeros = new ArrayList<Hero>();

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

    public static List<Squad> all() {

        return instances;
    }

    public int getmId() {

        return mId;
    }

    public static Squad find(int id) {
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public static void clear()
    {
        instances.clear();
    }
    public List<Hero> getHeroes() {

        return mHeros;
    }
    public void addHero(Hero hero) {
        mHeros.add(hero);
    }
}






