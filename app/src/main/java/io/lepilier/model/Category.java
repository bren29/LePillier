package io.lepilier.model;

/**
 * Created by Nicolas on 19/04/2016.
 */
public class Category {
    private int idCategory;
    private int labelCategory;

    public Category(int idCategory, int labelCategory) {
        this.idCategory = idCategory;
        this.labelCategory = labelCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getLabelCategory() {
        return labelCategory;
    }

    public void setLabelCategory(int labelCategory) {
        this.labelCategory = labelCategory;
    }
}

