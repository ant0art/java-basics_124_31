package itmo.java.basics.lesson3;

import java.time.LocalDate;

/**
 * Make new object House
 */
public class House {
    private int stageQua;
    private int yearConstruct;
    private String name;

    public int getStageQua() {
        return stageQua;
    }

    public void setStageQua(int stageQua) {
        this.stageQua = stageQua;
    }

    public int getYearConstruct() {
        return yearConstruct;
    }

    public void setYearConstruct(int yearConstruct) {
        this.yearConstruct = yearConstruct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set known attributes to object House
     *
     * @param stageQua      количество этажей
     * @param yearConstruct год постройки дома
     * @param name          название здания
     */
    public void setHouseAttributes(int stageQua, int yearConstruct, String name) {
        this.stageQua = stageQua;
        this.yearConstruct = yearConstruct;
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "stageQua=" + stageQua +
                ", yearConstruct=" + yearConstruct +
                ", name='" + name + '\'' +
                '}';
    }

    public void getHouseAttributes() {
        System.out.println(this);
    }

    public int getHouseAge() {
        return LocalDate.now().getYear() - this.getYearConstruct();
    }
}
