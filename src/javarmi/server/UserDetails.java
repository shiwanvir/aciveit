/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi.server;

import java.io.Serializable;

/**
 *
 * @author intern1
 */
public class UserDetails implements Serializable {
   private  String profession;
    private   String  ageRange;
    private   String gender;
    private   String incomeRange;
    private   String expenceRange;
    private   String gaolType;
    private   String gaolValueRange;
    private   String luckyPersentage;
    private   String workHourRange;
       private String SleapHourRange;
       private String NoofDependent;
       private String expectedAchivingdDuration;

    public String getExpenceRange() {
        return expenceRange;
    }

    public void setExpenceRange(String expenceRange) {
        this.expenceRange = expenceRange;
    }

    public String getGaolType() {
        return gaolType;
    }

    public void setGaolType(String gaolType) {
        this.gaolType = gaolType;
    }

    public String getGaolValueRange() {
        return gaolValueRange;
    }

    public void setGaolValueRange(String gaolValueRange) {
        this.gaolValueRange = gaolValueRange;
    }

    public String getLuckyPersentage() {
        return luckyPersentage;
    }

    public void setLuckyPersentage(String luckyPersentage) {
        this.luckyPersentage = luckyPersentage;
    }

    public String getWorkHourRange() {
        return workHourRange;
    }

    public void setWorkHourRange(String workHourRange) {
        this.workHourRange = workHourRange;
    }

    public String getSleapHourRange() {
        return SleapHourRange;
    }

    public void setSleapHourRange(String SleapHourRange) {
        this.SleapHourRange = SleapHourRange;
    }

    public String getNoofDependent() {
        return NoofDependent;
    }

    public void setNoofDependent(String NoofDependent) {
        this.NoofDependent = NoofDependent;
    }

    public String getExpectedAchivingdDuration() {
        return expectedAchivingdDuration;
    }

    public void setExpectedAchivingdDuration(String expectedAchivingdDuration) {
        this.expectedAchivingdDuration = expectedAchivingdDuration;
    }


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIncomeRange() {
        return incomeRange;
    }

    public void setIncomeRange(String incomeRange) {
        this.incomeRange = incomeRange;
    }
    
}
