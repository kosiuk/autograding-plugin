package io.jenkins.plugins.quality.core;


public class Configuration {

    private int maxScore;
    /**
     * Default configs
     */
    private String defaultCheck;
    private boolean dtoCheck;
    private String dkindOfGrading;
    private int weightError;
    private int weightHigh;
    private int weightNormal;
    private int weightLow;

    /**
     * PIT configs
     */
    private String pitCheck;
    private boolean ptoCheck;
    private String pkindOfGrading;
    private int weightMutations;
    private int weightUndetected;
    private float weightPercentUndetected;

    /**
     * code-coverage configs
     */
    private String cocoCheck;
    private boolean ctoCheck;
    private String ckindOfGrading;
    private int weightCovered;
    private int weightMissed;

    /**
     * junit configs
     */
    private String junitCheck;
    private boolean jtoCheck;
    private String jkindOfGrading;
    private int weightSkipped;
    private int weightfailures;
    private int totalTestsrun;
    private int weightPassed;


    public Configuration() {
        super();
    }

    public String getDefaultCheck() {
        return defaultCheck;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public boolean isDtoCheck() {
        return dtoCheck;
    }

    public String getDkindOfGrading() {
        return dkindOfGrading;
    }

    public int getWeightError() {
        return weightError;
    }

    public int getWeightHigh() {
        return weightHigh;
    }

    public int getWeightNormal() {
        return weightNormal;
    }

    public int getWeightLow() {
        return weightLow;
    }

    public String getPitCheck() {
        return pitCheck;
    }

    public boolean isPtoCheck() {
        return ptoCheck;
    }

    public String getPkindOfGrading() {
        return pkindOfGrading;
    }

    public int getWeightMutations() {
        return weightMutations;
    }

    public int getWeightUndetected() {
        return weightUndetected;
    }

    public float getWeightPercentUndetected() {
        return weightPercentUndetected;
    }

    public String getCocoCheck() {
        return cocoCheck;
    }

    public boolean isCtoCheck() {
        return ctoCheck;
    }

    public String getCkindOfGrading() {
        return ckindOfGrading;
    }

    public int getWeightCovered() {
        return weightCovered;
    }

    public int getWeightMissed() {
        return weightMissed;
    }

    public String getJunitCheck() {
        return junitCheck;
    }

    public boolean isJtoCheck() {
        return jtoCheck;
    }

    public String getJkindOfGrading() {
        return jkindOfGrading;
    }

    public int getWeightSkipped() {
        return weightSkipped;
    }

    public int getWeightfailures() {
        return weightfailures;
    }

    public int getTotalTestsrun() {
        return totalTestsrun;
    }

    public int getWeightPassed() {
        return weightPassed;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public void setDefaultCheck(String defaultCheck) {
        this.defaultCheck = defaultCheck;
    }

    public void setDtoCheck(boolean dtoCheck) {
        this.dtoCheck = dtoCheck;
    }

    public void setDkindOfGrading(String dkindOfGrading) {
        this.dkindOfGrading = dkindOfGrading;
    }

    public void setWeightError(int weightError) {
        this.weightError = weightError;
    }

    public void setWeightHigh(int weightHigh) {
        this.weightHigh = weightHigh;
    }

    public void setWeightNormal(int weightNormal) {
        this.weightNormal = weightNormal;
    }

    public void setWeightLow(int weightLow) {
        this.weightLow = weightLow;
    }

    public void setPitCheck(String pitCheck) {
        this.pitCheck = pitCheck;
    }

    public void setPtoCheck(boolean ptoCheck) {
        this.ptoCheck = ptoCheck;
    }

    public void setPkindOfGrading(String pkindOfGrading) {
        this.pkindOfGrading = pkindOfGrading;
    }

    public void setWeightMutations(int weightMutations) {
        this.weightMutations = weightMutations;
    }

    public void setWeightUndetected(int weightUndetected) {
        this.weightUndetected = weightUndetected;
    }

    public void setWeightPercentUndetected(float weightPercentUndetected) {
        this.weightPercentUndetected = weightPercentUndetected;
    }

    public void setCocoCheck(String cocoCheck) {
        this.cocoCheck = cocoCheck;
    }

    public void setCtoCheck(boolean ctoCheck) {
        this.ctoCheck = ctoCheck;
    }

    public void setCkindOfGrading(String ckindOfGrading) {
        this.ckindOfGrading = ckindOfGrading;
    }

    public void setWeightCovered(int weightCovered) {
        this.weightCovered = weightCovered;
    }

    public void setWeightMissed(int weightMissed) {
        this.weightMissed = weightMissed;
    }

    public void setJunitCheck(String junitCheck) {
        this.junitCheck = junitCheck;
    }

    public void setJtoCheck(boolean jtoCheck) {
        this.jtoCheck = jtoCheck;
    }

    public void setJkindOfGrading(String jkindOfGrading) {
        this.jkindOfGrading = jkindOfGrading;
    }

    public void setWeightSkipped(int weightSkipped) {
        this.weightSkipped = weightSkipped;
    }

    public void setWeightfailures(int weightfailures) {
        this.weightfailures = weightfailures;
    }

    public void setTotalTestsrun(int totalTestsrun) {
        this.totalTestsrun = totalTestsrun;
    }

    public void setWeightPassed(int weightPassed) {
        this.weightPassed = weightPassed;
    }
}
