package io.jenkins.plugins.grading;

import io.jenkins.plugins.coverage.targets.Ratio;

/**
 * Computes the {@link Score} impact of code coverage results. These results are obtained by inspecting a {@link
 * CoverageConfiguration} instance of the Code Coverage API plugin.
 *
 * @author Eva-Maria Zeintl
 */
@SuppressWarnings("PMD.DataClass")
public class CoverageScore {
    private final String name;

    private final int totalImpact;

    private final int coveredSize;
    private final int missedSize;

    /**
     * Creates a new {@link CoverageScore} instance.
     *
     * @param type
     *         coverage type (like line or branch coverage)
     * @param configuration
     *         the grading configuration
     * @param ratio
     *         the coverage ratio
     */
    public CoverageScore(final String type, final CoverageConfiguration configuration, final Ratio ratio) {
        this.name = type;

        this.coveredSize = ratio.getPercentage();
        this.missedSize = 100 - ratio.getPercentage();

        totalImpact = computeImpact(configuration);
    }

    private int computeImpact(final CoverageConfiguration configuration) {
        int change = 0;

        change = change + configuration.getMissedImpact() * missedSize;
        change = change + configuration.getCoveredImpact() * coveredSize;

        return change;
    }

    public String getName() {
        return name;
    }

    public int getTotalImpact() {
        return totalImpact;
    }

    public int getCoveredSize() {
        return coveredSize;
    }

    public int getMissedSize() {
        return missedSize;
    }
}
