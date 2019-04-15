import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String mHeroName;
    private int mHeroAge;
    private String mSpecialPower;
    private String mWeakness;
    private static List<Hero> heroInstances = new ArrayList<Hero>();
    private int mId;

    public Hero(String heroName, int heroAge, String specialPower, String weakness) {
        mHeroName = heroName;
        mHeroAge = heroAge;
        mSpecialPower = specialPower;
        mWeakness = weakness;
        heroInstances.add(this);
        mId = heroInstances.size();
    }

    public String getheroName() {
        return mHeroName;
    }

    public int getheroAge() {
        return mHeroAge;
    }

    public String getspecialPower() {
        return mSpecialPower;
    }

    public String getweakness() {
        return mWeakness;
    }

    public static List<Hero> getAll() {
        return heroInstances;
    }

    public static void clear(){
    heroInstances.clear();
    }

    public int getmId(){
    return mId;
    }
}