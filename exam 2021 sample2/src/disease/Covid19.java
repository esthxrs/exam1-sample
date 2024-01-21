package disease;

import util.R0;
import util.SevereLevel;

public class Covid19 {
    private R0 reproductionNumber;
    private String countryOfFirstAppearance;

    public Covid19 (){

    }

    public SevereLevel severeLevel(boolean isVaccinated){

    }

    public int minimumInfectionSpread (int n){

    }

    public String toString(){
        return "Covid19";
    }

    public R0 getReproductionNumber() {
        return reproductionNumber;
    }

    public void setReproductionNumber(R0 reproductionNumber) {
        this.reproductionNumber = reproductionNumber;
    }

    public String getCountryOfFirstAppearance() {
        return countryOfFirstAppearance;
    }

    public void setCountryOfFirstAppearance(String countryOfFirstAppearance) {
        this.countryOfFirstAppearance = countryOfFirstAppearance;
    }
}
