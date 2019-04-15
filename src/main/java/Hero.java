public class Hero {
    private String mHeroName;
    private int mHeroAge;
    private String mSpecialPower;
    private String mWeakness;

    public Hero(String heroName, int heroAge, String specialPower, String weakness ) {
        mHeroName = heroName;
        mHeroAge = heroAge;
        mSpecialPower = specialPower;
        mWeakness = weakness;
    }

    public String getheroName(){
    return mHeroName;
    }

    public int getheroAge(){
    return mHeroAge;
    }

    public String getspecialPower(){
    return mSpecialPower;
    }
}