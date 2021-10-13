package com.bullhornsdk.data.model.entity.core.onboarding;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

/**
 * Created by mkesmetzis 24-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"onboardingDocumentReceivedCount", "onboardingDocumentSentCount"})
public class OnboardingReceivedSent extends AbstractEntity {

    private Integer onboardingDocumentReceivedCount;

    private Integer onboardingDocumentSentCount;

    public OnboardingReceivedSent() {
    }

    public Integer getOnboardingDocumentReceivedCount() {
        return onboardingDocumentReceivedCount;
    }

    public void setOnboardingDocumentReceivedCount(Integer onboardingDocumentReceivedCount) {
        this.onboardingDocumentReceivedCount = onboardingDocumentReceivedCount;
    }

    public Integer getOnboardingDocumentSentCount() {
        return onboardingDocumentSentCount;
    }

    public void setOnboardingDocumentSentCount(Integer onboardingDocumentSentCount) {
        this.onboardingDocumentSentCount = onboardingDocumentSentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnboardingReceivedSent that = (OnboardingReceivedSent) o;
        return Objects.equals(onboardingDocumentReceivedCount, that.onboardingDocumentReceivedCount) &&
            Objects.equals(onboardingDocumentSentCount, that.onboardingDocumentSentCount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(onboardingDocumentReceivedCount, onboardingDocumentSentCount);
    }

    @Override
    public String toString() {
        return "OnboardingReceivedSent{" +
            "onboardingDocumentReceivedCount=" + onboardingDocumentReceivedCount +
            ", onboardingDocumentSentCount=" + onboardingDocumentSentCount +
            '}';
    }
}
