package io.jenkins.plugins.grading;

import edu.hm.hafner.analysis.Severity;

import net.sf.json.JSONObject;

/**
 * Configuration to grade static analysis results.
 *
 * @author Ullrich Hafner
 */
@SuppressWarnings("PMD.DataClass")
public class AnalysisConfiguration extends Configuration {
    private int errorImpact;
    private int highImpact;
    private int normalImpact;
    private int lowImpact;

    /**
     * Converts the specified JSON object to a new instance if {@link AnalysisConfiguration}.
     *
     * @param json
     *         the json object to convert
     *
     * @return the corresponding {@link AnalysisConfiguration} instance
     */
    public static AnalysisConfiguration from(final JSONObject json) {
        return (AnalysisConfiguration) JSONObject.toBean(json, AnalysisConfiguration.class);
    }

    /**
     * Creates a configuration that suppresses the grading.
     */
    public AnalysisConfiguration() {
        this(0, 0, 0, 0, 0);
    }

    private AnalysisConfiguration(final int maxScore,
            final int errorImpact, final int highImpact, final int normalImpact, final int lowImpact) {
        super(maxScore);

        this.errorImpact = errorImpact;
        this.highImpact = highImpact;
        this.normalImpact = normalImpact;
        this.lowImpact = lowImpact;
    }

    public int getErrorImpact() {
        return errorImpact;
    }

    @SuppressWarnings("unused") // Required for JSON conversion
    public void setErrorImpact(final int errorImpact) {
        this.errorImpact = errorImpact;
    }

    public int getHighImpact() {
        return highImpact;
    }

    @SuppressWarnings("unused") // Required for JSON conversion
    public void setHighImpact(final int highImpact) {
        this.highImpact = highImpact;
    }

    public int getNormalImpact() {
        return normalImpact;
    }

    @SuppressWarnings("unused") // Required for JSON conversion
    public void setNormalImpact(final int weightNormal) {
        this.normalImpact = weightNormal;
    }

    @SuppressWarnings("unused") // Required for JSON conversion
    public void setLowImpact(final int lowImpact) {
        this.lowImpact = lowImpact;
    }

    public int getLowImpact() {
        return lowImpact;
    }

    /**
     * Builder to create a {@link AnalysisConfiguration} instance.
     */
    public static class AnalysisConfigurationBuilder extends ConfigurationBuilder {
        private int errorImpact;
        private int highImpact;
        private int normalImpact;
        private int lowImpact;

        @Override
        public AnalysisConfigurationBuilder setMaxScore(final int maxScore) {
            return (AnalysisConfigurationBuilder) super.setMaxScore(maxScore);
        }

        /**
         * Sets the number of points to increase or decrease the score if a warning with {@link Severity#ERROR} has been detected.
         *
         * @param errorImpact
         *         number of points to increase or decrease the score if a warning with {@link Severity#ERROR} has been detected
         *
         * @return this
         */
        public AnalysisConfigurationBuilder setErrorImpact(final int errorImpact) {
            this.errorImpact = errorImpact;
            return this;
        }

        /**
         * Sets the number of points to increase or decrease the score if a warning with {@link Severity#WARNING_HIGH} has been detected.
         *
         * @param highImpact
         *         number of points to increase or decrease the score if a warning with {@link Severity#WARNING_HIGH} has been detected
         *
         * @return this
         */
        public AnalysisConfigurationBuilder setHighImpact(final int highImpact) {
            this.highImpact = highImpact;
            return this;
        }

        /**
         * Sets the number of points to increase or decrease the score if a warning with {@link Severity#WARNING_NORMAL} has been detected.
         *
         * @param normalImpact
         *         number of points to increase or decrease the score if a warning with {@link Severity#WARNING_NORMAL} has been detected
         *
         * @return this
         */
        public AnalysisConfigurationBuilder setNormalImpact(final int normalImpact) {
            this.normalImpact = normalImpact;
            return this;
        }

        /**
         * Sets the number of points to increase or decrease the score if a warning with {@link Severity#WARNING_LOW} has been detected.
         *
         * @param weightLow
         *         number of points to increase or decrease the score if a warning with {@link Severity#WARNING_LOW} has been detected
         *
         * @return this
         */
        public AnalysisConfigurationBuilder setLowImpact(final int weightLow) {
            this.lowImpact = weightLow;
            return this;
        }

        /**
         * Creates a new instance of {@link AnalysisConfiguration} using the configured properties.
         *
         * @return the created instance
         */
        public AnalysisConfiguration build() {
            return new AnalysisConfiguration(getMaxScore(), errorImpact, highImpact, normalImpact, lowImpact);
        }
    }
}
