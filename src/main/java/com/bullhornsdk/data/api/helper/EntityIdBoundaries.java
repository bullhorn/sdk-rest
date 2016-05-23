package com.bullhornsdk.data.api.helper;

/**
 * Entity id boundaries
 *
 */
public class EntityIdBoundaries {

    private Integer min;
    private Integer max;
    private Class entityClass;

    public EntityIdBoundaries(){

    }

    public EntityIdBoundaries(Integer min, Integer max, Class entityClass) {
        this.min = min;
        this.max = max;
        this.entityClass = entityClass;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Class getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public String toString() {
        return "Entity id range [" + min + " - " + max + "] for " + entityClass.getSimpleName();
    }
}
