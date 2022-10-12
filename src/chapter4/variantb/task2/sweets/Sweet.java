package chapter4.variantb.task2.sweets;

import java.math.BigDecimal;

public abstract class Sweet {
    protected String name;
    protected BigDecimal weight;
    protected BigDecimal sugarContent;

    public Sweet(String name, BigDecimal weight, BigDecimal sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarContent=" + sugarContent +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(BigDecimal sugarContent) {
        this.sugarContent = sugarContent;
    }
}
