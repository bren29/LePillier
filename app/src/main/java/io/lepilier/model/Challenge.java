package io.lepilier.model;

import java.util.List;

/**
 * Created by Nicolas on 17/04/2016.
 */
public class Challenge {
    private int idChallenge;
    private int nbStepChallenge;
    private int levelChallenge;
    private int nbUserChallenge;
    private String contentChallenge;
    private String sexeChallenge;
    private Category categoryChallenge;
    private List<Player> listPlayerChallenge;

    public Challenge(int idChallenge, int nbStepChallenge, int levelChallenge, int nbUserChallenge, String contentChallenge, String sexeChallenge, Category categoryChallenge) {
        this.idChallenge = idChallenge;
        this.nbStepChallenge = nbStepChallenge;
        this.levelChallenge = levelChallenge;
        this.nbUserChallenge = nbUserChallenge;
        this.contentChallenge = contentChallenge;
        this.sexeChallenge = sexeChallenge;
        this.categoryChallenge = categoryChallenge;
    }

    public int getIdChallenge() {
        return idChallenge;
    }

    public void setIdChallenge(int idChallenge) {
        this.idChallenge = idChallenge;
    }

    public int getNbStepChallenge() {
        return nbStepChallenge;
    }

    public void setNbStepChallenge(int nbStepChallenge) {
        this.nbStepChallenge = nbStepChallenge;
    }

    public int getLevelChallenge() {
        return levelChallenge;
    }

    public void setLevelChallenge(int levelChallenge) {
        this.levelChallenge = levelChallenge;
    }

    public int getNbUserChallenge() {
        return nbUserChallenge;
    }

    public void setNbUserChallenge(int nbUserChallenge) {
        this.nbUserChallenge = nbUserChallenge;
    }

    public String getContentChallenge() {
        return contentChallenge;
    }

    public void setContentChallenge(String contentChallenge) {
        this.contentChallenge = contentChallenge;
    }

    public String getSexeChallenge() {
        return sexeChallenge;
    }

    public void setSexeChallenge(String sexeChallenge) {
        this.sexeChallenge = sexeChallenge;
    }

    public Category getCategoryChallenge() {
        return categoryChallenge;
    }

    public void setCategoryChallenge(Category categoryChallenge) {
        this.categoryChallenge = categoryChallenge;
    }

    public List<Player> getListPlayerChallenge() {
        return listPlayerChallenge;
    }

    public void setListPlayerChallenge(List<Player> listPlayerChallenge) {
        this.listPlayerChallenge = listPlayerChallenge;
    }
}
